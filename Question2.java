package com.exam;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args)
	{   
		Scanner input =new Scanner(System.in);
		System.out.print("Enter the Array Limit :");
		int l =input.nextInt();
		int [] a =new int[l];
		for(int i=0;i<l;i++)
		{
			System.out.printf("Element of a[%d] :",i);
			a[i]=input.nextInt();
		}
		System.out.println("\nEven Array Elements...\n");
		for(int e:a)
		{
			if(e%2==0)
				System.out.println(e);
		}
    }
}
