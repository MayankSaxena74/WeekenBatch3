package actitiime.basicTestscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassA2 {
	
	@Test(enabled = false)
	public void a() {
		
		System.out.println("Hello");
	}
	
	@Test(enabled = false)
	public void b() {
		
		System.out.println("Bye");
	}
	
	@Test(enabled = false)
	public void c() {
		System.out.println("Will you go out for a Dinner");
	}
	
	@Test(invocationCount = 5)
	public void d() {
		System.out.println("Hi");
	}

}
