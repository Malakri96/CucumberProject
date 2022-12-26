package com.pom.in;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM {
	@FindBy(id="username")
	private WebElement username;
			
	@FindBy(name="password")
	private WebElement password;
			
	@FindBy(xpath ="//input[@type=\"Submit\"]")
	private WebElement Login;
			
			public WebElement getLogin() {
				return Login;
			}

			public POM (WebDriver driver2) {
			//to initialize element 
				PageFactory.initElements(driver2, this);
			}
			public WebElement getUsername() {
				return username;
			}

			public WebElement getPassword() {
				return password;
			}

}
