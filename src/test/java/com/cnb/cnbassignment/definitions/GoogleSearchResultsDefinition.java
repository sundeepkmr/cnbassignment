package com.cnb.cnbassignment.definitions;

import org.openqa.selenium.WebDriver;

import com.cnb.cnbassignment.factory.DriverManager;
import com.cnb.cnbassignment.pages.GoogleHomePage;
import com.cnb.cnbassignment.pages.GoogleSearchResultsPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchResultsDefinition {
	WebDriver driver;
	GoogleHomePage homePage;
	GoogleSearchResultsPage resultsPage;

	@Before
	public void startDriver() {
		driver = new DriverManager().initializeDriver("https://www.google.com/");
	}

	@After
	public void quitDriver() {
		driver.quit();
	}

	@Given("User is on Google website")
	public void openGoogleWebsite() {
		homePage = new GoogleHomePage(driver);
	}

	@When("User enters search term as {string} and presses Enter")
	public void search(String searchText) {
		resultsPage = homePage.search(searchText);
	}

	@When("User clicks on the third result page")
	public void openThirdResultsPAge() {
		resultsPage.openThirdResultPage();
	}

	@Then("The title of the second listing on the page should be printed")
	public void printTileofSecondResultOnPage() {
		String titleOfSecondResultOnPage = resultsPage.getTitleOfSecondResultOnPage();
		System.out.println(
				"<<<-----------Title of second result on the third Google results page----------->>>\n");
		System.out.println("\t\t" + titleOfSecondResultOnPage);
		System.out.println(
				"\n<<<----------------------------------------------------------------------------->>>");
	}

}
