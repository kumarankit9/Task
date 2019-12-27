package com.banglore;

public class MathUtils {
   
	public int add(int a,int b) {
	    return a+b;
	}
	
	public int sub(int a,int b) {
	    return a-b;
	}
	
	public Integer arrayCheck(int ar[])
	{
		int arr[]=ar;
		int max=0;
		for(int i=0;i<=arr.length-1;i++ )
		{
			if(arr[i]>max)
				max=arr[i];
			System.out.println(max);
		}
		return max;
		
	}
	
}
