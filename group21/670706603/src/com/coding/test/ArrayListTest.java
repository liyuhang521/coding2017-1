package com.coding.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.coding.basic.ArrayList;

public class ArrayListTest {
	private static ArrayList arraylist = new ArrayList();

	/* private static Object[] elementData = new Object[1]; */

	@Test
	public void testAddObject() {
		for (int i = -3; i < 10000; i++) {
			arraylist.add("2"+i);
			
		}
		for (int i = -3; i < 10000; i++) {
			assertEquals("2"+i, arraylist.get(i + 3));
			
		}
		
	}

	@Test
	public void testAddIntObject() {
		fail("Not yet implemented");
	}

	@Test
	public void testGet() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemove() {
		fail("Not yet implemented");
	}

	@Test
	public void testSize() {
		fail("Not yet implemented");
	}

	@Test
	public void testIterator() {
		fail("Not yet implemented");
	}

}
