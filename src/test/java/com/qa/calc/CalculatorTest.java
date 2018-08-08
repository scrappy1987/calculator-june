package com.qa.calc;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void addTest() {
		Calculator calc = new Calculator();
		int actualValue = calc.add(2,2);
		Assert.assertEquals(4, actualValue);
	}
	
	@Test
	public void subtractTest() 
	{
		Calculator calc = new Calculator();
		int actualValue = calc.subtract(3,1);
		Assert.assertEquals(2, actualValue);
	}

}
