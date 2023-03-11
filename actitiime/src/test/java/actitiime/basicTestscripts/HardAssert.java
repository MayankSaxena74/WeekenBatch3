package actitiime.basicTestscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	
	@Test
	public void demo() {
		
		int  actual = 123;
		int expected = 456;
		
		Assert.assertEquals(actual, expected);
	}

}
