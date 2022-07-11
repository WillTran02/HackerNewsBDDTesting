package com.sparta.wt.hackernews_tests.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public abstract class AbstractPage {
    protected WebDriver driver;
    private final By homePageLink = new By.ByCssSelector("a[href=\"https://news.ycombinator.com\"]");
    private final By commentsLink = new By.ByLinkText("comments");
    private final By pastLink = new By.ByLinkText("past");

    public HNHomePage goToHomePage() {
        driver.findElement(homePageLink).click();
        return new HNHomePage(driver);
    }

    public HNCommentsPage goToCommentsPage() {
        driver.findElement(commentsLink).click();
        return new HNCommentsPage(driver);
    }

    public HNPastPage goToPastPage() {
        driver.findElement(pastLink).click();
        return new HNPastPage(driver);
    }

    public HNSearchPage search(String value) {
        driver.findElement(By.name("q")).sendKeys(value, Keys.ENTER);
        return new HNSearchPage(driver);
    }

    public String getThisUrl() {
        return driver.getCurrentUrl();
    }

    public int getTotalNumberOfLinks() {
        return driver.findElements(By.className("rank")).size();
    }
}
