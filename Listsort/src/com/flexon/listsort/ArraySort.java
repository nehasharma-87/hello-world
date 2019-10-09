package com.flexon.listsort;

import java.util.Scanner;

public class ArraySort {
	
	public void printArray(int[] numarray) {
		for(int i=0;i<numarray.length;i++) {
		System.out.print(numarray[i] +  "  ");}
		
	}
    
    public static int[] bubbleSort(int[] nums) {
    	
    int[] newArray = nums;
    	for(int i = 0;i <newArray.length;i++) {
    		for(int j=1;j<(newArray.length-i);j++) {
    			if (newArray[j]>newArray[j-1]) {
    				int temp = newArray[j];
    				newArray[j] = newArray[j-1];
    				newArray[j-1]=temp;}
    			}
    	} return newArray;
    	
    }
    
    public void getInteger(int[] nums) {
    	Scanner input = new Scanner(System.in);
    	System.out.println("Enter the Index value you want to see: ");
    	int idx = input.nextInt();
    	System.out.println("Integer at Index " + idx + " is: " + nums[idx]);
    }
    public static int findMin(int[] nums) {
    	int min = nums[0];
    	for(int i =1;i<nums.length;i++) {
    		if(nums[i]<min) {
    			min = nums[i];
    		}
    	}return min;
    }
    
    public static int findMax(int[] nums) {
    	int max = nums[0];
    	for(int i =1;i<nums.length;i++) {
    		if(nums[i]>max) {
    			max = nums[i];
    		}
    	}return max;
    }
    
    public int[] newList(int[] nums) {
    	int[] newList = new int[nums.length];
    	for(int i=0;i<nums.length;i++) {
    		newList[i] = nums[i];
    		
    	}return newList;
    }
    public static int[] reverseArray(int[] nums) {
    	int[] newrev = new int[nums.length];
    	for(int i=0;i<nums.length;i++) {
    		newrev[i] = nums[nums.length-i-1];
    	}return newrev;
    	
    }
	public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number of elements you want to enter: ");
        int numofelems = input.nextInt();
        int[] numarray = new int[numofelems];
        
        for(int i = 0;i<numofelems;i++) {
        	System.out.println("Enter the Number:  ");
            int number = input.nextInt();
        	numarray[i] = number;
        	
        }
        
        ArraySort a = new ArraySort();
        a.printArray(numarray);
        
        System.out.println("");
        a.printArray(a.bubbleSort(numarray));
        System.out.println("");
        a.getInteger(numarray);
        
        System.out.println("Minimum no. is: " + a.findMin(numarray));
        System.out.println("Maximum no. is: " + a.findMax(numarray));
        a.printArray(a.reverseArray(numarray));
        
        
        		
        
		
		// TODO Auto-generated method stub

	}

}
