package driver;

import config.ConfigManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * Manages a ThreadLocal WebDriver instance.
 * Allows easy extension to multiple browsers later.
 */
public class DriverFactory {

    private static final ThreadLocal<WebDriver> driverHolder = new ThreadLocal<>();

    public static void initDriver() {
        if (driverHolder.get() == null) {

            String browser = ConfigManager.get("browser");
            WebDriver driver;

            switch (browser.toLowerCase()) {
                case "chrome":
                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(
                    Duration.ofSeconds(ConfigManager.getInt("implicit.wait")));
            driver.manage().timeouts().pageLoadTimeout(
                    Duration.ofSeconds(ConfigManager.getInt("page.load.timeout")));

            driverHolder.set(driver);
        }
    }

    public static WebDriver getDriver() {
        WebDriver driver = driverHolder.get();
        if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized. Call initDriver() first.");
        }
        return driver;
    }

    public static void quitDriver() {
        WebDriver driver = driverHolder.get();
        if (driver != null) {
            driver.quit();
            driverHolder.remove();
        }
    }
}
