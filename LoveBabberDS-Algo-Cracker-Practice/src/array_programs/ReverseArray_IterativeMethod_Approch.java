package array_programs;

//Write a program to reverse an array or string (Iterative Approach )

public class ReverseArray_IterativeMethod_Approch {

	public static void main(String[] args) {
		
		int array[]= {4,5,6,3,2,1};
		System.out.println("Present Array :-");
		print_Array(array);
		reverse_Array(array,0,array.length-1);
		print_Array(array);
		

	}

	private static void reverse_Array(int[] array, int i, int length) {
		// TODO Auto-generated method stub
		System.out.println("Reverse Array :-");
		int temp=0;
		while(i<length) {
			temp=array[i];
			array[i]=array[length];
			array[length]=temp;
			i+=1;
			length-=1;
			
		}
		
	}

	private static void print_Array(int[] array) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<array.length;i++) {
			
			System.out.print(array[i]+",");
		}
		System.out.println();
		
	}

}
