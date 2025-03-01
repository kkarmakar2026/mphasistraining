package com.test;

import java.util.Scanner;

public class EvenOdd
{
	 public static void main(String a[])
	 {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the size of the array");
		 int size = sc.nextInt();
		 
		 int []array = new int [size];
		 
		 System.out.println("Enter the element of the array: ");
		 for(int i = 0; i< size; i++)
		 {
			 array[i] = sc.nextInt();
		 }
		 
		int [] newarray = new int[size];
		
		int evenIndex = 0;
		int oddIndex = size-1;
		
		for(int num : array)
		{
			if(num%2==0)
			{
				if(evenIndex <size)
				{
				newarray[evenIndex] = num;
				evenIndex++;
				}
			}
			else 
			{
				if(oddIndex>=0)
				{
				newarray[oddIndex] =num ;
				oddIndex--;
				}
			}
		}
		
		System.out.println("The modified array is : ");
		for (int value : newarray)
		{
			System.out.print( value+ " ");
		}
		sc.close();
	 }
}
