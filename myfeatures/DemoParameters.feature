Feature: my validation AWS

  Scenario: Validations for Registration in AWS
    Given AWS site is up and launched by user
    Then User provides all the required data
    And Proceeds for the registration

  Scenario Outline: Validation for Login in AWS
    Given Application is launched
    When User enters the registered valid Username "<uname>"
    And Valid Password in respective field "<pswrd>"
    Then Verifies the login status

    Examples: 
      | unamee  | pswrd       |
      | Siddhi  | Password234 |
      | Akash   | Pas4556     |
      | Shivani | Passwrd2345 |
