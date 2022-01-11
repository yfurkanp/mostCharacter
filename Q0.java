package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q0 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to get a String from user as input and find the maximum occurring character in that string. (Ignore case sensitivity)

			input :

			Learning java is easy

			output:

			maximum occurring character is : a
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir String giriniz : ");
		String cumle=scan.nextLine().toLowerCase();
		char a[]=new char[cumle.length()];
		 for (int i = 0; i < cumle.length(); i++) {
			 
			a[i]=cumle.charAt(i);
		}
		int count=0;
		int count2=0;
		char arr[]=new char[1];
		  for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i]==a[j]) {
					count++;
				
				}
				if(count>count2) {
					count2=count;
					count=0;
					arr[0]=a[i];
				}
			}
		}
		  
		  System.out.println(count);
		  System.out.println(arr[0]);
		
		
	
		
		
		
		
		
		
		
		

	}

}
