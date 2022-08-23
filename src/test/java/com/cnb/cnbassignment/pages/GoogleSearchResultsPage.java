package com.cnb.cnbassignment.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cnb.cnbassignment.base.BasePage;

public class GoogleSearchResultsPage extends BasePage {
	By thirdPageResult = By.xpath("//a[@aria-label='Page 3']");
	By allPageResults = By.xpath("//div[@id='rso']");

	public GoogleSearchResultsPage(WebDriver driver) {
		super(driver);
	}

	public void openThirdResultPage() {
		try {
			driver.findElement(thirdPageResult).click();
		} catch (NoSuchElementException ex) {
			System.out.println("Third page results not found...");
			throw ex;
		}
	}

	public String getTitleOfSecondResultOnPage() {
		List<WebElement> searchResults = getAllSearchResultsFromPage();
		return searchResults.get(1).getText();
	}
	
	private List<WebElement> getAllSearchResultsFromPage() {
		WebElement searchResults = driver.findElement(By.xpath("//div[@id='rso']"));
		return searchResults.findElements(By.tagName("h3"));	
	}
}
