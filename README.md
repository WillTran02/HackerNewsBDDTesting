# HackerNews BDD Testing

Welcome to my repository for testing the Hacker News website using BDD techniques! In order to have the repo functioning for yourself and to view the testing in action, you must do the following:

1. Download your own Web Browser Driver (I used Chrome in my code, and the driver was downloaded from <a href="https://chromedriver.chromium.org/downloads">here</a>). You may need to research which driver is appropriate for your own browser of choice.
2. Put your desired driver of choice into <a href="src/test/resources">here</a> (not inside the features directory, but inside the resources directory).
3. Navigate to <a href="src/test/java/com/sparta/wt/hackernews_tests/stepdefs/HNBeforeAfterHooks.java">here</a> and make sure to change the line "System.setProperty(...);" and the "driver = new ChromeDriver();" line to match up with your own driver of choice.
4. Finally, navigate to <a href="src/test/resources/features">here</a> and run tests from the feature files! New tests can also be created to populate more possibilities for testing the site. The currently available tests are a demonstration of how the testing looks and is run by the user.
