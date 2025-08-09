Feature: Login

  @login
  Scenario: Login with valid data
    Given User launches ChromeBrowser
    When User opens ilcarro Home Page
    And User clicks on Log in link
    And User enters valid data
    And User clicks on Yalla button
    Then User verifies log in message is displayed
    And User quites browser

