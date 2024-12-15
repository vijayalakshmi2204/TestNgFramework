package com.training.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class PropertiesReader {
	FileInputStream fileinput;

	public String getProperties(String key) {
		String filepath = "C:\\viji\\workspace\\SalesforceFramework\\Testngproject\\Properties\\ApplicationProperties";

		FileInputStream fileinput = null;
		try {
			fileinput = new FileInputStream(filepath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Properties prop = new Properties();

		try {
			prop.load(fileinput);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String val = prop.getProperty(key);

		return val;
	}
}