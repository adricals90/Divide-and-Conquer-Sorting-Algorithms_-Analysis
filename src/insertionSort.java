
public class insertionSort {

int count=0;
int [] A;

insertionSort(int [] Adata){
	A=Adata;
}

public int []  getInsertionArr(){
	return A;
	
}

public int getCounterIns(){
	return count;
}
	
public void insertion_Sort(){
	

		
		  for (int j= 1;j<A.length; j ++) {
			  int key=A[j];
			  int i= j-1;
			  while (i>=0 && A[i]>key){
				  count++;
				  A[i+1]=A[i];
				  i=i-1; 
			  }
			   A[i+1]= key;
			   
		  }

	}	
	
}

