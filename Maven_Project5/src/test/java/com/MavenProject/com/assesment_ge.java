package com.MavenProject.com;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class assesment_ge{

	
	public WebDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hi\\eclipse-workspace\\Maven_Project5\\driver2\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.gmail.com");
		
		driver.manage().window().maximize();
		
	WebElement wb =	driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/button/span"));
	wb.click();		
	
	WebElement my = driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div/ul/li[1]/span[2]"));
	my.click();
	
	
	WebElement fn = driver.findElement(By.id("firstName"));
	fn.sendKeys("chinnadurai");
	
WebElement ln = driver.findElement(By.id("lastName"));
	ln.sendKeys("ss");
	
	WebElement id1 = driver.findElement(By.id("username"));
	
	id1.sendKeys("durai236789");
	
	WebElement pw = driver.findElement(By.name("Passwd"));
	pw.sendKeys("Durai@123456");
	
	WebElement cpw = driver.findElement(By.name("ConfirmPasswd"));
	
	cpw.sendKeys("Durai@123456");
	
	WebElement cl = driver.findElement(By.xpath("//*[@id=\"accountDetailsNext\"]/div/button/span"));
	cl.click();
	
	
	
	
driver.navigate().to("https://www.ebay.com/");
	
	WebElement sr = driver.findElement(By.xpath("//*[@id=\"gh-ac\"]"));
	sr.sendKeys("electric guitar");
	
	WebElement sr1 = driver.findElement(By.id("gh-btn"));
	sr1.click();
	
	WebElement gtr = driver.findElement(By.xpath("//*[@id=\"srp-river-results\"]/ul/li[1]/div/div[1]/div/a/div/img"));
	
	gtr.click();
	
	
	
	
	driver.navigate().to("https://www.gmail.com");
	
	WebElement sg = driver.findElement(By.xpath("/html/body/header/div/div/div/a[2]"));
	sg.click();
	
	
	
	WebElement id =	driver.findElement(By.id("identifierId"));
		id.sendKeys("ssdurai02");
		
	WebElement nt = driver.findElement(By.xpath("(//button[@type='button'])[3]"));

	nt.click();
	
	
	driver .manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
	Thread.sleep(2000);
		
	WebElement pw1 = driver.findElement(By.xpath("//*[@type='password']"));
	
	pw1.sendKeys("Durai@4263");
	
	WebElement lg = driver.findElement(By.xpath("(//*[@type='button'])[2]"));
	
	lg.click();
	
	driver.quit();
	
	
	
	
	
	
	
}}