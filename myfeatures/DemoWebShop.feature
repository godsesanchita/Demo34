Feature: my validation on webdemoshop

  Background: Launch the demowebshop xx
    Given App is launched by user xx

  Scenario: user access to register on website xx
    Given user clicks on the Register on home page xx
    When user enters valid data in input fields xx
    Then user clicks on register xx

  Scenario Outline: user access to Login xx
    Given User clicks on the Login link on the homepage xx
    When User enters the registered valid username "<uname>" xx
    And Valid Password in respective field "<pswrd>" xx

    Examples: 
      | uname            | pswrd      |
      | drish.dt@gm.com  | 1234567890 |
      | mayuri@gmail.com |     123456 |
