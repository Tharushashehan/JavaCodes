import java.util.Scanner;

import java.io.*;

public class Test2 {

	public static void main(String a[]){
		System.out.println("hello world");
		
		Scanner Scan = new Scanner(System.in);
		 
		System.out.println("enter no:");
		int i = Scan.nextInt();
		System.out.println(i);
		
		Console c = System.console();
		System.out.println("Enter your name: ");
		String n=c.readLine();
		System.out.println("Welcome "+ n);
		
		
		ab();
		for(int x=0;x<5;x++){
			for(int y=0;y<x;y++){
			
			System.out.print("*");
				
				}
			System.out.println(" ");
			
		}
	}
	static void ab(){
		System.out.println("lets see\f\f");
		System.out.println((int)1.999);
	}
}
class t{
	static void ab(){
		System.out.println("lets see");
	}
}