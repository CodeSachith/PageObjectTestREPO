package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffLoginPage {
	
	 
	//local driver
	WebDriver driver ;
	
	//constructor definition - to be used to create objects in the test classes
	public RediffLoginPage(WebDriver driver)
	{
		/*
		 * this.driver refers to the local driver. 
		 * driver value passed when creating the object is assigned to this local driver
		 * 
		 */
		
		this.driver = driver;
	}
	
	
	//define html objects in the page
	By username = By.xpath("//input[@id='login1']");
	By passowrd = By.name("passwd");
	By btnGo = By.name("proceed");
	By lnkHome = By.linkText("Home");
	
	// define the method to use email id object so that test class can access the email id field 
	public WebElement EmailId() 
	{
		return driver.findElement(username);
	}
	
	//define the method to use password field object so that test class can access the password field 
	public WebElement Password() 
	{
		return driver.findElement(passowrd);
		
	}
	
	public WebElement BtnGo() {
		
		return driver.findElement(btnGo);
	}
	
	public WebElement LnkHome() {
		
		return driver.findElement(lnkHome);
	}
	


}
