package datastructures;

import java.util.Arrays;

public class ArrayEx {
	
	public static void main(String[] args) {
		
	// Initialize
	int[] arr = {1,2,3,4,5};

	
	// Initialize Method #2
	int[] arr2 = new int[10];
	for (int i = 0; i < arr2.length; i++)
	{
		arr2[i] = i+1;
	}
	
	System.out.print("Array contents: ");
	// Print
	for (int n : arr)
	{
		System.out.print(n);
	}
	System.out.println();
	
	// Length
	System.out.println("Array length: " + arr.length);
	
	// Arrays class print
	System.out.println("Array 1: " + Arrays.toString(arr));
	System.out.println("Array 2: " + Arrays.toString(arr2));
	
	// Arrays class clone
	int[] arr3 = arr2.clone();
	System.out.println("Array 3: " + Arrays.toString(arr3));
	String[] arr4 = new String[10];
	Arrays.fill(arr4, "member");
	System.out.println("Array 4: " + Arrays.toString(arr4));
	
	// Arrays class equality
	System.out.println("Is Array 1 equal to Array 2: " + Arrays.equals(arr, arr2));
	System.out.println("Is Array 2 equal to Array 3: " + Arrays.equals(arr2, arr3));

	}
}
