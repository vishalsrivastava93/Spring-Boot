package com.vennmach.test;

/**
 * 
 * @author Vishal Srivastava
 *
 */
public class MaxMinWindow {

	public int getMax(int arr[]){

		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
		return max;
	}
	public int getMin(int arr[]){
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
				min=arr[i];
		}
		return min;

	}
	public void getMinMaxWindow(int arr[]){
		int n=arr.length;
		int windowSize=1;
		//System.out.print(getMax(arr)+" , ");
		for(int i=0;i<n-1;i++){  //This loop denotes window size
			int maxArr[]=new int[n];
			int maxCount=0;
			for(int j=0;j<(n-windowSize);j++) //for traversing all elements
			{	
				int minArr[]=new int[windowSize];
				int minCount=0;
				for(int k=j;k<(j+windowSize);k++)
				{
					minArr[minCount]=arr[k];
					minCount ++;
				}
				maxArr[maxCount]=getMin(minArr);
				maxCount++;
			}
			System.out.print(getMax(maxArr)+ " , ");
			windowSize++;
		}
		System.out.print(getMin(arr));
	}


}
