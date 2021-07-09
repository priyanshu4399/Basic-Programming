package data_structure.arrays;

import java.util.Arrays;


/**
 * 
 * this is an example of how you can create your own Dyanamic array definition
 *
 */
public class MyArrayList {
	
	//arr is the array which stores our ArrayList elements
	private Object arr[];
	//capacity is the total storage of the ArrayList
	private int capacity;
	
	//current is the no. of element present in the arrayList
	private int size;
	
	
	// Default constructor to initialise an initial capacity of 1 element 
	MyArrayList(){
		capacity = 1;
		size = 0;
		arr = new Object[capacity];	
	}
	
	
	public int getcapacity()
	{
	    return capacity;
	}
	
	public int size()
    {
        return size;
    }
	
	Object get(int index)
    {
        if (index < size)
            return arr[index];
        return null;
    } 
	
	public void add(Object item) {

        // if the number of elements is equal to the capacity,that means we don't have spaceto accommodate more elements.
        // We need to double the capacity
		if(size == capacity) {
			// copying old array elements to new array
			arr = Arrays.copyOf(arr, 2 * capacity);
			
			capacity *= 2;
		}
		arr[size] = item;
		size++;
	}
	
	public void add(int index, Object item) {

        // if the number of elements is equal to the capacity,that means we don't have spaceto accommodate more elements.
        // We need to double the capacity
		
		if(size == capacity) {
			arr = Arrays.copyOf(arr, 2 * capacity);			
			capacity *= 2;
		}
		
		for(int i=size; i>index;i--) {
			arr[i] = arr[i-1];
		}
		arr[index] = item;
		size++;
	}
	
	
	public Object remove() {
		Object removed = arr[size-1];
		arr[size-1] = null;
		size--;
		return removed;
	}
	
	public Object remove(int index) {
		Object removed = arr[index];
		for(int i=index; i<size;i++) {
			arr[i] = arr[i+1];
		}
		size--;
		return removed;
	}

	public void print() {
		System.out.print("Array Elements : [");
        for (int i = 0; i < size-1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[size-1]);
        System.out.print("]");
        System.out.println();
	}
	public static void main(String[] args) {
		
		 MyArrayList arr = new  MyArrayList();
		 arr.add("hi");
		 arr.add("hello");
		 arr.add("welcome");
		 arr.add(1,"here");
		 //arr.add(2,"hey");
		 arr.print();
		 System.out.println("Array Capacity : " + arr.getcapacity());
		 System.out.println("Array Size : " + arr.size());
		 System.out.println("Item removed : " + arr.remove());
		 arr.print();
		 System.out.println("Item removed at index 2: " + arr.remove(2));
		 arr.print();	 
	}

}
