package com.properties.in;

public class FileReader {
	
	private FileReader() {
	}
	
	//current class object
	public static FileReader FileReaderFR() {
		FileReader fr =new FileReader();
		return fr;
	}
	
	//create obj for the config.reader
	public ConfigReader configReaderCR() throws Exception {
		ConfigReader cr=new ConfigReader();
		return cr;
	}
	
}
