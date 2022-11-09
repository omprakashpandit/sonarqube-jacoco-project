package com.pak.jacoco;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
//JUNIT 5 (dependency added)
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

	String input1 = "noon";
	App app = new App();
	boolean expected = true;

	@Test
	public void isPlaindromeTest() {
		assertEquals(expected, app.isPalindrome(input1));
	}

	@Test
	public void isNotPlaindromeTest() {
		assertEquals(false, app.isPalindrome("abc"));
	}
       /* JUNIT 4*/
	@Test(expected = IllegalArgumentException.class)
	public void isNotPlaindromeExceptionTest() {
		assertEquals(false, app.isPalindrome(null));
	}
	/* JUNIT 5*/
	/*
	@Test
        void IllegalArgumentExceptionTest() {
	Assertions.assertThrows(IllegalArgumentException.class, () -> {
		assertEquals(false, app.isPalindrome(null));
	});
	}
	*/


}
