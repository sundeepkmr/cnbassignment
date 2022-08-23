package com.cnb.cnbassignment.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.cnb.cnbassignment.base.BasePage;

public class GoogleHomePage extends BasePage {
	private By searchBox = By.xpath("//input[@title='Search']");

	public GoogleHomePage(WebDriver driver) {
		super(driver);
	}

	public GoogleSearchResultsPage search(String searchText) {
		driver.findElement(searchBox).sendKeys(searchText + Keys.ENTER);
		return new GoogleSearchResultsPage(driver);
	}

}
