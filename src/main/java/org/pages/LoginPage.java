package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class LoginPage extends BaseClass {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//without page factory

//	public static WebElement txtuser() {
//		 WebElement txtuser = driver.findElement(By.id("email"));
//		return txtuser;
//		} 
	
	//with page factory

	@FindBys({@FindBy(id="email"),@FindBy(xpath="//input[@id='email']")})
	private	WebElement txtuser;
	
	@FindAll({@FindBy(id="pass"),@FindBy(xpath="//input[@id='email']")})
	private  WebElement txtpass;
	
	@FindBy(name="login") 
	private  WebElement btnlogin;
	
   //Getters
	public WebElement getTxtuser() {
		return txtuser;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}
	
	public void login(String user,String pass) {
		
		 sendkeys(getTxtuser(), "deepa");
	      
	      sendkeys(getTxtpass(), "1234");
	      
	      click(getBtnlogin());
	     
	}
	

}
