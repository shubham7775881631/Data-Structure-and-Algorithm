package com.infy.demo.binary.search;


/*Problem:
 * Given array of the character which is sorted in non- decreasing order and the character target,
 * return the smallest character in the array that is larger than the target
 * 
 * Note: Letters are Wrap around
 * Ex. in= ['a' ,'b']  target=z
 * op =a 
 * 
 * Ex-1
 * in = ['c' , 'f', 'j'] target = a
 * op = c
 * Ex-2
 * in = ['c' , 'f', 'j'] target = c
 * op = f
  * Ex-3
 * in = ['c' , 'f', 'j'] target = d
 * op = f
 */


/*Solution: the above problem is similar to the ceiling of the binary search 
 * Just need to read carefully. In the given problem the we do not need to find the matching character, we need to find the arr[element] > target
 * 
 * Wrap around  : if no none character is found then just return the first character
 */
public class SmallestLetterBSProblem {

	public static void main(String[] args) {
		
		char[] arr = {'c', 'f','j'};
		char target = 'k';
	
		System.out.println("SmallestLetterBS("+target+") character is  = " + SmallestLetterBSProblem.findSmallestLetter(arr, target));

	}

	private static char findSmallestLetter(char[] arr, char target) {
		
		int start =0;
		int end = arr.length-1;
		int iteration =0;
		
		
		while(start<=end) {
			
		System.out.println("Iteration-"+iteration +"-> start="+arr[start]+" end="+arr[end]);
		
		++iteration;
		//find the middle element
		//to avoid number exceed we are doing the end-start  [ 2, 3, 5, 9, 14, 16, 18 ]
		int mid = start + (end - start)/2;
		System.out.println(" mid ==>"+ arr[mid]);
		if(target < arr[mid]) {
			
			end = mid-1;  // searching the element in the left side of the array

		}else if (target > arr[mid]) {
			
			start = mid+1; //searching the target element in the right hand side of the array
		}else {
			return arr[mid+1]; // if matching element is found then return element next to that element
		}
		
	}
	
	//No matching no found in the array returning the smallest element which is greater than the target 
	return arr[start%arr.length];
	}

}
