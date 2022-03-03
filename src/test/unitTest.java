package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class unitTest {
	
	uintConversion obj1 = new uintConversion();
	@Test
	public void test() {
		int output = obj1.gtk(10);
		assertEquals(1000, output);
	}
}
