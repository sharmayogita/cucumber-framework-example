@tag
Feature: Login Functionality
  I want to use this template for check login functionality

  @tag1
  Scenario: Check Login with valid inputs
    Given i open browser with url "https://money.rediff.com/"
    When I click SignIn button
    Then i should see rediff money Login Page
    When i enter Username as "sharmayogita166@gmail.com"
    And i enter Password as "123@kamlesh"
    And i click submit button
    Then i should see Portfolio page
   	Then i click signout button

 