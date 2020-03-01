package main;

import static org.junit.Assert.*;

import org.junit.Test;

import ca.ca;

public class catest {

	@Test
	public void testAdd() {
		int a = 10;
		int b = 20;
		ca calc = new ca();
		// Act
		int result = calc.add(a, b);
		// Assert
		assertTrue(result > 0);

	}

}
