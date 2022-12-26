package com.BaseClass.in;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

public static WebDriver driver;		//null driver
	
	public static WebDriver browserLaunch(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\SANJEEV\\eclipse-workspace\\CucumberA\\Driver\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver gecko.driver", "//firefox.exe");
			driver=new FirefoxDriver();
		}else {
			System.out.println("Check the brower name");
	}
		
		driver.manage().window().maximize();	
		
		return driver;
	}
	
	//element methods
	//click (WebElement)
	public static void clickOnElement(WebElement ele) {
		ele.click();	
	}
	//sendkeys(WebElement String)
	public static void enterYourValue(WebElement ele, String str) {
		ele.sendKeys(str);
	}
	//getText(WebElement)
	public static void getTheText(WebElement ele) {
		String text=ele.getText();
		System.out.println(text);
	}
	//isSelected(WebElement)
	public static void isSelected(WebElement ele) {
		boolean selected = ele.isSelected();
		System.out.println(selected);
	}
	//isEnabled(WebElement)
	public static void isEnabled(WebElement ele) {
		boolean enabled = ele.isEnabled();
		System.out.println(enabled);
	}
	//isSelected(WebElement)
	public static void isDisplayed(WebElement ele) {
		boolean displayed = ele.isSelected();
		System.out.println(displayed);
	}
	//clear(WebElement)
	public static void clearScreen(WebElement ele) {
		ele.clear();
	}
	//getAttribute
	public static void getTheAttribute(WebElement ele, String str) {
		ele.getAttribute(str);
	}
	//getLocation
	public static void getTheLocation(WebElement ele) {
		ele.getLocation();
	}
	
	public static void getTheSize(WebElement ele) {
		ele.getSize();
	}
	
	public static void getTagName(WebElement ele) {
		ele.getTagName();
	}
	
	public static void submitAll(WebElement ele) {
		ele.submit();
	}	
	//screenshot
	public static void getScreenshotAs(WebElement ele) {
		ele.getScreenshotAs(OutputType.FILE);		
	}

	
	//dropdown
	public static void dropdown(WebElement ele, String value, String i) {
		Select s=new Select(ele);
		if(value.equals("index")) {
			s.selectByIndex(Integer.parseInt(i));
		}else if (value.equals("value")) {
			s.selectByValue(value);
		}
		else if(value.equals("text")) {
			s.deselectByVisibleText(value);
		}
	}
	
	//get (String)
	public static void getTheUrl(String url) {
		driver.get(url);
	}
	
	//alert accept
	public static void alertaccept() {
		Alert alert = driver.switchTo().alert();
		alert.accept();	
	}
	
	//alert dismiss
	public static void alertDismiss() {
		Alert alert1 = driver.switchTo().alert();
		alert1.dismiss();	
	}
	
	//right click
	public static void rightClickOnElement(WebElement ele) {
		Actions ac=new Actions(driver);
		ac.contextClick().build().perform();
	}
	
	//close 
	public static void closeThePage() {
		driver.close();
	}
	
	//quit
	public static void quitTheBrowser() {
		driver.quit();
	}
	
	//


	
}
