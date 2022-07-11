Feature: As a user, I want to be able to use the search function so that I can find specific results

  Scenario: Search for the term "git"
    Given I am on the homepage
    When I enter git into the search bar
    Then I should be on a query results page for git