package Automation;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	@Test //Login into Gmail with Chrome or firefox's WebDrivers:
	
	public void test(WebDriver chrome) {
//	public void test(WebDriver firefox) {
		
		Wait<WebDriver> wait = new WebDriverWait(chrome, 50);
//		Wait<WebDriver> wait = new WebDriverWait(firefox, 50);

		System.out.println("Start - HomePage Test");
		System.out.println("****Login into Gmail***");
		String baseUrl = "https://gmail.com";
		chrome.get(baseUrl);
//		firefox.get(baseUrl);
		String expectedTitle = "Gmail";
		String actualTitle = chrome.getTitle();
//		String actualTitle = firefox.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle); //Confirming the expected title "Gmail" is the actual one
		System.out.println("****If no errors loading the page was successfull***");
		System.out.println(" ");
		System.out.println("Start the Login");

		 wait.until(ExpectedConditions.elementToBeClickable(By.id("identifierId")));

	//Filling username by element's id:
	
		WebElement username = chrome.findElement(By.id("identifierId"));
//		WebElement username = firefox.findElement(By.id("identifierId"));
		username.sendKeys("nrftp22");
		WebElement submitusername = chrome.findElement(By.id("identifierNext"));		
//		WebElement submitusername = firefox.findElement(By.id("identifierNext"));		
		submitusername.click();

		 wait.until(ExpectedConditions.elementToBeClickable(By.id("password")));
	
	//Filling password by cssSelector:
	
		WebElement password = chrome.findElement(By.cssSelector("#password input"));
//		WebElement password = firefox.findElement(By.cssSelector("#password input"));
		password.sendKeys("icanautomate22");
		WebElement submitpassword = chrome.findElement(By.cssSelector("#passwordNext button"));		
//		WebElement submitpassword = firefox.findElement(By.cssSelector("#passwordNext button"));		
		submitpassword.click();
		
	// Enter inbox's personal area:
		System.out.println("Open personal area");
	
		InboxPage.personalArea(chrome);
//  	InboxPage.personalArea(firefox);
		
	}

}