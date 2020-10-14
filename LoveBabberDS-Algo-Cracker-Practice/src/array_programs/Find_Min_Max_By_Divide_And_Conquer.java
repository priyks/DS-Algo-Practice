package array_programs;

public class Find_Min_Max_By_Divide_And_Conquer {

	static class Pair{
		int min;
		int max;
		public static Pair find_Min_Max(int[] array, int i, int j) {
			Pair minmax=new Pair();
			
			// if there is only one element in array
			if(i==j) {
				minmax.max=array[i];
				minmax.min=array[j];
				return minmax;	
			}
			
			// if there is two elements in array
			if(j==i+1) {
			if(array[i]>array[j]) {
				minmax.max=array[i];
				minmax.min=array[j];
			}else
			{
				minmax.min=array[i];
				minmax.max=array[j];
			}
			return minmax;	
			}
			// if there are more then two elements in array
			
			Pair mml=new Pair();
			Pair mmr=new Pair();
			int mid=(i+j)/2;
			mml=find_Min_Max(array, i, mid);
			mmr=find_Min_Max(array, mid+1, j);
			
			// compare minimums of two parts
			
			if(mml.min<mmr.min) {
				minmax.min=mml.min;
			}else {
				minmax.min=mmr.min;
			}
	
			// compare maximums of two parts
			
			if(mml.max>mmr.max) {
			  minmax.max=mml.max;  
			}
			else{
				minmax.max=mmr.max;
			}
			
			return minmax;	
			
		}	
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {19,76,8,5,23,78,900,12,22,89,1200};
		Pair myminmax=Pair.find_Min_Max(array,0,array.length-1);
		System.out.println("Maximum Element in array :- "+myminmax.max+"\n");
		System.out.println("Minimum Element in array :-"+myminmax.min);
		
	}

}

/*
 Output:
Maximum Element in array :- 1200

Minimum Element in array :-5

 */
