package com.sample;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
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
		try {
			DesiredCapabilities capabilities = new DesiredCapabilities("chrome", "46.0.2490.86",Platform.LINUX); 
			
			System.setProperty("webdriver.chrome.driver", "/usr/bin/google-chrome");
			
			driver = new RemoteWebDriver(new URL("http://172.16.30.61:4444/wd/hub"), DesiredCapabilities.chrome());
			driver.get("http://www.subcontract.com");
			
			driver.quit();
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*System.setProperty("webdriver.chrome.driver", "/usr/bin/google-chrome");
		driver = new ChromeDriver();  //FirefoxDriver();
		
		
		driver.get("http://www.subcontract.com");
		
		driver.quit();
*/		
		//driver = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"), DesiredCapabilities.firefox());
			
	}
}
