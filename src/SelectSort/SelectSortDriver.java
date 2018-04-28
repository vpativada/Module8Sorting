package SelectSort;

/**
 * @author Vasavi Pativada
 *
 */
public class SelectSortDriver {
	public static void main(String[] args) {

		int maxSize = 10000; // array size
		ArraySel arr; // reference to array
		arr = new ArraySel(maxSize); // create the array

		for (int j = 0; j < maxSize; j++) // fill array with random numbers
		{
			long n = (long) (java.lang.Math.random() * (maxSize - 1));
			arr.insert(n);
		}
		
		System.out.println("Size of the list: " + arr.size());
		System.out.println("Unsorted list: " );
		arr.display(); // display items
		arr.selectionSort(); // insertion-sort them
		System.out.println("Sorted list: " );
		arr.display(); // display them again
		
		
   
	/*	final double startTime = System.currentTimeMillis(); // Screenshot Number 2
		arr.selectionSort();
		final long endTime = System.currentTimeMillis();
		System.out.println("Total execution time: " + (endTime - startTime) + " milli seconds");
*/
	} // end main()
} // end class InsertSortApp
