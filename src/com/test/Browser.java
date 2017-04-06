package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser {

	static String driverPath = "E:\\QAWorkspace\\SampleTestNG\\lib\\";
	
	public static WebDriver driver;
	
	public static WebDriver getBrowser(String browserType) {
		switch (browserType) {
		case "firefox":
			System.setProperty("webdriver.firefox.marionette",driverPath+"geckodriver.exe");
		case "chrome":
			System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
			return	driver = new ChromeDriver();
		case "IE":
			System.setProperty("webdriver.ie.driver", driverPath+"IEDriverServer.exe");
			return	driver = new InternetExplorerDriver();
		default:
			System.out.println("browser : " + browserType + " is invalid, Launching Firefox as browser of choice..");
			return driver = new FirefoxDriver();
		}
	}
}