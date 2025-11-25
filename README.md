# Selenium Web UI Automation Framework

[![Build Status](https://github.com/mustafammn/selenium-web-ui-automation-framework/actions/workflows/ci.yml/badge.svg)](https://github.com/mustafammn/selenium-web-ui-automation-framework/actions/workflows/ci.yml)
![Java](https://img.shields.io/badge/Java-17-blue)
![Maven](https://img.shields.io/badge/Maven-3.x-orange)
![Tests](https://img.shields.io/badge/Reports-Cucumber%20HTML-brightgreen)

A reusable, plug-and-play **Selenium Web UI Automation Framework** built using:
- Java 17
- Selenium WebDriver 4
- Cucumber BDD
- JUnit 4
- WebDriverManager
- Maven
- HTML Test Reporting
- GitHub Actions CI/CD

This framework works with **any web application** and is structured using Page Object Model (POM) with clean BDD design.

---

## 🚀 Features
- Clean Page Object Model (POM)
- Cucumber BDD with readable scenarios
- JUnit 4 stable runner
- Config-driven test environment
- Automatic ChromeDriver setup via WebDriverManager
- HTML test reports
- CI/CD ready with GitHub Actions
- Fully extendable for parallel execution, Allure reports, and cross-browser testing

---

## 📂 Project Structure

selenium-web-ui-automation-framework
├── pom.xml
├── README.md
└── src
└── test
├── java
│ ├── config
│ ├── driver
│ ├── pages
│ ├── steps
│ └── runners
└── resources
├── config.properties
└── features

yaml
Copy code

---

## ⚙️ Configuration

Configuration file:

`src/test/resources/config.properties`

Example:

```properties
base.url=https://www.saucedemo.com/
browser=chrome
implicit.wait=10
page.load.timeout=20
▶️ Running Tests
Run via Maven
bash
Copy code
mvn clean test
Run via IntelliJ
Open LoginTestRunner.java

Right-click → Run

📊 Test Reports
After test execution, open:

bash
Copy code
target/cucumber-report.html
Right-click → Open in Browser (Chrome/Safari/Edge)

🤖 GitHub Actions CI/CD
Workflow: .github/workflows/ci.yml

Automatically:

Runs tests on push & pull requests

Archives the HTML report as an artifact

Shows build status via badge

🛠 Tech Stack
Layer	Technology
Language	Java 17
UI Automation	Selenium WebDriver 4
BDD	Cucumber JVM
Runner	JUnit 4
Build Tool	Maven
Driver Mgmt	WebDriverManager
CI/CD	GitHub Actions

👤 Author
Mustafa Nooristani
Senior QA Automation Engineer
