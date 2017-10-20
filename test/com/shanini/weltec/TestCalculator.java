package com.shanini.weltec;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class TestCalculator {
	Calculator myCalculator;

	@Before
	public void setUp() throws Exception {
		myCalculator=new Calculator();
	}

	@Test
	public  void testAdd() {
		double total=5.0+4.0+6.0;
		Assert.assertEquals(total, myCalculator.add(5.0,4.0,6.0), 0.0);
	}
	
	@Test
	public  void testMultiply() {
		double total=5.0*4.0*6.0;
		Assert.assertEquals(total, myCalculator.multiply(5.0,4.0,6.0), 0.0);
	}
	@Test
	public  void testSubstract() {
		double total=6.0 - 5.0;
		Assert.assertEquals(total, myCalculator.substract(6.0, 5.0), 0.0);
	}

}
