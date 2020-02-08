package com.epam.maven_oops;

import java.util.Scanner;
public class Gift {
	 int weight=0;
     int sum=0;
 public void collection()
 {
     System.out.print("Enter weigth of the gift:");
     Scanner s=new Scanner(System.in);
     weight=s.nextInt();
     sum=sum+weight;
 }
 public int total_weight()
 {
     return sum;
 }

}
