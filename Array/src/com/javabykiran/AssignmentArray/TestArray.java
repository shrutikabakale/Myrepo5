package com.javabykiran.AssignmentArray;

public class TestArray {
	public static void main(String[] args) {
		int a[]=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		for(int i=0;i<a.length;i++){
			System.out.println("i "+i);
			System.out.println(a[i]);
		}
	}

}
