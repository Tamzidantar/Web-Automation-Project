package bd.com.FastAutomation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class OpenUrl extends BaseDriver{
	String url = "https://testng.org/testng-eclipse/download";
	@Test
public void testUrl() {
		driver.manage().window().maximize();
		driver.get(url);
	}

}
