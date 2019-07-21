package com.app.tests;

import java.util.Arrays;
import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


import com.app.page.BasePage;
import com.app.page.HomePageObjects;

public class HomePageTest {
	HomePageObjects homepage;
	BasePage bp;
	
	
	public HomePageTest() {
		homepage=new HomePageObjects();
		bp= new BasePage();
	

	}
	
	@Test
	public void verifyWomenTab() {
		Assert.assertTrue(homepage.elementFound(homepage.Women()));
		Assert.assertTrue(homepage.elementFound(homepage.Dresses()));
		Assert.assertTrue(homepage.elementFound(homepage.Tshirts()));
		
		
	}
	


	@Test
	public void verifyclicks() {
	  homepage.womenclick();
	  String getTitle1=bp.getTittle();
	  Assert.assertEquals(getTitle1, "Women-My Store");
	  
	
	  
	 homepage.dressesclick();
	  String getTitle2=bp.getTittle();
	  Assert.assertEquals(getTitle2, "Women-My Store");
	  
	  homepage.tshirtclick();
	  String getTitle3=bp.getTittle();
	  Assert.assertEquals(getTitle3, "Women-My Store");
	  
	}
	
	
	@Test
	public void verifycount() {
		homepage.womenclick();
		int act1=homepage.dresscount();
		int exp1=homepage.getdresscount();
		Assert.assertTrue(act1==exp1,"Count mismatched");
		
		 homepage.dressesclick();
		int act2=homepage.dresscount();
		int exp2=homepage.getdresscount();
		Assert.assertTrue(act2==exp2,"count mismatced");
		
		homepage.tshirtclick();
		int act3=homepage.tshirtcount();
		int exp3=homepage.gettshirtcount();
		Assert.assertTrue(act3==exp3, "count mismatched");
			
	}
	
	@Test
	public void verifysize() {
		Assert.assertTrue(homepage.isElementVisible(homepage.verifysize()));
	}
	
	
	
	@Test
	public void verifyselectproduct() {
		
		homepage.mouseHover();
		
	}
	
	
	@Test
	public void verifyhomeNavigation() {
		
		homepage.navigateHome();
		
	}
	
	//emailSubscribe Test
	@Test
	public void verifyEmailSubscribe() {
		
		homepage.emailSubscribe();
		
		
	}
	
//	
//	@Test
//	public void verifyaddtocart() {
//		
//	
//	WebElement addtocart=homepage.getaddtocart();
//	System.out.println(addtocart);
//	addtocart.click();
//	
//	}
//	
	
	@Test
	public void verifyselectsizeCheckbox() {
	 homepage.clickSizeCheckbox();
		
	}
	
	
	

	

	
	
	
	
	
	

}
