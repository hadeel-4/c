package ca;

import static org.junit.Assert.*;

import org.junit.Test;



import org.junit.Assert;

class catest {

	
		public void testSum_BothNumbersArePositive_ShouldReturnPositive() {
		// Arrange
		int a = 10;
		int b = -1*20;
		ca calc = new ca();
		// Act
		int result = calc.add(a, b);
		
		// Assert
		Assert.assertTrue(result > 0);
		}
	
		
	
		
		
		
	
	@Test
	public void testSum_BothNumbersArePositive_ShouldReturnPositiveNumber() {
		// Arrange
		int a = 10;
		int b = 1*20;
		ca calc = new ca();
		// Act
		int result = calc.add(a, b);
		
		// Assert
		Assert.assertTrue(result > 0);
		}
	
	

}

