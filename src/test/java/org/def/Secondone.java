package org.def;

import org.abc.Firstone;
import org.junit.Assert;
import org.poj.pojclass;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;

public class Secondone extends Firstone {

	@BeforeMethod
	public void launch1() {
		chromeBrowserLaunch();
		toLaunchUrl("https://www.facebook.com/");
		toMaximize();
	}

	@AfterMethod
	public void Browserend() {
		toQuit();
	}

	@Test
	private void testcase1() {
		System.out.println("First!");
		Assert.assertTrue(false);
//		pojclass pj = new pojclass();
//		totype(pj.getTxtUser(), "Priya");
//		totype(pj.getTxtPass(), "12345");
//		toclick(pj.getBtnSearch());
	}

	@Test
	private void testcase3() {
		System.out.println("Third!");
//		pojclass pj = new pojclass();
//		totype(pj.getTxtUser(), "hems");
//		totype(pj.getTxtPass(), "76543");
//		toclick(pj.getBtnSearch());
	}

	@Test
	private void testcase7() {
		System.out.println("Seventh!");
//		pojclass pj = new pojclass();
//		totype(pj.getTxtUser(), "tina");
//		totype(pj.getTxtPass(), "87654");
//		toclick(pj.getBtnSearch());
	}
}

//@AfterMethod
//public void Browserend() {
//	toQuit();
//}
//@Parameters("browser")
//@Test
//private void testcase1(String browserNames) {
//	if(browserNames.equals("chromebrowser")) {
//		chromeBrowserLaunch();
//		
//	}
//	else if(browserNames.equals("firefoxbrowser")){
//		firefoxBrowserLaunch();
//	}
//	else {
//		internetexplorerBrowserLaunch();
//	}
//	toLaunchUrl("http://www.greenstechnologys.com");
//	}
//}

//
//
//@Test	
//private void ts1() {		
//pojclass pj = new pojclass();
//
//WebElement username = pj.getTxtUser();
//fillTextBox(username,"Hems@gmail.com");
//String email = username.getAttribute("value");
////Assert s = new Assert();
//Assert.assertEquals(email,"Hems@gmail.com","check the username");
//
//
//WebElement password = pj.getTxtPass();
//fillTextBox(password,"12345");
//
//Assert.assertEquals(password.getAttribute("value"),"12345", "check password");
//
//toclick(pj.getBtnSearch());
//}	
//}