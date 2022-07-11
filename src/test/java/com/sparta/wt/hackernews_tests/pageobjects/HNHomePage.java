package com.sparta.wt.hackernews_tests.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HNHomePage extends AbstractPage {
    public HNHomePage(WebDriver webDriver) {
        this.driver = webDriver;
        driver.get("https://news.ycombinator.com/");
    }
}
