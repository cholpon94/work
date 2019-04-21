package com.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
	@CucumberOptions (
			
			tags = "@chopa",
			features = "src/test/resources/feature",
			glue = "com/StepDefinitions",
			dryRun =  false,
			plugin =  {
					"json:target/cucumber.json",
					"pretty"
			}
	)
	
	public class CukesRunner{

}
