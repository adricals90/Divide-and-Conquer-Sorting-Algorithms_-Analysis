import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		 for(int i=3; i <= 14; i++){// insertion sort
			 
			     int arraySize1= (int)Math.pow(2, i);
				 int [] data = new int [arraySize1];
				 File file1 = new File("Num"+arraySize1+".txt");
				 
				 insertionSort is= new insertionSort(readData( file1, data ));
				 is.insertion_Sort();
			     int [] sorteddata1=is.getInsertionArr();
				System.out.println("counter Num"+arraySize1+".txt insertS  "+ is.getCounterIns());
				
				 File fil3= new File("PA"+i+"Num_insertions"+arraySize1+".txt"); //entire array printer 
    			 printerAll(fil3, sorteddata1, is.getCounterIns());
				
				
				  if (arraySize1>64){//print range
				 File file2= new File("P"+i+"Num_insertions"+arraySize1+".txt"); // will create a new file 
    			 printer(file2, sorteddata1, is.getCounterIns());
    			 }
				
				
			}
		 	
		   System.out.println("");
				
		   for(int i=3; i <= 14; i++)//merge sort
			{
			   int arraySize= (int)Math.pow(2, i);
			   
				int [] data = new int [arraySize];
				 File file = new File("Num"+arraySize+".txt");
				 
				MergeSort ms= new MergeSort(readData( file, data ));
				ms.Merge_Sort(data, 0, data.length-1);
				int [] sorteddata2=ms.getMergeArr();
				System.out.println("counter Num"+arraySize+".txt MergeS  "+ ms.getCounterMer());
				
				 File filea= new File("PA"+i+"Num_merges"+arraySize+".txt"); // will create a new file 
    			 printerAll(filea, sorteddata2, ms.getCounterMer());
				
				 if (arraySize>64){ // ranged printer
				 File file1= new File("P"+i+"Num_merges"+arraySize+".txt"); // will create a new file 
    			 printer(file1, sorteddata2, ms.getCounterMer());
    			 }	
				 
			   
			}
		   System.out.println("");
		   
		    
		   
		   for(int i=3; i <= 14; i++)// heap sort
			{
			   int arraySize= (int)Math.pow(2, i);
			   int [] data = new int [arraySize];
			   File file = new File("Num"+arraySize+".txt");
				 
				 
			    HeapSort hs= new HeapSort(readData( file, data ));
				hs.heapSort(data);
				int [] sorteddata3=hs.getHeapArr();
			    System.out.println("counter "+arraySize+".txt HeapS  "+ hs.getCounterH());
				 
			    File files= new File("PA"+i+"Num_heaps"+arraySize+".txt"); // entire sorted array printer
   			    printerAll(files, sorteddata3, hs.getCounterH());
			    
				 
			  if (arraySize>64){// ranged file print
				 
				 File file1= new File("P"+i+"Num_heaps"+arraySize+".txt"); 
    			 printer(file1, sorteddata3, hs.getCounterH());
    
    			 
    			 }
			  
			   
			}
			
		    System.out.println("");

		  for(int i=3; i <= 14; i++){// quick sort
						
					int arraySize= (int)Math.pow(2, i);
					int [] data = new int [arraySize];
					 File file = new File("Num"+arraySize+".txt");
					 
					 readData( file, data );
					 Quick_Sort qs= new Quick_Sort(data);
					  qs.QuickSort(data);
					 int [] sorteddata4= qs.getQuickSA();
					 System.out.println("counter "+arraySize+".txt QuikS "+ qs.getCounter());
					 
					 File fileb= new File("PA"+i+"Num_quicks"+arraySize+".txt"); //entire sorted array printer 
         			 printerAll(fileb, sorteddata4, qs.getCounter());
					 
					 if (arraySize>64){ //ranged array printer
					 File file1= new File("P"+i+"Num_quicks"+arraySize+".txt"); // will create a new file 
         			 printer(file1, sorteddata4, qs.getCounter());
         			 }
					 
					 
		}
		  

	}	
	 
	public static void printer(File f1, int [] Arr , int count){ // printer range 51 to 100
		PrintWriter prints = null;
		int  [] m= Arr;
		
		
		try{
			prints = new PrintWriter(f1);
				
			
				for(int i=50;i<100;i++){
					
					if (i==50){
				    	prints.print("[ counter: "+count+" ] ");// counter for each algorithm
				   }
					
			    	prints.print(m[i]+" ");
			    	
		        }
				
		 prints.close();
		}
		
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	public static void printerAll(File f1, int [] Arr , int count){ // O(n)  print entire sorted array
		PrintWriter prints = null;
		int  [] m= Arr;
		
		
		try{
			prints = new PrintWriter(f1);
				
			
				for(int i=0;i<Arr.length;i++){
					
					if (i==0){
				    	prints.print("[ counter: "+count+" ] ");// counter for each algorithm
				   }
					
			    	prints.print(m[i]+" ");
		          }
				
				System.out.println("file.txt printed");
				
		 prints.close();
		}
		
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
	

	 public static int[] readData( File A, int [] Arr ){
	    int i=0;
	 
        try {
		Scanner inputStream= new Scanner(A);

		while(inputStream.hasNext())
		{ 
			
		   Arr[i++]= (int)inputStream.nextInt();
		
	    }
		inputStream.close();
		
	    } catch (FileNotFoundException e) {
		e.printStackTrace();
        }
	
	return Arr;
	
     }	
	
	
	
}




