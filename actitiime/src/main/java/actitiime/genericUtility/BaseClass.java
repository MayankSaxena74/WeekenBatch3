package actitiime.genericUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import POM.HomePage;
import POM.LoginPage;

public class BaseClass {
	
	public WebDriver driver;
	
	@BeforeSuite
	public void bsConfig() {
		System.out.println("The Data base connection has been established");
	}
	
	@BeforeClass
	public void bcConfig() {
		driver=new ChromeDriver();
		System.out.println("The Browser has been launched");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.actitime.com/login.do");
		System.out.println("The URL has been navigated");
	}
	
	@BeforeMethod
	public void bmConfig() {
		LoginPage login=new LoginPage(driver);
		login.loginAction("admin", "manager");
		System.out.println("The Login is successfull");
	}
	
	@AfterMethod
	public void amConfig() {
		HomePage home=new HomePage(driver);
		home.logoutAction();
		System.out.println("The logout action is succesfull");
	}
	
	@AfterClass
	public void acConfig() {
		driver.quit();
		System.out.println("The Browser has been Closed");
	}
	
	@AfterSuite
	public void asConfig() {
		
		System.out.println("The Data base connection has been closed");
	}

}
