package algorithm;

import java.util.ArrayList;
import java.util.List;


public class Algorithm {

	/**
	 * Takes an array of integers and returns that array rotated by N positions using the System.arraycopy method
	 * @param array
	 * @param positions
	 * @return array rotated N positions
	 */
	public Integer[] rotateArrayWithArrayCopy(Integer[] array, int positions) {
		// If the list is null, a new empty array is returned
		if(array == null || array.length == 0) {
			return new Integer[] {};
		}

		// In this variable will be saved the results
		Integer[] rotated = new Integer[array.length];

		// I'm using the JDK arraycopy method. It received 5 parameters:
		// the source array, the source initial position, the destination array, the destination initial position to begin the copy, and the quantity of elements to copy.
		
		// First of all, I'll copy the last N element of the original array, to the new array.
		System.arraycopy(array, array.length-positions, rotated, 0, positions);
		// Then, I'll copy the rest of the elements (from the beginning excluding the last N value) after the last N elements that I've copied.
		System.arraycopy(array, 0, rotated, positions, array.length-positions);
		
		// Returning the array rotated N positions
		return rotated;
	}
	
	/**
	 * Takes an array of integers and returns that array rotated by N positions.
	 * @param array
	 * @param positions
	 * @return array rotated N positions
	 */
	public Integer[] rotateArray(Integer[] array, int positions) {
		// If the list is null, a new empty array is returned
		if(array == null || array.length == 0) {
			return new Integer[] {};
		}

		int addedElementQty = 0;
		
		// In this variable will be saving the results
		Integer[] rotated = new Integer[array.length];
		
		// First, I iterate over the array only the last N values
		for(int i = array.length - positions; i < array.length; i++) {
			// Save the current value on the rotated temporal list
			rotated[addedElementQty] = array[i];
			addedElementQty++;
		}

		// Second, I iterate over the array, from the beginning excluding the last N value
		for(int i = 0; i < array.length - positions; i++) {
			// Save the current value on the rotated temporal list
			rotated[addedElementQty] = array[i];
			addedElementQty++;
		}
		
		// Returning the array rotated N positions
		return rotated;
	}

	/**
	 * Takes an list of integers and returns that array rotated by N positions.
	 * @param list
	 * @param positions
	 * @return array rotated N positions
	 */
	public List<Integer> rotateArray(List<Integer> intList, int positions) {
		// In this variable will be saving the results
		List<Integer> rotated = new ArrayList<Integer>();
		
		// If the list is null or empty, a new empty list is returned
		if(intList != null && intList.size() > 0) {
		
			// First, I iterate over the list only the last N values
			for(int i = intList.size() - positions; i < intList.size(); i++) {
				// Save the current value on the rotated temporal list
				rotated.add(intList.get(i));
			}
	
			// Second, I iterate over the list, from the beginning excluding the last N value
			for(int i = 0; i < intList.size() - positions; i++) {
				// Save the current value on the rotated temporal list
				rotated.add(intList.get(i));
			}
			
		}
		
		// Returning the list rotated N positions
		return rotated;
	}
}