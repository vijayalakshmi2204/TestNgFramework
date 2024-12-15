package com.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import BasePackage.BasePage;

public class HomePage extends BasePage {
	@FindBy(id="username")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="Login")
	WebElement login;
	
	@FindBy(id="userNavLabel")
	WebElement profile ;
	
	@FindBy(xpath="//a[@title='My Profile']")
	WebElement myprofile;
	
	@FindBy(xpath="//*[@id=\"chatterTab\"]/div[2]/div[2]/div[1]/h3/div/div/a/img")
	WebElement editcontact;
	
	@FindBy(id="contactInfoContentId")
	WebElement contactiframe;
	
	@FindBy(id="aboutTab")
	WebElement about;
	
	@FindBy(id="lastName")
	WebElement lastname;
	
	@FindBy(xpath="//input[@value='Save All']")
	WebElement saveall;
	
	public HomePage(WebDriver driver) {
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
	
	public void clicklogin() {
		waitforelement(login);
		login.click();

	}
	
	public void profileclick() {
		waitforelement(profile);
		profile.click();

	}
	
	public void myprofileclick() {
		waitforelement(myprofile);
		myprofile.click();

	}
	
	public void editprofileclick() {
		waitforelement(editcontact);
		editcontact.click();

	}
	
	public void switchtocontactiframe() {
		waitforelement(contactiframe);
		driver.switchTo().frame(contactiframe);

	}
	public void clickabout() {
		waitforelement(about);
		about.click();
	}
	
	public void enterlastname() {
		waitforelement(lastname);
		lastname.clear();
		lastname.sendKeys("Mohan");
	}
	
	public void savechangesprofilecontact() {
		waitforelement(saveall);
		saveall.click();
		
			}
	
	
}
