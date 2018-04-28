package Sorting;

public class ArrayBubDriver {

	public static void main(String[] args) {
		
		int maxSize = 10000; // array size
		ArrayBub arr = new ArrayBub(maxSize); // create the array
		
		for(int j=0; j<maxSize; j++) // fill array with random numbers
		{ 
		  long n = (long)( java.lang.Math.random()*(maxSize-1) );
		  arr.insert(n);
		}
				
		System.out.println("Size: " +arr.size());
		System.out.println("Unsorted list: " );
		arr.display();  // display items 
		arr.bubbleSort();
		System.out.println("Sorted list: " );
		arr.display();  // display sort items again				
		
		
		final double startTime = System.currentTimeMillis(); // Screenshot Number 2
		arr.bubbleSort();
		final long endTime = System.currentTimeMillis();
		System.out.println("Total execution time: " + (endTime - startTime) + " milli seconds");

	}

}
