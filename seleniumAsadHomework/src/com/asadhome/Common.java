package com.asadhome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Common {
WebDriver dr;
	
	void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\2017\\Downloads\\chromedriber.exe");
		dr = new ChromeDriver(); 
	}
	void closeBrowser() throws InterruptedException {
		Thread.sleep(6000);
		dr.quit();
	}
	void getWebSite(String url) {
		dr.get(url);
	}
	void myClick(By locator) {
		dr.findElement(locator).click();
	}

	void verifyElement(By locator) {
	boolean b = dr.findElement(locator).isDisplayed();
	System.out.println("Is element displkayed ? " + b);
}

	void selectValueInDropDown_visibleText(By by, String text) {
	new Select(dr.findElement(by)).selectByVisibleText(text);
}

	void selectValueInDropDown_index(By by, int number) {
	new Select(dr.findElement(by)).selectByIndex(number);
}

	void selectValueInDropDown_value(By by, String text) {
	new Select(dr.findElement(by)).selectByValue(text);

}
	void verifyText() {
		dr.findElement(By.id("")).getTagName();
		
	}

	
}