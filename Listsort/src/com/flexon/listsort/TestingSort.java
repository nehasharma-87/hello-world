package com.flexon.listsort;

import  org.junit.Test;
import static org.junit.Assert.*;
//import  org.junit.jupiter.api.Test;

class TestingSort {

	@Test
	public void test() {
		int[] expected = {9,8,7,6,5,4};
		int[] given = {4,5,6,7,8,9};
		assertArrayEquals(expected, ArraySort.bubbleSort(given));
		int minexpected = 4;
		assertEquals(minexpected,ArraySort.findMin(given));
		int maxexpected = 9;
		assertEquals(maxexpected,ArraySort.findMax(given));
		int[] expectedrev = {4,5,6,7,8,9};
		assertArrayEquals(expectedrev,ArraySort.reverseArray(given));
		
	
	}

}
