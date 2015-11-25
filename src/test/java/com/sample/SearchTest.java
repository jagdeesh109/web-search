package com.sample;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SearchTest {
	
	@Test	
	public void ShowResult() {
	
		System.out.println("This is the sample test");
		
		
		WebDriver driver;
		try {
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.firefox());
			driver.get("http://www.subcontract.com");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		//WebDriver driver = new FirefoxDriver();
		
			
	}
}
