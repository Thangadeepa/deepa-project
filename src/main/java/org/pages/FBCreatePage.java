package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class FBCreatePage extends BaseClass {
	
	public FBCreatePage() {
PageFactory.initElements(driver, this);
	}
	
	
	//with page
	
	@FindBy(xpath="(//a[@role='button'])[2]")
	private	WebElement btncreate;
	
	@FindBy(name="firstname")
	private	WebElement firstname;
	
	@FindBy(name="lastname")
	private	WebElement lastname;
	
	@FindBy(xpath="(//input[@type='text'])[4]")
	private	WebElement email;

	@FindBy(xpath="(//input[@type='password'])[2]")
	private	WebElement pass;

	@FindBy(id="day")
	private	WebElement day;

	@FindBy(id="month")
	private	WebElement month;

	@FindBy(id="year")
	private	WebElement yr;
	
	
	@FindBy(xpath="//input[@value='1']")
	private	WebElement female;

	@FindBy(name="websubmit")
	private	WebElement btnsubmit;
	
	
	public WebElement getBtncreate() {
		return btncreate;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYr() {
		return yr;
	}

	public WebElement getFemale() {
		return female;
	}

	public WebElement getBtnsubmit() {
		return btnsubmit;
	}

public void fbloginpage(String first,String last,String mail,String pass,String day,String month,String yr) {

	 click(getBtncreate());
     
     sendkeys(getFirstname(), "deepa");
     
     sendkeys(getLastname(), "deepaaaa");
     
     sendkeys(getEmail(), "deepa2@gmail.com");
     
     sendkeys(getPass(), "123344");
     
     selectByValue(getDay(), "6");
     
     selectByValue(getMonth(), "4");

     selectByValue(getYr(), "2021");

     click(getFemale());
     
     click(getBtnsubmit());


}
	
	
	




}
