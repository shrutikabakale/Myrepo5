package com.javabykiran.AssignmentArray;

public class EqualTest {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3 };
		int b[] = { 1, 2, 4 }; // diff
		int temp = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i])
				temp = 1;
		}
		if (temp == 0) {
			System.out.println("same");
		} else {
			System.out.println("different");
		}

		/*
		 * for (int i = 0; i < a.length; i++) { if (a[i] == b[i]) {
		 * System.out.println("same"); } else { System.out.println("different");
		 * }
		 * 
		 * }
		 */
	}
}
