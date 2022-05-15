package com.javabykiran.InclassArray;

public class AdditionofArray {
	public static void main(String[] args) {
		int a[]={12,45,81,49,39,456};
		int sum=0;
		for(int i=0;i<a.length-1;i++){
		//	int sum=0;
			a[i+1]=a[i]+a[i+1];
			sum=sum+a[i+1];
		}System.out.println(sum);
	}
}
