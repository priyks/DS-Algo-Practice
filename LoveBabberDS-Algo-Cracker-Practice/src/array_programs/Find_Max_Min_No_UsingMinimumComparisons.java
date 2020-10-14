package array_programs;

//Maximum and minimum of an array using minimum number of comparisons Linear Approach

public class Find_Max_Min_No_UsingMinimumComparisons {
	
	static class Pair{
		int   max;
		int  min;
		public static Pair find_Min_Max_No(int[] array,int start,int end) {
			Pair minmax=new Pair();
			// if there is one element in array
			if(start==end) {
			 
				minmax.max=array[start];
				minmax.min=array[end];
				return minmax;
			}
			// if there are two elements in array
			 if(array[start]>array[end]) {
				
				 minmax.max=array[start];
				 minmax.min=array[end];	
			}
			 else {
				 minmax.min=array[start];
				 minmax.max=array[end];	
			 }
			 
			 // if there are more than two elements in array
			 
			 for(int i=2;i<end;i++) {
				 
				 if(array[i]>minmax.max) {
					 minmax.max=array[i];
				 }else if(array[i]<minmax.min) {
					 minmax.min=array[i];
				 }	 
				 
			 }
			 			 
			return minmax;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[]= {1000,34,7,200,9897,2,4000};
		Pair minmax=Pair.find_Min_Max_No(array,0,array.length-1);
		System.out.println("Maximum Element in array :- "+minmax.max+"\n");
		System.out.println("Minimum Element in array :- "+minmax.min);

	}

}


/*
 
 Output:
 
Maximum Element in array :- 9897

Minimum Element in array :- 2
  
 */
