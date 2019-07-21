package com.app.page;



import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects extends BasePage{
	
	//click on menu women dresses tshirt
	
	@FindBy(xpath ="//div/ul/li/a[@title='Women']")
	private WebElement women;
	
	@FindBy (xpath="//div/ul/li/a[@title='Dresses']")
	private WebElement dresses;
	
	@FindBy (xpath="//div/ul/li/a[@title='T-shirts']")
	private WebElement tshirts;
	
	
	@FindBy (xpath="//div/ul/li/a[@title='Women']")
	public String womenclick;
	

	
	@FindBy(xpath="//*[@class='heading-counter']")
	public WebElement countwomen;
	
	@FindBys(@FindBy(xpath="//*[@class='product_list grid row']/li"))
	public List<WebElement> lstproduct;
	
	@FindBy(xpath="//*[@class='heading-counter']")
	public WebElement dresscount;
	
	@FindBys(@FindBy(xpath="//*[@class='product_list grid row']/li"))
	public List<WebElement> secondproduct;
	
	@FindBy(xpath="//*[@class='heading-counter']")
	public WebElement tshirtcount;
	
	
	@FindBy(xpath="//input[@value='1_1']")
	public WebElement sizeCheck;
	
	@FindBy(xpath="//img[@alt='My Store']")
	public WebElement homeLogo;
	
	@FindBys(@FindBy(xpath="//*[@class='product_list grid row']/li"))
	public List<WebElement> thirdproduct;
	
	
	@FindBy(xpath="//ul[@id='layered_id_attribute_group_1']")
	public WebElement size;
	
	//email
	@FindBy(xpath="//input[@name='email']")
	public WebElement email;
	//emailsubscribe
	@FindBy(xpath="//button[@name='submitNewsletter']")
	public WebElement emailSubscribe;
	
	
	
	@FindBy(xpath="//span[@title='Close window']")
	public WebElement addtocartClose;
	
@FindBy(xpath="//a[@data-id-product='1']")
 public WebElement addtocart;
@FindBy(xpath="//img[@title='Faded Short Sleeve T-shirts']")
public WebElement selectproduct;
	
	// to accesss menu dresses tshirt
	public HomePageObjects() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement Women() {
		return women;
	}
	 
	public WebElement Tshirts() {
		return tshirts;
	}
	
	public WebElement Dresses() {
		return dresses;
	}
	
	public void womenclick() {
		women.click();
	}

	
	public void dressesclick() {
		dresses.click();
	}
	
	public void tshirtclick() {
		tshirts.click();
	}
	
	public WebElement getaddtocart() {

	      		return addtocart;
	}
	
	public WebElement getselectproduct() {
		return selectproduct;
	}
	
	public void clickSizeCheckbox() {
		sizeCheck.click();
	}
	
	
	//womencount
	public int countwomen(){
		String msg1=countwomen.getText();
		String[] arr1=msg1.split(" ");
		String number1=arr1[2];
		int num1=Integer.parseInt(number1);
		return num1;
		
}
	public int getcountwomen() {
		return lstproduct.size();
	}
	
	//dress count 
	public int dresscount(){
		String msg2=countwomen.getText();
		String[] arr2=msg2.split(" ");
		String number2=arr2[2];
		int num2=Integer.parseInt(number2);
		return num2;		
}
	
	public int getdresscount() {
		return secondproduct.size();
	}
	
//tshirt count
	
	//dress count 
		public int tshirtcount(){
			String msg3=countwomen.getText();
			String[] arr3=msg3.split(" ");
			String number3=arr3[2];
			int num3=Integer.parseInt(number3);
			return num3;		
	}
		
		public int gettshirtcount() {
			return thirdproduct.size();
		}

		public WebElement verifysize() {
			return size;
		}
		
		public void mouseHover() {
			Actions actions = new Actions(driver);
			actions.moveToElement(selectproduct).perform();
			getaddtocart().click();
			addtocartClose.click();
			
		}
		
		public void navigateHome() {
			homeLogo.click();
		}
		
		public void emailSubscribe() {
			email.sendKeys("xxx@gmail.com");
			emailSubscribe.click();
		}
}
