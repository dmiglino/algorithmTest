package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import algorithm.Algorithm;

public class AlgorithmTest {

	/**
	 * Test the algorithm using an array of integers
	 */
	@Test
	public void testRotateArray() {
		// Creation of the arrays
		Integer[] array = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
		Integer[] expected = new Integer[] {8, 9, 1, 2, 3, 4, 5, 6, 7};

		// Call the algorithm
		Algorithm alg = new Algorithm();
		Integer[] result = alg.rotateArray(array, 2);
		
		// The result must be the same as the expected array
		assertNotNull(result);
		assertEquals(9, result.length);
		assertEquals(expected, result);
	}

	/**
	 * Test the algorithm using an array of integers and the method arraycopy()
	 */
	@Test
	public void testRotateArrayWithArrayCopy() {
		// Creation of the arrays
		Integer[] array = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
		Integer[] expected = new Integer[] {8, 9, 1, 2, 3, 4, 5, 6, 7};

		// Call the algorithm
		Algorithm alg = new Algorithm();
		Integer[] result = alg.rotateArrayWithArrayCopy(array, 2);
		
		// The result must be the same as the expected array
		assertNotNull(result);
		assertEquals(9, result.length);
		assertEquals(expected, result);
	}
	
	/**
	 * Test the algorithm using an list of integers
	 */
	@Test
	public void testRotateList() {
		// Creation of the lists
		List<Integer> arrayList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		List<Integer> expectedList = Arrays.asList(8, 9, 1, 2, 3, 4, 5, 6, 7);
		
		// Call the algorithm
		Algorithm alg = new Algorithm();
		List<Integer> result = alg.rotateArray(arrayList, 2);
		
		// The result must be the same as the expected list
		assertNotNull(result);
		assertEquals(9, result.size());
		assertEquals(expectedList, result);
		
		System.out.println("Rotating "+arrayList+ " 2 positions, Result: "+result);
	}

	@Test
	public void testEmptyLists() {
		List<Integer> arrayList = new ArrayList();
		
		Algorithm alg = new Algorithm();
		List<Integer> result = alg.rotateArray(arrayList, 5);
		
		assertNotNull(result);
		assertTrue(result.isEmpty());
		
		arrayList = null;
		
		result = alg.rotateArray(arrayList, 5);
		
		assertNotNull(result);
		assertTrue(result.isEmpty());
	}

	@Test
	public void testEmptyArraysWithArrayCopy() {
		Integer[] array = new Integer[] {};
		
		Algorithm alg = new Algorithm();
		Integer[] result = alg.rotateArrayWithArrayCopy(array, 5);
		
		assertNotNull(result);
		assertTrue(result.length == 0);
		
		array = null;
		
		result = alg.rotateArrayWithArrayCopy(array, 5);
		
		assertNotNull(result);
		assertTrue(result.length == 0);
	}

	@Test
	public void testEmptyArrays() {
		Integer[] array = new Integer[] {};
		
		Algorithm alg = new Algorithm();
		Integer[] result = alg.rotateArray(array, 5);
		
		assertNotNull(result);
		assertTrue(result.length == 0);
		
		array = null;
		
		result = alg.rotateArray(array, 5);
		
		assertNotNull(result);
		assertTrue(result.length == 0);
	}
	
	/**
	 * Stress the algorithm using an array of 10 millons of integers
	 * Average of 33 millis
	 */
	@Test
	public void testRotateArraySTRESSED() {
		// Creation of the arrays
		Integer[] array = new Integer[10000000];
		Integer[] expected = new Integer[10000000];

		for(int i = 0; i < 10000000; i++) {
			array[i] = i;
		}

		int addedElementQty = 0;
		for(int i = 5000000; i < 10000000; i++) {
			expected[addedElementQty] = i;
			addedElementQty++;
		}

		for(int i = 0; i < 5000000; i++) {
			expected[addedElementQty] = i;
			addedElementQty++;
		}
		
		// Call the algorithm
		Algorithm alg = new Algorithm();
		
		long initialTime = System.currentTimeMillis();
		Integer[] result = alg.rotateArray(array, 5000000);
		long endTime = System.currentTimeMillis() - initialTime;
		System.out.println("With Array, it takes: "+endTime+" ms.");
		
		// The result must be the same as the expected list
		assertNotNull(result);
		assertEquals(10000000, result.length);
		assertEquals(expected, result);
	}
	
	/**
	 * Stress the algorithm using an list of 10 millons of integers
	 * Average of 750 millis
	 */
	@Test
	public void testRotateListSTRESSED() {
		// Creation of the lists
		List<Integer> arrayList = new ArrayList(10000000);
		List<Integer> expectedList = new ArrayList(10000000);

		for(int i = 0; i < 10000000; i++) {
			arrayList.add(i);
		}

		for(int i = 5000000; i < 10000000; i++) {
			expectedList.add(i);
		}

		for(int i = 0; i < 5000000; i++) {
			expectedList.add(i);
		}

		// Call the algorithm
		Algorithm alg = new Algorithm();
		
		long initialTime = System.currentTimeMillis();
		List<Integer> result = alg.rotateArray(arrayList, 5000000);
		long endTime = System.currentTimeMillis() - initialTime;
		System.out.println("With List, it takes: "+endTime+" ms.");
		
		// The result must be the same as the expected list
		assertNotNull(result);
		assertEquals(10000000, result.size());
		assertEquals(expectedList, result);
	}

	/**
	 * Stress the algorithm using an array of 10 millons of integers
	 * Average of 21 millis
	 */
	@Test
	public void testRotateArrayWithArrayCopySTRESSED() {
		// Creation of the arrays
		Integer[] array = new Integer[10000000];
		Integer[] expected = new Integer[10000000];

		for(int i = 0; i < 10000000; i++) {
			array[i] = i;
		}

		int addedElementQty = 0;
		for(int i = 5000000; i < 10000000; i++) {
			expected[addedElementQty] = i;
			addedElementQty++;
		}

		for(int i = 0; i < 5000000; i++) {
			expected[addedElementQty] = i;
			addedElementQty++;
		}
		
		// Call the algorithm
		Algorithm alg = new Algorithm();
		
		long initialTime = System.currentTimeMillis();
		Integer[] result = alg.rotateArrayWithArrayCopy(array, 5000000);
		long endTime = System.currentTimeMillis() - initialTime;
		System.out.println("With Array With arrayCopy(), it takes: "+endTime+" ms.");
		
		// The result must be the same as the expected list
		assertNotNull(result);
		assertEquals(10000000, result.length);
		assertEquals(expected, result);
	}
}