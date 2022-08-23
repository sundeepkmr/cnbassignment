package com.cnb.cnbassignment.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features", glue = "com.cnb.cnbassignment.definitions", monochrome = true, plugin = {
		"json:test-output/cucumber_report.json", "html:test-output/cucumber_report.html" }

)
public class CucumberRunnerTest extends AbstractTestNGCucumberTests {

}
