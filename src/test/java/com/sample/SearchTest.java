package com.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SearchTest {
	
	@Test	
	public void ShowResult() {
	
		System.out.println("This is the sample test");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.subcontract.com");
			
	}
}