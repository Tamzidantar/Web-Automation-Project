package bd.com.FastAutomation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;
//extends BaseDriver
public class TestNGBasic  {
	@Test (priority = 2)
	public void FastTest() {
		System.out.println("Fast test run");
	}
	@BeforeSuite
    public void beforsuite() {
	System.out.println("Befor suite fast run");
    }
	@AfterSuite
    public void Aftersuite() {
		System.out.println("Aftr suite last run ");
	}
	@BeforeClass
    public void beforclass() {
	System.out.println("Befor class run");
    }
	@AfterClass
	public void afterclass() {
		System.out.println("After class run");
	}
	@BeforeTest
	public void befortest() {
		System.out.println("Befor test run");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("After test run");
	}
	@BeforeMethod
	public void brformethod() {
		System.out.println("Brfor method run");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("After Method Run");
	}
	@Test (priority = 0)
	public void secondTest() {
		System.out.println("Second test run");
	}@Test (priority = 1)
	public void thirdTest() {
		System.out.println("Third test run");
	}


}
