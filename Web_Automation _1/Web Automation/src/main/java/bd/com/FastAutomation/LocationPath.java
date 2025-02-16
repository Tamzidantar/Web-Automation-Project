package bd.com.FastAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocationPath extends BaseDriver {
	//@Test
	public void idtestlocations () throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		
		WebElement firstName = driver.findElement(By.id("firstName"));
		firstName.sendKeys("Antar");
		Thread.sleep(3000);
	}
	//@Test
	public void nametestlocations () throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		//WebElement gender = driver.findElement(By.name("gender"));
		//gender.click();
		
		//Thread.sleep(5000);
	}
	//@Test
		public void linkTexttestlocations () throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/links");
		WebElement link = driver.findElement(By.linkText("Home"));
		link.click();
		Thread.sleep(3000);
		}
		//@Test
		public void partiallinktestlocations () throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/links");
		WebElement partiallink = driver.findElement(By.partialLinkText("Ho"));
		partiallink.click();
		Thread.sleep(3000);		
	}
		//@Test
		public void list_tag_testlocations () throws InterruptedException {
			driver.manage().window().maximize();
			driver.get("https://demoqa.com/automation-practice-form");
			
			List<WebElement> listtag = driver.findElements(By.tagName("input"));
			System.out.println(listtag.size());
			Thread.sleep(3000);
		}
		//@Test (priority = 0)
		public void classname_testlocations () throws InterruptedException {
			driver.manage().window().maximize();
			driver.get("https://www.daraz.com.bd/#?");
			
			WebElement classname = driver.findElement(By.className("search-box__input--O34g"));
			classname.sendKeys("Phone");
			Thread.sleep(3000);
		}
		//@Test (priority=1)
		public void cssSelector_class_testlocation () throws InterruptedException {
			driver.manage().window().maximize();
			driver.get("https://www.daraz.com.bd/#?");
			//class thakle .(dot) use korbo ar Id thhakle # use korbo
			WebElement cssSelector = driver.findElement(By.cssSelector(".search-box__button--1oH7"));
			cssSelector.click();
			Thread.sleep(3000);
		}
		@Test
		public void xpath_location () throws InterruptedException {
			driver.manage().window().maximize();
			driver.get("https://www.daraz.com.bd/#?");
			/*
			 * Relative xpath :
			 * format 1 = //tagName[@attributeName='value']
			 * format 2 = //*[@attributeName = 'value'] 
			 * format 3 = //*[contains(text(),'value')]
			 * format 4 = //*[@attributeName='value' and @attributeName = 'value']
			 * format 4 = //*[@attributeName='value' or @attributeName = 'value']

			 */
			WebElement xpath = driver.findElement(By.xpath("//*[@class= 'card-categories-ul']/div[3]/a"));
			xpath.click();
			Thread.sleep(5000);
		}

}
