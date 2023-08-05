package org.example.impl.tests;

import org.example.impl.ExamplePluginImplementation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExampleTest {

	ExamplePluginImplementation sut = null;
	
	@BeforeEach
	public void setUp() {
		sut = new ExamplePluginImplementation();
	}
	
	@Test
	public void testAddTwoNumbersZeroTest() {
		Assertions.assertEquals(0, sut.addTwoNumbers(0, 0));
	}

	@Test
	public void testAddTwoNumbersPositive() {
		Assertions.assertEquals(3, sut.addTwoNumbers(1, 2));
	}

	@Test
	public void testAddTwoNumbersNegative() {
		Assertions.assertEquals(-7, sut.addTwoNumbers(-3, -4));
	}

	@Test
	public void testSimpleTest() {
		Assertions.assertTrue(true);
	}
	
}
