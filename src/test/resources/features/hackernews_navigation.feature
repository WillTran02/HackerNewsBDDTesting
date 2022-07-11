Feature: As a user, I want to be able to navigate the website so that I can find information

  Background: Starting from the home page
    Given I am on the homepage

  Scenario: Navigating to the comments page
    When I click on comments
    Then I should be on the comments page

  Scenario: Navigating to the past page
    When I click on past
    Then I should be on the past page

  Scenario: Navigating away from and back to the home page
    When I click on comments
    And I click on the logo
    Then I should be on the home page
