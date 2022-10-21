package com.infy.demo.binary.search;


/*
 * Find the element in array having infifnite array 
 * 
 * mean we cannot use the arr.lenght we don't know the size of the array
 */
public class FindElementInInfiniteArray {

	public static void main(String[] args) {
		
	 int[] arr = {3,5,7,10,13,15,17,18,23,24,26,34,37,45,49,56,58,99,101,102,104,109,209,307,408};
	 int target = 15;
	 
	 System.out.println("the index of the taget("+target+") ="+FindElementInInfiniteArray.findSearchingRangeArray(arr, target));

	}

	static int findSearchingRangeArray(int[] arr, int target) {
		
		int start = 0;
		int end =1;
		
		while(target>arr[end]) { //check the array of the last element with the target
			
			int newstart = end+1;
			
			//double the bx value 
			//end  = previous end + sizeof the box *2
			
			end = end + (end - start+1)*2;
			
			start= newstart;
			
		}
		
		return binarySearch(arr,target, start , end); //Once while loop break we go the searching range that we want to search the element
	}
	
	static int binarySearch(int[] arr, int target, int start, int end) {


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
