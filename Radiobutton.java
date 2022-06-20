package Automation;

import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

	public class Radiobutton {
		
		@Test
		 public void test(WebDriver chrome) {
//		public void test(WebDriver firefox) {
	
			chrome.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);	
//			firefox.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);	
					
		chrome.findElement(By.cssSelector("a.FH")).click(); 
//		firefox.findElement(By.cssSelector("a.FH")).click(); 
		
		System.out.println("Settings selected");
		
		   chrome.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);	
//		   firefox.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);	

	    chrome.findElement(By.cssSelector(".QX:nth-child(2) > .Vo")).click();
//	    firefox.findElement(By.cssSelector(".QX:nth-child(2) > .Vo")).click();

		System.out.println("Default density selected");

			chrome.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);	
//			firefox.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			chrome.findElement(By.cssSelector(".QX:nth-child(3) > .Vo")).click();
//			firefox.findElement(By.cssSelector(".QX:nth-child(3) > .Vo")).click();

			System.out.println("Comfortable density selected");

		chrome.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);	
//		firefox.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);	

		}
	}