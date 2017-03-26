package com.coding.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.coding.basic.Queue;

public class QueueTest {
	Queue queue = new Queue();

	@Test
	public void testEnQueue() {
		for (int i = 0; i <= 100; i++)
			queue.enQueue(i);
	}

	@Test
	public void testDeQueue() {
		for (int i = 0; i <100; i++)
			assertEquals(i+1, queue.deQueue());
	}

	@Test
	public void testIsEmpty() {
		assertEquals(true, queue.isEmpty());
	}

	@Test
	public void testSize() {
		assertEquals(0, queue.size());
	}

}
