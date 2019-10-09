package com.flexon.listsort;

import org.junit.*;
import org.junit.jupiter.api.Test;

class TestingSort {

	@Test
	public void test() {
		int[] expected = {9,8,7,6,5,4};
		int[] given = {4,5,6,7,8,9};
		Assert.assertArrayEquals(expected, ArraySort.bubbleSort(given));
		int minexpected = 4;
		Assert.assertEquals(minexpected,ArraySort.findMin(given));
		int maxexpected = 9;
		Assert.assertEquals(maxexpected,ArraySort.findMax(given));
		int[] expectedrev = {4,5,6,7,8,9};
		Assert.assertArrayEquals(expectedrev,ArraySort.reverseArray(given));
		
	
	}

}
