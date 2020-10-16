package sort_array_in_Ascending_Order;


// Java program to sort an array of 0, 1 and 2 

public class Sort_Array_ASC_Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {1,2,0,0,2,1,2,1,0,1,2,0,1};
		
		print_Array(array);
		sort_In_Ascending_order(array);
		print_Array(array);
		

	}

	private static void print_Array(int[] array) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<array.length-1;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}

	private static void sort_In_Ascending_order(int[] array) {
		// TODO Auto-generated method stub
		System.out.println("Array in Ascending Order \n");
		int c0=0,c1=0,c2=0;
		for(int i=0;i<array.length-1;i++) {
			
			switch(array[i]) {
			case 0: c0++;
					break;
			case 1: c1++;
					break;
			case 2: c2++;
					break;
			}
		}
		int i=0;
		while(c0>0) {
			array[i++]=0;
			c0--;
			
		}
		while(c1>0) {
			array[i++]=1;
			c1--;
		}
		while(c2>0) {
			array[i++]=2;
			c2--;
		}
		
	}

}

/*
Output:

1 2 0 0 2 1 2 1 0 1 2 0 
Array in Ascending Order 

0 0 0 0 1 1 1 1 2 2 2 2 

 
 */
