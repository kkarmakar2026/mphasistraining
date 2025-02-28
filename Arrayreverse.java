package com.test;
import java.util.Scanner;

public class Arrayreverse
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
	 
	 int max = Integer.MIN_VALUE;
	 int min = Integer.MAX_VALUE;
	 
	 for (int i = 0; i<size; i++)
	 {
		 if(array[i]>max)
		 {
			 max = array[i];
		 }
		 
		 if(array[i]<min)
		 {
			 min = array[i];
		 }
	 }
	 
	 System.out.println("The reverse array is: ");
	 for(int i = size-1; i>-1; i--)
	 {
		 System.out.print(array[i]+" ");
	 }
	 System.out.println();
	 
	 System.out.println("This is the maximun value of the array :" + max);
	 System.out.println("This is the maximun value of the array :" + min);
	 sc.close();
 }
}
