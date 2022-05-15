package com.javabykiran.AssignmentArray;

public class Initialize {
	public static void main(String[] args) {
		int a[]={1,3,5};
		
		String b[]={"frog","toad","Squirrel"};
		System.out.println(a.length);
		System.out.println(b.length);
		
		//System.out.println(a[0]);
		//System.out.println(b[0]);
		/*for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}*/
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		for(int i=b.length-1;i>=0;i--){
			System.out.println(b[i]);
		}
	}

}
