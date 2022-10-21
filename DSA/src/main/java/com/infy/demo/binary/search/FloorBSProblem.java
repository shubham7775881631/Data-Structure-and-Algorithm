package com.infy.demo.binary.search;


/*
 * Floor of the number: it the greatest element in the array which less than the target
 * 
 * greatest arr[element]<=target
 */
public class FloorBSProblem {

	public static void main(String[] args) {
		
		int[] arr = {2, 3, 5, 9, 14, 16, 18};
		int target = 100; 
	
		System.out.println("Floor("+target+") is at Index = " + FloorBSProblem.findFloorNumber(arr, target));

	}

	private static int findFloorNumber(int[] arr, int target) {
		
		int start=0;
		int end = arr.length -1 ;
		
		while(start<=end) {
			
			
			int mid = start + (end -start)/2;
			
			
			if(target<arr[mid]) {
				end = mid -1;
			}else if(target>arr[mid]) {
				start = mid+1;
			}else {
				return mid; // Find the Matchinig element
			}
		}
		// Return the greatest element which is less the then the target
		return end;
	}

}
