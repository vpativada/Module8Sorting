package Sorting;

public class ArrayBub {

	private long[] a; // ref to array a
	private int nElems; // number of data items =size

	public ArrayBub(int max) { // constructor
		a = new long[max]; // create the array //user will decided the size of the array
		nElems = 0; // no items yet
	}

	public void insert(long value) // put element into array
	{
		a[nElems] = value; // insert it
		nElems++; // increment size
	}

	public void display()             // displays array contents 
	{
		for(int j=0; j<nElems; j++) {    // for each element, 		
	    System.out.println(a[j]); 
	    
		}// display it	   
		
	}

	public void bubbleSort()
	{
		
		int out, in;
		for (out = nElems - 1; out > 1; out--) // outer loop (backward) *********** how this physically working?**********
			for (in = 0; in < out; in++) // inner loop (forward)
				if (a[in] > a[in + 1]) // out of order?
					swap(in, in + 1); // swap them
	}	// end bubbleSort()
	
	private void swap(int one, int two) {
		long temp = a[one]; //temporary variable holding first value
		a[one] = a[two];
		a[two] = temp;
	}
	
	public int size() {
		return nElems;
		
	}

}
