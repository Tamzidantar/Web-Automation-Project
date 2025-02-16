package bd.com.FastAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BrowserCommands extends BaseDriver{
	//@Test
	public void getCurrentUrlcommand() throws InterruptedException {
		
		driver.manage().window().maximize();
		driver.get("https://www.daraz.com.bd/#?");
		
		WebElement Currenturl = driver.findElement(By.cssSelector(".search-box__button--1oH7"));
		Currenturl.click();
		Thread.sleep(3000);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
	}
	@Test
	public void xpath_location () throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://www.daraz.com.bd/#?");
		String title = driver.getTitle();
		System.out.println(title);
        WebElement xpath = driver.findElement(By.xpath("//*[@class= 'card-categories-ul']/div[3]/a"));
		xpath.click();
		Thread.sleep(5000);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}

	

}
