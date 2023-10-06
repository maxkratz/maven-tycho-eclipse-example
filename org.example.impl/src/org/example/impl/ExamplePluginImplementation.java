package org.example.impl;

public class ExamplePluginImplementation {

	/**
	 * Runs an example function that prints "Hello World!".
	 * 
	 * @param args Array of String arguments that will be ignored.
	 */
	public static void main(final String[] args) {
		System.out.println("Hello World!");
	}

	/**
	 * Adds two integer numbers together.-
	 * 
	 * @param a First integer to add.
	 * @param b Second integer to add.
	 * @return Sum of both integers a and b.
	 */
	public int addTwoNumbers(final int a, final int b) {
		return a + b;
	}

	/**
	 * Dummy method that tries to access a field of org.apache.commons.io.
	 */
	public void dummy() {
		final char c = org.apache.commons.io.FilenameUtils.EXTENSION_SEPARATOR;
	}

}
