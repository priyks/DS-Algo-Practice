package array_programs;

public class ReverseArray_RecursiveApproch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {10,3,8,5,2,18};
		System.out.println("Present Array :-");
		print_Array(array);
		
		reverse_Array(array,0,array.length-1);
		System.out.println("Reverse Array :-");
		print_Array(array);

	}

	private static void reverse_Array(int[] array, int start, int end) {
		// TODO Auto-generated method stub
		
		int temp;
		if(start>=end) 
			return;
		temp=array[start];
		array[start]=array[end];
		array[end]=temp;
		reverse_Array(array,start+1,end-1);
		
	}

	private static void print_Array(int[] array) {
		// TODO Auto-generated method stub
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+",");
		}
		System.out.println();
	}

}
