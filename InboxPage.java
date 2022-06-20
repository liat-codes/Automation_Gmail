package Automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InboxPage {

	@Test 
	public void test(WebDriver chrome) {
//	public void test(WebDriver firefox) {
	chrome.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;
//	firefox.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;
	
	

	// not working
		int count = 0;
		 int expectedLinks = 31;
		 List<WebElement> link = driver.findElement(By.tagName("a"));
		 System.out.println(link.size()); // this will print the number of links in a page.	
		 count =  link.size();
		 {
		 if(count==expectedLinks){
			 System.out.println("Number of links are correct " + count );
		 }else
		 {
			 System.out.println("Number of links are incorrect " + count + " vs "+expectedLinks);
		 }	

	
//Entering inbox's Personal area:
		 personalArea(chrome);	 
//		 personalArea(firefox);	 
	}
	}
	static void personalArea(WebDriver chrome) {
//	static void personalArea(WebDriver firefox) {
	chrome.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;
//	firefox.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;
	WebElement personalArea = chrome.findElement(By.cssSelector("a.gb_A.gb_La.gb_f"));
	//	WebElement personalArea = firefox.findElement(By.cssSelector("a.gb_A.gb_La.gb_f"));
	
	personalArea.click();
	chrome.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;
//	firefox.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;
	personalArea.click();
	}	
	}