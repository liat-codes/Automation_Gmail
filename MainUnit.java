package Automation;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class MainUnit {
	
	// Defining a variable from a WebDriver class with 2 browsers: Chrome's chDriver or Firefox's ffDriver:
	
	public static WebDriver chDriver = null;  
	//public static WebDriver ffDriver = null;

	@BeforeClass //Preparing the environment: 
	
	public static void beforeTest() {
		
		System.out.println("Start - Before class"); // Defining which WebDriver will work on the operating system:
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver.exe");
		chDriver = new ChromeDriver();
		//ffDriver = new FirefoxDriver();
		
		  // Maximize the window's browser:
		chDriver.manage().window().maximize();	
		//ffDriver.manage().window().maximize();	

	}
		
	@Test //Tests execution with Chrome or Firefox WebDrivers:
	
	public void test() {
	
		System.out.println("Start - Loginpage Test");

		LoginPage loginPage = new LoginPage();
		loginPage.test(chDriver);
//		loginPage.test(ffDriver);   
				
		System.out.println("Start - Inboxpage Test");
		
		InboxPage inboxPage = new InboxPage();
		inboxPage.test(chDriver); 		
//		inboxPageTest.test(ffDriver);
		
		System.out.println("Start - Radiobutton Test");

		Radiobutton radiobutton = new Radiobutton();
		radiobutton.test(chDriver);
//		radiobutton.test(ffDriver);
	
		System.out.println("Start - Checkbox Test");

	Checkbox checkbox = new Checkbox();
	checkbox.test(chDriver);
//	checkbox.test(ffDriver);
	
	System.out.println("Start - Dropdown Test");
	
	Dropdown Dropdown = new Dropdown();
	Dropdown.test(chDriver);
//	Dropdown.test(ffDriver);
}
	
	@AfterClass //Closing environment:  
	public static void afterTest() {
		
		//chDriver.close();
		//ffDriver.close();

	}

}