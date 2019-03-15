package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "resources/features",
				glue= {""},tags= {"@smoketest1","~@smoketest2"},
				dryRun = false,
				monochrome = true, 
				plugin = {"pretty", "html:TestReports", "json:TestReports/cucumber.json", "junit:TestReports/cucumber.xml"}
				
		)

public class testjunitrunner {

}