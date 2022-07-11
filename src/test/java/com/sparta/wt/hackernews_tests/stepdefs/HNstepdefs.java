package com.sparta.wt.hackernews_tests.stepdefs;

import com.sparta.wt.hackernews_tests.pageobjects.AbstractPage;
import com.sparta.wt.hackernews_tests.pageobjects.HNHomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HNstepdefs {
    private final WebDriver driver = HNBeforeAfterHooks.driver;
    private AbstractPage page;
    @Given("I am on the homepage")
    public void iAmOnTheHomepage() {
        page = new HNHomePage(driver);
    }

    @When("I click on comments")
    public void iClickOnComments() {
        page = page.goToCommentsPage();
    }

    @Then("I should be on the comments page")
    public void iShouldBeOnTheCommentsPage() {
        assertEquals("https://news.ycombinator.com/newcomments", page.getThisUrl());
    }

    @When("I click on past")
    public void iClickOnPast() {
        page = page.goToPastPage();
    }

    @Then("I should be on the past page")
    public void iShouldBeOnThePastPage() {
        assertEquals("https://news.ycombinator.com/front", page.getThisUrl());
    }

    @And("I click on the logo")
    public void iClickOnTheLogo() {
        page.goToHomePage();
    }

    @Then("I should be on the home page")
    public void iShouldBeOnTheHomePage() {
        assertEquals("https://news.ycombinator.com/", page.getThisUrl());
    }

    @When("I enter git into the search bar")
    public void iEnterIntoTheSearchBar() {
        page.search("git");
    }

    @Then("I should be on a query results page for git")
    public void iShouldBeOnAQueryResultsPageFor() {
        assertEquals("https://hn.algolia.com/?q=git", page.getThisUrl());
    }

    @Then("There should be thirty items in the feed")
    public void thereShouldBeItemsInTheFeed() {
        int numberOfLinks = page.getTotalNumberOfLinks();
        assertEquals(30, numberOfLinks);
    }
}
