package com.epam.maven_oops;

import java.util.Scanner;

public class Giftbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i,j,total=0;
		System.out.println("Enter no. of Chocolates:");
		int n=sc.nextInt();
		int c[]=new int[n];
		Chocolates ob1[]=new Chocolates[n];
		for(i=0;i<n;i++)
		{
			System.out.println("Guest no "+(i+1)+":");
			ob1[i]= new Chocolates();
			ob1[i].collection();
		}
		for(i=0;i<n;i++)
		{
			c[i]=ob1[i].chocolate_weight();
			total=total+ob1[i].chocolate_weight();
		}
		int flag=0;
		System.out.println("Sort weight of Chocolate:");
		for(i=1;i<n;i++)
		{
			flag=c[i];
			for(j=i-1;j>=0 && c[j]>flag;j--)
			{
				c[j+1]=c[j];
			}
			c[j+1]=flag;
		}
		for(i=0;i<n;i++)
		{
			System.out.print(c[i]+" ");
		}
		System.out.println();
		
		System.out.println("Enter no. of Sweets:");
		int m=sc.nextInt();
		Sweets ob2[]=new Sweets[m];
		for(i=0;i<m;i++)
		{
			System.out.println("Guest no "+(i+1)+":");
			ob2[i]= new Sweets();
			ob2[i].collection();
			total=total+ob2[i].sweet_weight();
		}
		Candies ob3=new Candies();
		System.out.println("Enthe candy range:");
		System.out.println("Enter lower limit:");
		int l=sc.nextInt();
		System.out.println("Enter higher limit:");
		int h=sc.nextInt();
		ob3.collection();

		boolean x=ob3.range_in_gift(l,h);
		if(x==true)
		{
			System.out.println("category is candies");
		}
		else
		{
			System.out.println("category is not candies");
		}
		total=total+ob3.total_weight();
		System.out.println("Children gift's total weight is "+total);


	}

}
