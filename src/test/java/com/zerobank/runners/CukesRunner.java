package com.zerobank.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", //path to features
        //     features = "src/test/resources/features/activities/CalendarEvents.feature", //path to features
        glue = "com/zerobank/stepdefinitions",    //path to step definitions
        dryRun = false, //by default it is false
        tags = "@account_summary",
        plugin = {"html:target/default-cucumber-reports",
                "json:target/cucumber.json"
        }
)

public class CukesRunner {

}
