package org.abc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Firstone {
  public static WebDriver driver;
  
  public static void chromeBrowserLaunch() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
}
  public static void toLaunchUrl(String Url) {
	driver.get(Url);
}
  public static void toMaximize() {
	driver.manage().window().maximize();
}
  public static void toQuit() {
    driver.quit();
}
  public static void totype(WebElement element,String value) {
	element.sendKeys(value);
}
  public static void toclick(WebElement element) {
    element.click();
}
public static void fillTextBox(WebElement username, String value) {
    username.sendKeys(value);
		
	}
  public static String togetAttribute(WebElement element) {
     String value = element.getAttribute("value");
     return value;
}
}





//public static void firefoxBrowserLaunch() {
//	WebDriverManager.firefoxdriver().setup();
//	driver = new FirefoxDriver();
//}
//public static void internetexplorerBrowserLaunch() {
//	WebDriverManager.iedriver().setup();
//	driver = new InternetExplorerDriver();
//}