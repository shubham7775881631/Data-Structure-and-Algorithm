package com.infy.demo.binary.search;
/* TO FIND THE CELING OF THE NUMBER
 * Ceiling of the number - the smallest element in the array which is greater than than equal to target
 * In Binary search we are finding the matching i.e target element is matched in array then only we are  return the index of the target element           
 * In the ceiling of the number we have two condition arr[element]>=target ( greater than taget and equls to also)
 * In BS already matching no (=) is covered. Now for to find the smallest element in the array which greater than the target mean it is start element of the previous index
 * when the while loop is voilated start<=end  then we get our our ceiling no. return -1 =====> return start
 *
 */
 
public class CeilingBSProblem {

	public static void main(String[] args) throws Exception {
		
		int[] arr = {2, 3, 5, 9, 14, 16, 18};
		int target = 12;
	
		System.out.println("Ceiling("+target+") is at Index = " + CeilingBSProblem.findCeilingNumber(arr, target));

	}
	
	public static Integer  findCeilingNumber(int[] arr, int target) throws Exception{
		
		int start =0;
		int end = arr.length-1;
		int iteration =0;
		
		if(target>arr[end]) {
			return -1;
		}
		
		
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
			}
			else {
				
				return mid;  // return the Matching number in the array
			}
			
		}
		
		//No matching no found in the array returning the smallest element which is greater than the target 
		return start;
		
	}
	
	
	

}
