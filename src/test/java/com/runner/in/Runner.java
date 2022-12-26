package com.runner.in;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.BaseClass.in.BaseClass;
import com.properties.in.FileReader;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "F:\\EclipseNewWorkbench\\CucumberProject\\src\\test\\java\\com\\feature\\in\\script.feature", glue = "com.step.in")


public class Runner {
	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() throws Exception {
		//driver=BaseClass.browserLaunch("chrome");
		String browser = FileReader.FileReaderFR().configReaderCR().getBrowser();
		
		driver = BaseClass.browserLaunch(browser);
		
	}
	
}
