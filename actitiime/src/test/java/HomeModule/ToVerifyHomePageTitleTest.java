package HomeModule;

import org.testng.Assert;
import org.testng.annotations.Test;

import actitiime.genericUtility.BaseClass;
import actitiime.genericUtility.WebDriverUtility;

public class ToVerifyHomePageTitleTest extends BaseClass {
	
	@Test
	public void verifyHomePageTest() {
		String expectedTitle = "Enter";
		
		WebDriverUtility wUtils=new WebDriverUtility();
		wUtils.waitForTitleToDisplay(driver, "Enter");
		
		String actualTitle = driver.getTitle();
		Assert.assertTrue(actualTitle.contains(expectedTitle));
		System.out.println("The Title has been verified");
		
	}

}
