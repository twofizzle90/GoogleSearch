Feature: feature to test login functinality

  Scenario: Check login in succesfull with valid credentails
    Given user is on the login page
    When user enters user name and password
    And clicks on login feature
    Then user is navigated to the home page
