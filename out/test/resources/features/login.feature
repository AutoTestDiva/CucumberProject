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

  @wrongPassword
  Scenario Outline:
    Given User launches ChromeBrowser
    When User opens ilcarro Home Page
    And User clicks on Log in link
    And User enters valid email and wrong password
      | email   | password   |
      | <email> | <password> |
    And User clicks on Yalla button
    Then User verifies error message
    And User quites browser
    Examples:
      | email                    | password   |
      | viktor23121950@gmail.com | Pnata19788 |
      | viktor23121950@gmail.com | Pnataaaaa! |
      | viktor23121950@gmail.com | 1234567891 |
      | viktor23121950@gmail.com | !@#$%^&*)! |