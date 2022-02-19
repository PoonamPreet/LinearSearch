package linearsearchdemo;

import java.util.Scanner;

public class LinearSearchDemo
{
	
	public static void main(String[] args) 
	{
		
	
		int a1[]=new int[] {6,4,5,8,2,1,9};
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element to be found");
		int key=sc.nextInt();
		for(int i=0;i<a1.length;i++)
		{
			if(a1[i]==key)
			{
				System.out.println("Element is at index " +i);
				count++;
			}
			
		}
		if (count==0)
		{
		System.out.println("Element not found in the given array");	
		}
		
	}
}
