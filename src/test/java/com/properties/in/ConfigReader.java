package com.properties.in;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigReader {

	public static Properties p;
	
	public ConfigReader() throws Exception {
		File f = new File("F:\\EclipseNewWorkbench\\CucumberProject\\src\\test\\java\\com\\properties\\in\\config.properties");
		FileInputStream fis = new FileInputStream(f);
		p= new Properties();
		p.load(fis);
	
	
	}

	public String getBrowser() {
		String property = p.getProperty("browser");
		return property;
	}
	
	
	public String getUrl() {
		String url = p.getProperty("url");
		return url;
	}
	
	public String getUserName(){
		String username = p.getProperty("username");
		return username;
	}
	
	public String getPassword() {
		String password = p.getProperty("password");
		return password;
	}
	
	
	
	
}
