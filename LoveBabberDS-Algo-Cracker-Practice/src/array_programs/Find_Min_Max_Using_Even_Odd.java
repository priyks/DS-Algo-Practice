package array_programs;

public class Find_Min_Max_Using_Even_Odd {
	
	static class Pair{
		int min;
		int max;
	}
	private static Pair find_Min_Max_No(int[] array) {
		Pair minmax=new Pair();
		int n=array.length;
		int i;
		
		if(n%2==0) {
			if(array[0]>array[1]) {
				minmax.max=array[0];
				minmax.min=array[1];
			}
			else {
				minmax.max=array[1];
				minmax.min=array[0];
			}
			// set index to two if array is even
			 i = 2; 
		}
		
		else {  // Initialize first element as min and max if n of elements is odd
			minmax.max=array[0];
			minmax.min=array[0];
			//set index as 1 if array is odd
			 i = 1; 
		}
		
		 while (i < n - 1) { 
	            if (array[i] > array[i + 1]) { 
	                if (array[i] > minmax.max) { 
	                    minmax.max = array[i]; 
	                } 
	                if (array[i + 1] < minmax.min) { 
	                    minmax.min = array[i + 1]; 
	                } 
	            } else { 
	                if (array[i + 1] > minmax.max) { 
	                    minmax.max = array[i + 1]; 
	                } 
	                if (array[i] < minmax.min) { 
	                    minmax.min = array[i]; 
	                } 
	            } 
	            i += 2; 
	            /* Increment the index by 2 as two   
	               elements are processed in loop */
	        } 
		
		return minmax;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[]= {500,30,50,97,8,3};
		Pair minmax=find_Min_Max_No(array);
		System.out.println("Max Element in array is :- "+minmax.max+"\n");
		System.out.println("Min Element in array is:- "+minmax.min);
	}
	
}

/*
 Output:
Max Element in array is :- 500

Min Element in array is:- 3

 */
