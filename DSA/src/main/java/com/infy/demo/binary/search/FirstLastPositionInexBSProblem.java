package com.infy.demo.binary.search;


/*Given an array of ineteger nums sorted int eh ascending order find the starting  and ending postion of the element in the array 
 * If the target element is not found then return the element [-1, -1] you must writ an algo TC = 0(logn)
 * 
 * Ex-1:
 * ip = [5,7,7,8,8,10] target =8
 * op=[3, 4]
 */
public class FirstLastPositionInexBSProblem {

	public static void main(String[] args) {
      int start = -1,end = -1;
      
     int[] result = {start, end};
     
     int[] arr= {5,7,7,8,8,10};
     int target = 7;
     
		start  = FirstLastPositionInexBSProblem.binarySerarch(arr,target,true);
		end  = FirstLastPositionInexBSProblem.binarySerarch(arr,target,false);
		result[0] =start;
		result[1] = end;
		System.out.println(" The Firat and Last Position of the Index for target"+target +"=["+start+", "+end+"]" );
	}

	private static int binarySerarch(int[] arr, int target, boolean isFindStartIndex) {
		int ans =-1;
		int start =0;
		int end = arr.length -1;
		
		while(start<=end) {
			
			int mid = start+(end-start)/2;
			
			if(target < arr[mid]) {
				end = mid-1;
			}else if(target > arr[mid]) {
				start = mid+1;
			}else {
				
				ans = mid; // if the matching element is found means our number  may be present in the both side so if found the starting index got the left srach again 
				// For the searching the element in the right side for end index of the element
				if(isFindStartIndex) {
					
					end = mid-1;
				}else {
					
					start = mid+1;
				}
			}
		}
		
		return ans;
	}

}
