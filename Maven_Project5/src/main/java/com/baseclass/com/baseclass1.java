package com.baseclass.com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class baseclass1 {

	
	public static  WebDriver driver;
	
	public static WebDriver browserLaunch(String browser) {
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Hi\\eclipse-workspace\\Maven_New_Project1\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Hi\\eclipse-workspace\\Maven_New_Project1\\driver\\chromedriver.exe");
			driver = new FirefoxDriver();
			
		}
		else
		{
			System.out.println("Invalid browser");
		}
		
		driver.manage().window().maximize();
		return driver;
	}
	
	public static void launchUrl(String url) {

		driver.get(url);

	}
	
	
	
	public static void sendValues(WebElement element1, String values) {
	
		element1.sendKeys(values);
		

	}
	
	public static void clickOnElement(WebElement element) {
	
		element.click();

	}
	
	public static void clearOnElement(WebElement element2) {
		element2.click();

	}
	
	public static void closeWindow() {
		
		driver.close();

	}
	
	public static void quitwindow() {
		
		driver.quit();

	}
	
	public static void navigateUrl(String url) {
		driver.navigate().to(url);
		

	}
	
	public static void printScreen(String filename) throws IOException {
	
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source= ts.getScreenshotAs(OutputType.FILE);
		File des= new File("C:\\Users\\Hi\\eclipse-workspace\\Adactin_Project_Cumber\\Screenshot\\"+ filename+".png");
		FileUtils.copyFile(source, des);

	}
	
}

