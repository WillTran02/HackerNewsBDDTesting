package com.sparta.wt.hackernews_tests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.sparta.wt.hackernews_tests.stepdefs",
        plugin = {
                "pretty", "html:target/testReport.html",
                "json:target/jsonReport/json"
        },
        publish = true
)
public class TestRunner { }
