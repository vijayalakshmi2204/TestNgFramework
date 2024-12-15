package com.training.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.pages.Loginpage;
import com.training.utilities.PropertiesReader;
import com.training.utilities.ScreenshotUtilities;

import BasePackage.BaseTest;

public class Logintest extends BaseTest {
	WebDriver driver;
	PropertiesReader property;
	Loginpage loginpage;
	String usernameid;
	String password1;
	ScreenshotUtilities screenshott = new ScreenshotUtilities();

	@BeforeMethod
	public void Beforemethod() {
		property = new PropertiesReader();
		String browsername = property.getProperties("browser");
		usernameid = property.getProperties("usernameid");
		password1 = property.getProperties("paasword");
		driver = getDriver(browsername);
		loginpage = new Loginpage(driver);

	}

	@Test
	public void T1LoginErrorMessage() {
		loginpage.enterusername(usernameid);
		loginpage.clicklogin();

	}

	@Test
	public void T2LoginToSalesForce() {
		loginpage.enterusername(usernameid);
		loginpage.enterpassword(password1);
		loginpage.clicklogin();
	}

	@Test
	public void T3CheckRemeberMe() {
		loginpage.enterusername(usernameid);
		loginpage.enterpassword(password1);
		loginpage.rememberme();
		loginpage.clicklogin();
		loginpage.profileclick();
		loginpage.clicklogout();

	}

	@Test
	public void T4Testforgotpassword() throws Exception {
		loginpage.enterusername(usernameid);
		loginpage.forgotpassword();
		loginpage.fpenterusername(usernameid);
		loginpage.continuebtn();
		loginpage.returntologin();

	}

	@Test
	public void T5invalidusernameandpassword() {
		loginpage.enterusername("123");
		loginpage.enterpassword("22131");
		loginpage.clicklogin();
	}

	@AfterMethod

	public void teardown() {
		screenshott.getScreenshots(driver);
		closebrowser();
	}
}
