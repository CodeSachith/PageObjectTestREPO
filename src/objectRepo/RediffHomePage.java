package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffHomePage {
	
	 
	//local driver
	WebDriver driver ;
	
	//constructor definition - to be used to create objects in the test classes
	public RediffHomePage(WebDriver driver)
	{
		/*
		 * this.driver refers to the local driver. 
		 * driver value passed when creating the object is assigned to this local driver
		 * 
		 */
		
		this.driver = driver;
	}
	
	By FiledSearch = By.xpath("//img[@alt='Search']");
	By BtsSearch = By.xpath("");
	
		public WebElement filedSearch() {
		
		return driver.findElement(FiledSearch);
	}
	
	


}
