package BasePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.training.utilities.PropertiesReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	WebDriver driver;
	PropertiesReader property;
	public WebDriver getDriver(String webbrowser) {
		property= new PropertiesReader();
		String browsername= property.getProperties("browser");
		String url=property.getProperties("url");
		 if(driver==null) {
			 if(browsername.equalsIgnoreCase("chrome")) {
				 WebDriverManager.chromedriver().setup();
				 driver=new ChromeDriver();
			 }
			 else if(browsername.equalsIgnoreCase("firefox")) {
				 WebDriverManager.firefoxdriver().setup();
				 driver=new FirefoxDriver();
			 }
		 }
		 
			 driver.get(url);
			 driver.manage().window().maximize();
			 return driver;
		
	
	}

	public void closebrowser()
	{
		driver.close();
		driver=null;
	}
}
