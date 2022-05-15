package com.javabykiran.AssignmentArray;

public class EqualTest2 {
	public static void main(String[] args) {
		int a[]={10,20,30};
		int b[]={10,20,30};
		int temp=0;
		for(int i=0;i<a.length;i++){
			
		if(a[i]!=b[i]){
			temp=1;
		}
			
		}if (temp==0) {
			System.out.println("Same");
	}else
		System.out.println("Different");
		
		}
	}

