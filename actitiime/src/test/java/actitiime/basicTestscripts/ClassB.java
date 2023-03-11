package actitiime.basicTestscripts;

import org.testng.annotations.Test;

public class ClassB {
	
	@Test(groups = "smoke")
	public void demo1() {
		System.out.println("Smoke testing");
	}
	
	@Test(groups = "regression")
	public void demo2() {
		System.out.println("Regression testing");
	}
	
	@Test(groups = "smoke")
	public void demo3() {
		System.out.println("Smoke testing");
	}
	
	
	@Test(groups = "regression")
	public void demo4() {
		System.out.println("Regression testing");
	}

}
