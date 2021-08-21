package com.base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;
	
	public static WebDriver browserLaunch(String browser) {
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Webdrivermethods\\driver\\chromedriver.exe");
		     driver=new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Admin\\eclipse-workspace\\Webdrivermethods\\driver\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		else{
			System.out.println("Invalid  browser");
		}
		driver.manage().window().maximize();
		return driver;
		}
	public static void openurl(String url) throws InterruptedException {
	      Thread.sleep(3000);
	      driver.get(url);
		}
		public static void clickonelement(WebElement element,String str) {
			element.sendKeys(str);
		}
		public static void click(WebElement element) {
			element.click();
		}
		public static void dropdown(WebElement element,String str){
			Select s=new Select(element);
			s.selectByVisibleText(str);
		}
		public static void dropdown1(WebElement element,String str){
			Select s1=new Select(element);
			s1.selectByVisibleText(str);
		}
		public static void dropdown2(WebElement element,String str){
			Select s2=new Select(element);
			s2.selectByVisibleText(str);
		}
		public static void dropdown3(WebElement element,int n){
			Select s3=new Select(element);
			s3.selectByIndex(n);
		}
		public static void radiobutton(WebElement element) {
			element.click();
		}
		public static void scrolldown(WebElement element) {
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoview", element);
			

			
}
}

