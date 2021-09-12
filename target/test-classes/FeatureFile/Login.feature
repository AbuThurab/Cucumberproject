Feature: To check the login functionality of facebook

  Scenario: To check the login functionality with invalid username and password
    Given User need to be in facebook login page
    When User need to enter username and password
    And user need to click login button
    Then User need to get valid message for invalid credentials
