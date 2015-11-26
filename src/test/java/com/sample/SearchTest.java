package com.sample;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SearchTest {
	
	@Test	
	public void ShowResult() {
	
		System.out.println("This is the sample test");
		
		WebDriver driver;
		/*try {
			driver = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"), DesiredCapabilities.firefox());
			driver.get("http://www.subcontract.com");
			
			driver.quit();
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/ 
				
		driver = new ChromeDriver();  //FirefoxDriver();
		driver.get("http://www.subcontract.com");
		
		driver.quit();
		
		//driver = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"), DesiredCapabilities.firefox());
			
	}
}
