package steps;

import driver.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.LoginPage;

public class LoginSteps {

    private LoginPage loginPage;

    @Before
    public void setUp() {
        DriverFactory.initDriver();
        loginPage = new LoginPage();
    }

    @After
    public void tearDown() {
        DriverFactory.quitDriver();
    }

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        loginPage.open();
    }

    @When("I login with username {string} and password {string}")
    public void i_login_with_username_and_password(String username, String password) {
        loginPage.login(username, password);
    }

    @Then("I should be redirected to the products page")
    public void i_should_be_redirected_to_the_products_page() {
        String headerText = DriverFactory.getDriver()
                .findElement(By.cssSelector(".title"))
                .getText();

        Assert.assertEquals("Products", headerText);
    }

    @Then("I should see an error message {string}")
    public void i_should_see_an_error_message(String expectedMessage) {
        String actualMessage = loginPage.getErrorMessage();
        Assert.assertEquals(expectedMessage, actualMessage);
    }
}
