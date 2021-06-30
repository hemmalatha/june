package org.def;

import org.abc.Firstone;
import org.junit.Assert;
import org.poj.pojclass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sun.net.httpserver.Authenticator.Retry;

public class Thirdone extends Firstone {
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
	private void testcase2() {
		System.out.println("Second!");
//		pojclass pj = new pojclass();
//		totype(pj.getTxtUser(), "Priya");
//		totype(pj.getTxtPass(), "12345");
//		toclick(pj.getBtnSearch());
	}


	@Test(retryAnalyzer=Retry.class)
	private void testcase4() {
		System.out.println("Fourth!");
		Assert.assertTrue(false);
//		pojclass pj = new pojclass();
//		totype(pj.getTxtUser(),src );
//		totype(pj.getTxtPass(),dest );
//		toclick(pj.getBtnSearch());
	}

	@Test
	private void testcase6() {
		System.out.println("Sixth!");
//		pojclass pj = new pojclass();
//		totype(pj.getTxtUser(), "tina");
//		totype(pj.getTxtPass(), "87654");
//		toclick(pj.getBtnSearch());
	}
}
