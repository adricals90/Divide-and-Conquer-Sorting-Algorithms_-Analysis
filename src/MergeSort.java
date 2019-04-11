
public class MergeSort {
	
	int [] A;
	private int countMerge=0;
	
	MergeSort(int [] Arr){
		A=Arr; 
	}
	
	public int getCounterMer(){
		return countMerge;
	}

	public int [] getMergeArr( ){
		return A;
	}
	
	
	
	public void Merge_Sort(int [] A,int p , int r){
		if (p<r){
			int q=(int) java.lang.Math.floor((p+r)/2);
			Merge_Sort(A,p,q);
			Merge_Sort(A,q+1,r);
			Merge(A, p , q , r);
		}
		
		
	}
	
	
	public void Merge(int []A, int p, int q, int r){
		int count1=0;
		int n1=(q-p)+1;
		int n2=(r-q);
		int L [] = new int [n1+1];
		int R [] = new int [n2+1];
		
		for(int i=0; i<n1; i++){
			L[i]= A[(p+i)];
		}
		for(int j=0; j<n2; j++){
			R[j]= A[q+j+1];
		}
		
		L[n1]=999999;
		R[n2]=999999;

		
		int i=0;
		int j=0;
		for (int k=p;  k<=r; k++){
			countMerge++;
			if(L[i]<=R[j]){
				A[k]=L[i];
				i= i+1;
			}else{
				A[k]=R[j];
				j=j+1;
			}
			
		}		
		
	} 

}
