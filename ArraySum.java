package Array;

import java.util.Scanner;

public class ArraySum {
	public static void main(String[] args)   
	{  
	int sum=0;
	int i;
	int n;  
	Scanner sc = new Scanner(System.in);  
	System.out.print("Enter the number of elements you want to store: ");  
	//reading the number of elements from the that we want to enter  
	n=sc.nextInt();  
	//creates an array in the memory of length 10  
	int[] array = new int[n];  
	System.out.println("Enter the elements of the array: ");  
	for(i=0; i<n; i++)  
	{  
	//reading array elements from the user   
	array[i]=sc.nextInt();  
	}  
	System.out.println("Array elements are: ");  
	// accessing array elements using the for loop  
	for (i=0; i<n; i++)   
	{  
	System.out.println(array[i]);  
	}  
	for(i=0;i<array.length;i++) {
		sum=sum+array[i];
	}

	System.out.println("Sum of the numbers given in an aaray by you is "+sum);
	sc.close();
}  
}

