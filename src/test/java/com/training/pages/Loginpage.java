package com.training.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import BasePackage.BasePage;

public class Loginpage extends BasePage {

	@FindBy(id = "username")
	WebElement username;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(name = "rememberUn")
	WebElement remembermecheckbox;

	@FindBy(id = "Login")
	WebElement login;

	@FindBy(id = "userNavLabel")
	WebElement profile;

	@FindBy(xpath = "//a[@title='Logout']")
	WebElement logout;

	@FindBy(id = "forgot_password_link")
	WebElement forgotpassword;

	@FindBy(id = "un")
	WebElement fpusername;

	@FindBy(id = "continue")
	WebElement cnbtn;

	@FindBy(xpath = "//a[text()='Return to Login']")
	WebElement returntologin;

	public Loginpage(WebDriver driver) {
		super(driver);

	}

	public void enterusername(String usernameid) {
		waitforelement(username);
		username.sendKeys(usernameid);

	}

	public void enterpassword(String password1) {
		waitforelement(password);
		password.sendKeys(password1);

	}

	public void rememberme() {

		remembermecheckbox.click();

	}

	public void clicklogin() {
		waitforelement(login);
		login.click();

	}

	public void profileclick() {
		waitforelement(profile);
		profile.click();

	}

	public void clicklogout() {
		waitforelement(logout);
		logout.click();

	}

	public void forgotpassword() {

		forgotpassword.click();

	}

	public void fpenterusername(String usernameid) {
		waitforelement(fpusername);
		fpusername.sendKeys(usernameid);

	}

	public void continuebtn() {
		waitforelement(cnbtn);
		cnbtn.click();

	}

	public void returntologin() {
		waitforelement(returntologin);
		returntologin.click();

	}

}
