package com.infy.demo.binary.search;

/*
 * When to use Binary search?
 * when the array is given as the sorted array then you should first try to resolve the problem with binary if not then go for other
 * Worst case time complexity for the BS id 0(logn)
 * It divide the array into N/2 manner to find the the target element
 */
public class BinarySearch {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
		int target = 18;

		System.out.println("BinarySearch(" + target + ") is at Index = " + BinarySearch.binarySearch(arr, target));

	}

	static int binarySearch(int[] arr, int target) {

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {

			// find the middle element of the array
			int mid = start + (end - start) / 2;

			if (target < arr[mid]) {
				
				end = mid - 1; // if the target element is less than mid then our search the element on the left of the mid
				
			} else if (target > arr[mid]) {
				
				start = mid + 1; // if the target element is greater than mid then our search the element on the right side of the mid
				
			} else {
				
				return mid; //Matching string is found
			}
		}

		return -1; // No matching number is found while loop is break
	}

}
