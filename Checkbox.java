package Automation;

import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkbox {
		
	@Test
	 public void test(WebDriver chrome) {
//	public void test(WebDriver firefox) {
	
	 {
		 	 
		chrome.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);	
//		firefox.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);	

		chrome.findElement(By.id(":2h")).click();
//		firefox.findElement(By.id(":2h")).click();
		chrome.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);	
//		firefox.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);	
		chrome.findElement(By.id(":2v")).click();
//              firefox.findElement(By.id(":2v")).click();
		chrome.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);	
//		firefox.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);	
		chrome.findElement(By.id(":39")).click();
//		firefox.findElement(By.id(":39")).click();
		
		System.out.println("3 read mails selected");
	}
	}
}
