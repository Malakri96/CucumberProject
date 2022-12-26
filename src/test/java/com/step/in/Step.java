package com.step.in;

import org.openqa.selenium.WebDriver;

import com.BaseClass.in.BaseClass;
import com.pom.in.POM;
import com.properties.in.FileReader;
import com.runner.in.Runner;

import io.cucumber.java.en.*;

public class Step extends BaseClass{
	public static WebDriver driver = Runner.driver;
	
	POM pom=new POM(driver);
	
	@Given("page should be launched")
	public void page_should_be_launched() throws Exception {
	    //getTheUrl("https://adactinhotelapp.com/");
		String url = FileReader.FileReaderFR().configReaderCR().getUrl();
		getTheUrl(url);
	}
	@When("user enter the username in the username field")
	public void user_enter_the_username_in_the_username_field() throws Exception {
	    //enterYourValue(pom.getUsername(), "deepmala");
		String userName = FileReader.FileReaderFR().configReaderCR().getUserName();
		enterYourValue(pom.getUsername(), userName);
	}
	@When("user enter the password in the password field")
	public void user_enter_the_password_in_the_password_field() throws Exception {
		//enterYourValue(pom.getPassword(), "743B54" );
		String password = FileReader.FileReaderFR().configReaderCR().getPassword();
	}
	@Then("click on the login button")
	public void click_on_the_login_button() {
		clickOnElement(pom.getLogin());
	   
	}




}
