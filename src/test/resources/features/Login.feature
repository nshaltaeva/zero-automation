Feature: Login
  As a user, I want to be able to login into zerobank app under different roles with username and password

  @valid_credentials
  Scenario: Login as only authorized user
    Given user is on the landing page
    Then user logs in
    And user verifies that "Zero - Account Summary" page is displayed

  @negative_test
  Scenario: Verify that warning message is displayed when password is not correct
    Given user is on the landing page
    Then user enters "username" username and "wrong" password
    And user verifies that "Login and/or password are wrong" message is displayed

  @negative_test
  Scenario: Verify that warning message is displayed when username is not correct
    Given user is on the landing page
    Then user enters "wrong" username and "password" password
    And user verifies that "Login and/or password are wrong" message is displayed

  @negative_test
  Scenario: Verify that warning message is displayed when user logs in with blank password
    Given user is on the landing page
    Then user enters "valid" username and " " password
    And user verifies that "Login and/or password are wrong" message is displayed

  @negative_test
  Scenario: Verify that warning message is displayed when user logs in with blank username
    Given user is on the landing page
    Then user enters " " username and "valid" password
    And user verifies that "Login and/or password are wrong" message is displayed

  @negative_test
  Scenario: Verify that warning message is displayed when user logs in with invalid credentials
    Given user is on the landing page
    Then user enters "wrong" username and "wrong" password
    And user verifies that "Login and/or password are wrong" message is displayed


