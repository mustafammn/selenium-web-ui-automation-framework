Feature: Login

  As a valid or invalid user
  I want to log into the application
  So that I can access or be denied access to products

  @smoke
  Scenario: Successful login with valid credentials
    Given I am on the login page
    When I login with username "standard_user" and password "secret_sauce"
    Then I should be redirected to the products page

  Scenario: Login fails with invalid credentials
    Given I am on the login page
    When I login with username "invalid_user" and password "wrong_password"
    Then I should see an error message "Epic sadface: Username and password do not match any user in this service"
