package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class AdahotelPage extends BaseClass {
	
	public AdahotelPage() {
		
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(id="username")
	private WebElement user;
	
	@FindBy(id="password")
	private WebElement pass;
	
	@FindBy(id="login")
	private WebElement login;
	
	@FindBy(id="location")
	private WebElement droplocation;

   @FindBy(id="hotels")
	private WebElement drophotels;
  
     @FindBy(id="room_type")
     private WebElement droproomtype;
  
	    @FindBy(id="room_nos")
	   	private WebElement droproomnos;
	    
	    @FindBy(id="datepick_in")
	    private WebElement datepickin;
	    
			@FindBy(id="datepick_out")
			private WebElement datepickout;
			
			@FindBy(id="adult_room")
			private WebElement dropadultsroom;
       
		       @FindBy(id="child_room")
		   	private WebElement dropchildroom;
       
			       @FindBy(id="Submit")
			   	private WebElement searchbox;
    
		@FindBy(id="radiobutton_0")
		private WebElement radiobutton1;

		@FindBy(id="continue")
		private WebElement continuebox;

		@FindBy(id="first_name")
		private WebElement firstname;
		
		@FindBy(id="last_name")
		private WebElement lastname;

		@FindBy(id="address")
		private WebElement address;
	
		@FindBy(id="cc_num")
		private WebElement ccnum;

		@FindBy(id="cc_type")
		private WebElement dropcctype;

		 @FindBy(id="cc_exp_month")
		 private WebElement dropccexpmonth;
		 
		 @FindBy(id="cc_exp_year")
		 private WebElement dropccexpyear;

         @FindBy(id="cc_cvv")
		private WebElement cccvv;

         @FindBy(id="book_now")
		private WebElement booknow;
         
		@FindBy(xpath="//a[text()='Booked Itinerary']")
		private WebElement Booked;

		@FindBy(id="order_id_760204")
		private WebElement Orderid;

		public WebElement getUser() {
			return user;
		}

		public WebElement getPass() {
			return pass;
		}

		public WebElement getLogin() {
			return login;
		}

		public WebElement getDroplocation() {
			return droplocation;
		}

		public WebElement getDrophotels() {
			return drophotels;
		}

		public WebElement getDroproomtype() {
			return droproomtype;
		}

		public WebElement getDroproomnos() {
			return droproomnos;
		}

		public WebElement getDatepickin() {
			return datepickin;
		}

		public WebElement getDatepickout() {
			return datepickout;
		}

		public WebElement getDropadultsroom() {
			return dropadultsroom;
		}

		public WebElement getDropchildroom() {
			return dropchildroom;
		}

		public WebElement getSearchbox() {
			return searchbox;
		}

		public WebElement getRadiobutton1() {
			return radiobutton1;
		}

		public WebElement getContinuebox() {
			return continuebox;
		}

		public WebElement getFirstname() {
			return firstname;
		}

		public WebElement getLastname() {
			return lastname;
		}

		public WebElement getAddress() {
			return address;
		}

		public WebElement getCcnum() {
			return ccnum;
		}

		public WebElement getDropcctype() {
			return dropcctype;
		}

		public WebElement getDropccexpmonth() {
			return dropccexpmonth;
		}

		public WebElement getDropccexpyear() {
			return dropccexpyear;
		}

		public WebElement getCccvv() {
			return cccvv;
		}

		public WebElement getBooknow() {
			return booknow;
		}

		public WebElement getBooked() {
			return Booked;
		}

		public WebElement getOrderid() {
			return Orderid;
		}

		public  String adactinHotel(String user, String pass,String datepickin,String datepickout,String first,String last,String add,String ccno,String cvno, String txt) {
			
			sendkeys(getUser(), "thangadeepa");
			
			sendkeys(getPass(), "deepa@123");
		
			click(getLogin());
			
			selectByIndex(getDroplocation(), 2);
			
			selectByIndex(getDrophotels(), 2);
		
			selectByIndex(getDroproomtype(), 0);
			
			selectByIndex(getDroproomnos(), 2);       
			     
			sendkeys(getDatepickin(), "1/11/2022");
					
			sendkeys(getDatepickout(), "5/11/2022");
					
			selectByIndex(getDropadultsroom(), 1);
			      
			selectByIndex(getDropchildroom(), 1);
			
			click(getSearchbox());	         
					      
			click(getRadiobutton1());
			
			click(getContinuebox());
			
			sendkeys(getFirstname(),"nandhu");
			
			sendkeys(getLastname(), "deepa");
			
			sendkeys(getAddress(), "654/876 new bridge tower");
					     
			sendkeys(getCcnum(), "8950453699087833");
			
			selectByIndex(getDropcctype(), 2);
						
			selectByIndex(getDropccexpmonth(), 11);
			
			selectByIndex(getDropccexpyear(), 11);
						      
			sendkeys(getCccvv(), "2022");
			
			click(getBooknow());
						
			click(getBooked());		
			
			getAttribute(getOrderid(), "value");
			return txt;
		
					
			
		}

	

	

}
