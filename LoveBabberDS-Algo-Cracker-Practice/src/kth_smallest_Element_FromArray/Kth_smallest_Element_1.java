package kth_smallest_Element_FromArray;

import java.util.Scanner;

//K’th Smallest/Largest Element in Unsorted Array (Simple Method)

public class Kth_smallest_Element_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {80,17,33,8,3,50,12,7};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Kth Element :- ");
		int k=sc.nextInt();
		if(k<array.length-1) {
		int smallest=sort_MyArray_ReturnKth_Smallest_No(array,k);
		System.out.println("\n"+k+"th smallest element in array is "+smallest);
		int largest=sort_MyArray_ReturnKth_Largest_No(array,k);
		System.out.println("\n"+k+"th Largest element in array is "+largest);
		}
		else {
			System.out.println("Kth element should be small then array length ");
		}
		
	}

	private static int sort_MyArray_ReturnKth_Largest_No(int[] array, int k) {
		// TODO Auto-generated method stub
		int temp=0;  //bubble sort Descending 
		int len=array.length-1;
		for(int i=0;i<len;i++ ) {
			
			for(int j=0;j<(len-i);j++) {
				if(array[j]<array[j+1]) {
					temp=array[j+1];
					array[j+1]=array[j];
					array[j]=temp;
				}
			}
		}
		System.out.println("Sorted by Bubble Sort Descending");
		print_Array(array);
		return array[k-1];
	}

	private static int sort_MyArray_ReturnKth_Smallest_No(int[] array,int k) {
		// TODO Auto-generated method stub
		int temp=0;  //bubble sort
		int len=array.length-1;
		for(int i=0;i<len;i++ ) {
			
			for(int j=0;j<(len-i);j++) {
				if(array[j]>array[j+1]) {
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted by Bubble Sort ");
		print_Array(array);
		return array[k-1];
	}
	
	private static void print_Array(int[] array) {
		
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}

}

/*
Enter Kth Element :- 
5
Sorted by Bubble Sort 
3 7 8 12 17 33 50 80 
5th smallest element in array is 17
Sorted by Bubble Sort Descending
80 50 33 17 12 8 7 3 
5th Largest element in array is 12
 
 */
