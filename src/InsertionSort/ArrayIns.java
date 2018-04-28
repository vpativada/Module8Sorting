package InsertionSort;

/**
 * insertSort.java
 * 
 * @author Vasavi Pativada
 *
 */

class ArrayIns {
	private long[] a; // ref to array a
	private int nElems; // number of data items

	public ArrayIns(int maxSize) // constructor
	{
		a = new long[maxSize]; // create the array
		nElems = 0; // no items yet
	}

	public void insert(long value) // put element into array
	{
		a[nElems] = value; // insert it
		nElems++; // increment size
	}

	public void display() // displays array contents
	{
		for (int j = 0; j < nElems; j++) // for each element,
			System.out.println(a[j] + ""); // display it
		//System.out.println("");
	}

	public void insertionSort() {
		int in, out;
		for (out = 1; out < nElems; out++) // out is dividing line
		{
			long temp = a[out]; // remove marked item
			in = out; // start shifts at out
			while (in > 0 && a[in - 1] >= temp) // until one is smaller,
			{
				a[in] = a[in - 1]; // shift item to right
				--in; // go left one position
			}

			a[in] = temp; // insert marked item
		}
	}

	public int size() {
		return nElems;
	}

}
// end class ArrayIns