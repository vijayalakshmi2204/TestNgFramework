package com.training.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.pages.HomePage;
import com.training.pages.Loginpage;
import com.training.utilities.PropertiesReader;

import BasePackage.BaseTest;

public class UsermenuTest extends BaseTest{
	
	WebDriver driver;
	Loginpage loginpage;
	HomePage homepage;
	PropertiesReader property;
	String usernameid;
	String password1;
	
	@BeforeMethod
	public void Beforemethod() {
		property = new PropertiesReader();
		String browsername = property.getProperties("browser");
		usernameid = property.getProperties("usernameid");
		password1 = property.getProperties("paasword");
		driver = getDriver(browsername);
		loginpage = new Loginpage(driver);
		homepage= new HomePage(driver);
	}
	
	@Test
	public void T6usermenudropdown() {
		loginpage.enterusername(usernameid);
		loginpage.enterpassword(password1);
		loginpage.clicklogin();
		loginpage.profileclick();
		loginpage.clicklogout();
	}
	
	@Test
	public void T6SelectMyProfileoptionfromusermenu() {
		loginpage.enterusername(usernameid);
		loginpage.enterpassword(password1);
		loginpage.clicklogin();
		loginpage.profileclick();
		homepage.myprofileclick();
		homepage.editprofileclick();
		homepage.switchtocontactiframe();
		homepage.clickabout();
		homepage.enterlastname();
		homepage.savechangesprofilecontact();
		
	}
	
	
	public void teardown() {
		//screenshott.getScreenshots(driver);
		closebrowser();
	}

}
