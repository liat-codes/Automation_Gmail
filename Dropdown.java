package Automation;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Dropdown{
//		
	@Test
    public void test(WebDriver chrome) {
//	public void test(WebDriver firefox) {
	
		chrome.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);	
//		firefox.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);	
	
		chrome.findElement(By.id(":1z")).click();
//		firefox.findElement(By.cssSelector(":1z")).click();

		System.out.println("more selected");

}
}
