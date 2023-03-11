package actitiime.basicTestscripts;

import org.testng.annotations.Test;

import actitiime.genericUtility.BaseClass;

public class ToCreateALead extends BaseClass {
	
	@Test
	public void createLead() {
		System.out.println("The Lead has been created");
	}

	@Test
	public void createProduct() {
		System.out.println("The Product has been created");
	}

}
