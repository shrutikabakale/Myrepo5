package com.javabykiran.AssignmentArray;


import java.util.Arrays;

public class MergeArray {
	public static void main(String[] args) {
		//           0   1    2
		int a[] = { 10, 20, 30 };  // 
		//           3   4   5
		int b[] = { 100, 200, 300 };

		int merge[] = new int[a.length + b.length];
		for (int i = 0; i < a.length; i++) {  // 0 1 2
			merge[i] = a[i];  
		System.out.println(merge[i]);
		}

		for (int k = 0; k < b.length; k++) {   // 0 1 2
			//    1+3=4
			merge[k + a.length] = b[k];      //  3   4   5
			
			System.out.println(merge[k + a.length]);
		}
		
		//System.out.println(Arrays.toString(merge));
		 
		for (int i = 0; i < merge.length; i++) {

			System.out.println(merge[i]);
		
	}

}
}
