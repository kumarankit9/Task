package com.banglore;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MathUtilsTest {

	MathUtils mathutils;
	
	@Before
	public void setUp() {
		 mathutils=new MathUtils();
	}
	@Test
	public void testAdd() {
		
		int expected=2;
		int actual=mathutils.add(1,1);
		assertEquals(expected, actual);
		System.out.println("test case ran");
	}
	
	@Test
	public void testSub() {
		
		int expected=0;
		int actual=mathutils.sub(1,1);
		assertEquals(expected, actual);
		System.out.println("test case ran");
	}
	
	@Test
	public void testArrayCheck() {
		
		Integer expected=4;
		Integer actual=mathutils.arrayCheck(new Integer[]{1,3,4,2});
		assertEquals(expected, actual);
		System.out.println("test case ran");
	}
	
	@Test
	public void testcheckElement() {
		
		Integer expected=5;
		Integer actual=mathutils.checkElement(new Integer[] {2,4,1,3});
		assertEquals(expected, actual);
		System.out.println("test case ran");
	}

}
