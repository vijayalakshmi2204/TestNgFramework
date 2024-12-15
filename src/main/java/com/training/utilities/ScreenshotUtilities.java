package com.training.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtilities {
	
	
	
	public void getScreenshots(WebDriver driver) {
		
		//create object for TakesScreenshot interface
		
		TakesScreenshot screenshot = ((TakesScreenshot)driver);
		
		//create file object for screenshot object
		
		File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
		
		String user_dir = System.getProperty("user.dir");
		
		Date current = new Date();
		
		String timestamp =  new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(current);
		
		//get filepath location
		
		String filepath = user_dir+"\\Screenshots\\screenshot1"+timestamp+".jpeg";
		
		//convert filepath to file object
		
		File desFile = new File(filepath);
		
		//copy screenshot from  srcfile to desfile
		
		try {
			FileUtils.copyFile(srcFile, desFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
