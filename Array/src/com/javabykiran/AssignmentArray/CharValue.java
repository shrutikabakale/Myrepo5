package com.javabykiran.AssignmentArray;

public class CharValue {
	public static void main(String[] args) {
		char [] ca=new char [5];
		ca[0]='a';
		ca[1]='b';
		ca[2]='c';
		ca[3]='d';
		ca[4]='e';
		/*for(int i=0;i<ca.length;i++){
			System.out.println(ca[i]);*/
		for(char value:ca){
			System.out.println(value);
		
			
		}
	}

}
