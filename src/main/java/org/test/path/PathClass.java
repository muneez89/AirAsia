package org.test.path;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class PathClass {

	WebDriver driver;
	public void laucnh() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Home\\web_drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//driver.get("https://www.htmlelements.com/demos/page-templates/dashboard-northwind/");
		driver.get("https://www.calliope.pro/");
		// xpath
		//y
		WebElement ss=driver.findElement(By.xpath(".//span[@class='elementor-button-text']"));
		String name=ss.getText();
		System.out.println(" name "+name);
		
		
	
// Ragul xpath
		//link test
			
		
		
	}
	public void pathFind() {
	//Text()
	}
	
	public void logout() {
		

	}
	
	
}
