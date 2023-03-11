package actitiime.basicTestscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClassD {
	@Test
	public void demo() {	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}

}
