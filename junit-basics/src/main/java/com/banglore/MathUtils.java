package com.banglore;

public class MathUtils {
   
	public int add(int a,int b) {
	    return a+b;
	}
	
	public int sub(int a,int b) {
	    return a-b;
	}
	
	public Integer arrayCheck(Integer ar[])
	{
		Integer arr[]=ar;
		Integer max=0;
		for(int i=0;i<=arr.length-1;i++ )
		{
			if(arr[i]>max)
				max=arr[i];
			System.out.println(max);
		}
		return max;
	}
	
	public Integer checkElement(Integer ar[]) {
		Integer arr[]=ar;
		Integer sum=0;
		Integer totalSum=0;
		
		Integer totalNumber=arr.length+1;
		
		Integer actualSum=totalNumber * ((totalNumber + 1) / 2);
		
		for(Integer array:arr)
			sum=sum+array;
		
		Integer missingNumber=actualSum-sum;
		
		System.out.println(missingNumber);
		return missingNumber;
		
		
		
	}
	
}
