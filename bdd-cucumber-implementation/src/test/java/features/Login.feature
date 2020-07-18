@LoginTest
Feature: Register Feature

  Scenario: Correct Register Test
    Given I'm going to the register page
    When I'm filling in the username, email, password and confirm password field
    And I click the submit button
    Then I see the home page