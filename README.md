# Selenium Web UI Automation Framework

[![Build Status](https://github.com/mustafammn/selenium-web-ui-automation-framework/actions/workflows/ci.yml/badge.svg)](https://github.com/mustafammn/selenium-web-ui-automation-framework/actions/workflows/ci.yml)
![Java](https://img.shields.io/badge/Java-17-blue)
![Maven](https://img.shields.io/badge/Maven-3.x-orange)
![Reports](https://img.shields.io/badge/Reports-Cucumber%20HTML-brightgreen)

---

## 🛠 Tech Stack

A plug-and-play **Selenium Web UI Automation Framework** built with:

- **Java 17**
- **Selenium WebDriver 4**
- **Cucumber BDD**
- **JUnit 4**
- **WebDriverManager**
- **Maven**
- **HTML Test Reporting**
- **GitHub Actions CI/CD**

Designed for **any web application**, leveraging Page Object Model (POM) and clean BDD principles.

---

## 🚀 Features

- POM-based test structure
- Cucumber BDD with human-readable scenarios
- JUnit 4 stable runner
- Configurable test environments
- Auto driver management (via WebDriverManager)
- Cucumber HTML test reports
- Ready for CI/CD using GitHub Actions
- Easily extendable for:
  - Parallel execution
  - Allure reporting
  - Cross-browser testing

---

## 📂 Project Structure

```
selenium-web-ui-automation-framework
├── pom.xml
├── README.md
└── src
    └── test
        ├── java
        │   ├── config
        │   ├── driver
        │   ├── pages
        │   ├── steps
        │   └── runners
        └── resources
            ├── config.properties
            └── features
```

---

## ⚙️ Configuration

Main configuration file:

`src/test/resources/config.properties`

Example:
```
base.url=https://www.saucedemo.com/
browser=chrome
implicit.wait=10
page.load.timeout=20
```

---

## ▶️ Running Tests

**Via Maven:**
```sh
mvn clean test
```

**Via IntelliJ:**
Open `LoginTestRunner.java`, right-click → **Run**.

---

## 📊 Test Reports

After execution, reports are available at:
```
target/cucumber-report.html
```
Right-click → Open in Browser.

---

## 🤖 GitHub Actions CI/CD

Workflow configuration:
```
.github/workflows/ci.yml
```

---

## 👤 Author

**Mustafa Nooristani**  
Senior QA Automation Engineer
