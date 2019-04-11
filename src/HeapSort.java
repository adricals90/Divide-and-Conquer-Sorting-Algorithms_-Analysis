
public class HeapSort {
	int [] A;
	private int countHeap=0;
	
	HeapSort(int [] Arr){
		A=Arr; 
	}
	
	public int getCounterH(){
		return countHeap;
	}

	public int [] getHeapArr( ){
		return A;
	}
	
	
	int size;
	public  void heapSort(int [] A){
		 buildMaxHeap(A);
		 
			for(int i= size;i>0; i--  ){
				
				exchange(A,0,i);
				size =size-1;	
				max_Heapify(A,0);
				
			}
	}
	
	
	public void max_Heapify(int [] A, int i){
		int left =2*i;
		int right=2*i+1;
		int largest=i;
		if (right<=size && A[left]>A[i]){
			largest=left;
		}else{
			largest=i;
		}
		
		if (right <= size && A[right] > A[largest]){
				 largest=right;
		 }
		
	  if (largest != i){
				 
		 		 exchange(A,i, largest );
		 		 countHeap++;//counter
				 max_Heapify (A, largest);}
	}
	
	public void buildMaxHeap(int A[]){
		
		size=A.length-1;
		for(int i=(int) java.lang.Math.floor(A.length/2); i>=0; i--){
			max_Heapify(A, i);
		}
		
		
	}
	  public void exchange(int arr[], int i, int j)
	    {
	        int tmp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = tmp; 
	    }    
	
}
