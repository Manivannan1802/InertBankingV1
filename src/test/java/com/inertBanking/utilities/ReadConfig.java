package com.inertBanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig() {
		
		File src=new File("./configuration/config.properties");
		
		try {
			
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
			
		}
		catch (Exception e) {
			
			System.out.println("Exception is"+ e.getMessage());
		}
		
		}
	
	public String Geturl() {
		
		String url=pro.getProperty("baseURL");
		return url;
	}
	
	public String Getusername() {
		
		String username=pro.getProperty("username");
		return username;
	}
	
	public String Password() {
		
		String password=pro.getProperty("password");
		return password;
	}

	public String chromepath() {
	
	String chromepath=pro.getProperty("chromepath");
	return chromepath;
}
	

}
