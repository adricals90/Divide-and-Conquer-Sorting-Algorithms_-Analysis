
public class Quick_Sort {
	int [] A;
	int countquick=0;
	
	Quick_Sort(int [] Arr){
		A=Arr; 
	}
	
	public int getCounter(){
		return countquick;
	}

	public int [] getQuickSA( ){
		return A;
	}
	
	
	public  void QuickSort(int A []){
		countquick=0;
		quickSort(A,0,A.length-1);
	}
	
	public void quickSort(int [] A, int p, int r){
		if(p<r){
			int q=partition(A, p, r);
			quickSort(A,p,q-1);
			quickSort(A,q+1,r);
		}
	}
	
	public  int partition(int [] A, int p, int r){
		int x=A[r];
		int i = p-1;
		
		for(int j=p;j<r;  j++){
			countquick = countquick +1;   //counter
			if(A[j]<=x)
            {
                i++;
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
			
		}
		
		 int temp = A[i+1];
         A[i+1] = A[r];
         A[r] = temp;
         return (i+1);
		
	}
}
	


