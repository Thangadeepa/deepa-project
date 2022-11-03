package org.utility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.DateUtil;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	//browserlaunch
	public static WebDriver browserlaunch(String browsername) {
		if(browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browsername.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			}
		return driver;
		}
	
	//browserlaunch1
		public static WebDriver browserlaunch1(String browsername ) {
			switch(browsername) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
		break;
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
		break;
			case "edge":
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
		break;
				
			
			}
			return driver;
		}



	
	//chromebrowser	
	public static WebDriver chromeBrowser() {
		 WebDriverManager.chromedriver().setup();	
	      driver = new ChromeDriver();
		return driver;
	      }
	//firefox
	public static WebDriver firefoxBrowser() {
		 WebDriverManager.firefoxdriver().setup();	
	      driver = new FirefoxDriver();
		return driver;
	      }
	//edgebrowser
	public static WebDriver edgeBrowser() {
	     WebDriverManager.edgedriver().setup();	
		 driver = new EdgeDriver();
		return driver;
			}
	
		//urllanuch
	public static void urlLaunch(String url) {
      driver.get(url);
      }
	
		//maximize
	public static void maximize() {
	     driver.manage().window().maximize();
    }
	
		//time
	public static void implicitywait(long secs) {   
		driver.manage().timeouts().implicitlyWait(secs, TimeUnit.SECONDS);
    }
	
		//sendkeys
	public static void sendkeys(WebElement e,String value) {
	      e.sendKeys(value);
       }
	
		//click
	public static void click(WebElement e) {
	      e.click();
	      }
	
		//quit
	public static void quit() {
	     driver.quit();
	     }
	
		//current url
	public static String currenturl() {
		 String url = driver.getCurrentUrl();
		return url;
		 } 
	
		//title
	public static String title() {
		 String title = driver.getTitle();
		return title;
		}
	
		//getattribute
	public static String getAttribute(WebElement e,String value) {
		 String att = e.getAttribute(value);
		return att;
	    }
	
		//getText
	public static String getText(WebElement e) {
	     String text = e.getText();
		return text;
	   }
	
		//getattribute(innerText)
	public static String getattributeText(WebElement e,String innerText) {
		 String innertext = e.getAttribute(innerText);
		return innertext;
	   	}
	
		//moveToElement
	public static void moveToElement(WebElement e) {
		Actions a = new Actions(driver);
	     a.moveToElement(e).perform();
	     }
	
		//dragAndDrop
	public static void dragAndDrop(WebElement src,WebElement des) {
		Actions a = new Actions(driver);
		  a.dragAndDrop(src, des).perform();
		     }
	
		//contextclick
	public static void contextclick() {
		 Actions a = new Actions(driver);
		  a.contextClick().perform();
		 }
	
		//doubleclick
	public static void doubleclick() {
		Actions a = new Actions(driver);
		  a.doubleClick().perform();
		 }
	
		//keyenter
	public static void keyenter() throws AWTException {
		 Robot r = new Robot();
	     r.keyPress(KeyEvent.VK_ENTER);
	     r.keyRelease(KeyEvent.VK_ENTER);
	     }
	
	 //KeycontrolA
	public static void KeycontrolA() throws AWTException {
		 Robot r = new Robot();
		 r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_A);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_A);
			}
	
	//keycontrolX
	public static void KeycontrolX() throws AWTException {
		 Robot r = new Robot();
		 r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_X);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_X);
			}
	
			//keycontrolV
	public static void KeycontrolV() throws AWTException {
		 Robot r = new Robot();
		 r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);
			}
	
			//keycontrolC
		public static void KeycontrolC() throws AWTException {
			 Robot r = new Robot();
			 r.keyPress(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_C);
				r.keyRelease(KeyEvent.VK_CONTROL);
				r.keyRelease(KeyEvent.VK_C);
				}

			//keytab
		public static void keytab() throws AWTException {
			 Robot r = new Robot();
		     r.keyPress(KeyEvent.VK_TAB);
		     r.keyRelease(KeyEvent.VK_TAB);
		     }
		
		//alert
		public static Alert alert() {
			 Alert alert =driver.switchTo().alert();
			return alert;
			}
		
		//accept
	public static void accept() {
		driver.switchTo().alert().accept();
		}
	
	//dismiss
		public static void dismiss() {
			driver.switchTo().alert().dismiss();
			}
		
		//alertsendkeys
	public static void alertsendkeys(String value) {
			driver.switchTo().alert().sendKeys(value);
			}
	
	//alertgettext
		public static String alertgettext() {
			String text = driver.switchTo().alert().getText();
			return text;
			}
		
		//time
		public static  void time() throws InterruptedException {
		Thread.sleep(5000);
		}
		
		//alertA
      public static void alertA() {
		  Alert a = driver.switchTo().alert();
		  a.accept();
	       }   
     
		  //alertD
		public static void alertD() {
		   Alert a = driver.switchTo().alert();
		   a.dismiss();
		    }
		
			//alertS
		public static Alert alertS(String value) {
			Alert a11 = driver.switchTo().alert();
			a11.sendKeys(value);
			return a11;
			}
					
		 //alertT
		public static String alertT() {
			Alert a = driver.switchTo().alert();
			String text = a.getText();
			return text;
			}
		//selectByIndex
		public static void selectByIndex(WebElement e, int index) {
			Select s = new Select(e);
			s.selectByIndex(index);
			}
		//selectByValue
		public static void selectByValue(WebElement e,String value) {
			Select s = new Select(e);
			s.selectByValue(value);
			}
        //selectByVisibleText
		public static String selectByVisibleText(WebElement e,String value) {
			Select s = new Select(e);
			s.selectByVisibleText(value);
			return value;
			}
		
		//getFirstSelectedOption
				public static String  getFirstSelectedOption(WebElement e) {
					Select s = new Select(e);
					WebElement aa = s.getFirstSelectedOption();
					String text1 = aa.getText();
					return text1;
					}
			//	GetFirstSelectedOption
				public static List<WebElement> GetFirstSelectedOption(WebElement e) {
					Select s = new Select(e);
					List<WebElement> allSelectedOption = (List<WebElement>) s.getFirstSelectedOption();
					return allSelectedOption;


				}
				

		//deselectByIndex
				public static void deselectByIndex(WebElement e, int index) {
					Select s = new Select(e);
					s.deselectByIndex(index);
					}
			
		//deselectByValue
		   public static void deselectByValue(WebElement e,String value) {
					Select s = new Select(e);
					s.deselectByValue(value);
					}
		 //deselectByVisibleText
		   public static void deselectByVisibleText(WebElement e,String value) {
					Select s = new Select(e);
					s.deselectByVisibleText(value);
					}
		   //getOptions
		   public static String getOptions(WebElement e) {
				Select s = new Select(e);
			   List<WebElement> options = s.getOptions();
				for(int i=0;i<options.size();i++) {
					WebElement option = options.get(i);
					String text2 = option.getText();
			}
				return null;
			}
		   
		   
		   //GetOptions
		   public static  List<WebElement> GetOptions(WebElement e) {
				Select s = new Select(e);
			   List<WebElement> options = s.getOptions();
			return options;
			}

		   //isMultiple
		   public static boolean isMultiple(WebElement e) {
			   Select s = new Select(e);
				boolean m = s.isMultiple();
				return m;
				}
		   
		   //back
		   public static void back() {
				driver.navigate().back();
                }
		   
		   //forward
		   public static void forward() {
				driver.navigate().forward();
				}
		   
		  //refresh
		   public static void refresh() {
				driver.navigate().refresh();
				}
		   
		   //navigateto
		   public static void navigateto(String url) {
				driver.navigate().to(url);
				}
		   
		   //Screenshot
		   public static void Screenshot(WebElement e,String url, String filename) throws IOException {
				File from = e.getScreenshotAs(OutputType.FILE);
			    TakesScreenshot tk =(TakesScreenshot) driver;
				File to = new File(url+filename+".png");
				FileUtils.copyFile(from, to);
				}
			
//		//getExcel
//		public static String getExcel(String filename,String sheetname,int row,int c) throws IOException {
//			
//			File f = new File("C:\\Users\\Rani\\eclipse-workspace\\Maven-1\\src\\test\\resources\\"+filename+".xlsx");
//			FileInputStream fi = new FileInputStream(f);
//			Workbook w = new XSSFWorkbook(fi);
//			Sheet s = w.getSheet(sheetname);
//		    Row r = s.getRow(row);
//		    Cell cell = r.getCell(c);
//		    int type = cell.getCellType();
//			// type 1===name
//			//type  0===number,date
//			String value=null;
//			if(type==1) {
//				 value = cell.getStringCellValue();
//				}
//			else if(DateUtil.isCellDateFormatted(cell)) {
//				Date date = cell.getDateCellValue();
//				SimpleDateFormat s1 = new SimpleDateFormat("dd-MM-yy");
//				 value = s1.format(date);
//			}
//			else {
//				double d = cell.getNumericCellValue();
//				long l =(long) d;
//				 value = String.valueOf(l);
//				
//			}
//			return value;
//				
//			}
//			
//
//		
	
				
				
				
			
	
	
	
	
	
}