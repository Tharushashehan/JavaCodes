package LabSheet;

import java.util.Scanner;

public class Test14 {
	public static void main(String a[]){
		//Byte b = new Byte();
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Character.MAX_VALUE);
		System.out.println(Character.MIN_VALUE);
		//System.out.println(valueOf("int"));
		System.out.println(Byte.MIN_VALUE);
		
		Scanner s = new Scanner(System.in);
			String phrase = s.next();
			phrase = phrase.toLowerCase();
			int count = 0 ;
			for ( int i =0;i < phrase.length () ; i++)
				{
					char c = phrase.charAt(i);
					if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
						{
							count ++;
						}
		}
			System.out.println(count);
			
		

	}

}
