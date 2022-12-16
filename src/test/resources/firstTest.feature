Feature: Web Login

  Scenario: Login with Valid Credentials
    Given User is on login Page
    When User enters valid username and Password
    And Clicks on login button
    Then User successfully logs in