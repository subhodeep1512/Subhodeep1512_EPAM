package com.epam.maven_oops;

public class Candies extends Gift {
	boolean range_in_gift(int l,int h)
	{
		if(weight>=l && weight<=h)
		{
			return true;
		}
		else
		{
			return false;
		}
	}  

}
