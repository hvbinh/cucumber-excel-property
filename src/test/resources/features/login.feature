Feature: login
  @login
  Scenario: Verify that login successfully
    Given i naviagete to "https://www.saucedemo.com/"
    When i input to username textbox with value "standard_user"
    And i input to password textbox with value "secret_sauce"
    And i click to Login button
    Then the system navigate to Home page
  @login1
  Scenario: Verify that login unsuccessfully
    Given i naviagete to ""
