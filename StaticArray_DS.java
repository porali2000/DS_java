/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticarray_ds;

/**
 * static array implementation with integer type. removing and inserting beyond
 * capacity is not possible
 *
 * @author Poorani
 */
public class StaticArray_DS {

    /**
     * @param args the command line arguments
     */
    private int[] arr;
    private int len = 0;//how much size of array is filled
    private int capacity = 0;//actual size of the array

    public StaticArray_DS() {
        this(16); //default size is 16
    }

    public StaticArray_DS(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Illegal capacity :" + capacity);
        }
        this.capacity = capacity;
        arr = new int[capacity];
    }

    public int size() {
        return len;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int get(int index) {
        return arr[index];
    }

    public void set(int index, int elem) // changing an existing element
    {
        arr[index] = elem;
    }

    public void clear() {
        for (int i = 0; i < len; i++) {
            arr[i] = 0;
        }
        len = 0;
    }

    public void add(int elem) {
        if (len + 1 > capacity) {
            System.out.println("cannot add any more element : Exceeding capacity");

        } else {
            arr[len++] = elem;
        }

    }

    public void removeAt(int index) {
        System.out.println("Static Array : Remove Operation not permitted");

    }

    public boolean remove(int elem) {
        System.out.println("Static Array : Remove Operation not permitted");
        return false;

    }

    public int indexOf(int elem) {
        for (int i = 0; i < len; i++) {
            if (arr[i] == elem) {
                return i;
            }
        }
        return -1;
    }

    public void print() {
        for (int i = 0; i < len; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        StaticArray_DS arr1 = new StaticArray_DS(5);
        arr1.add(2);
        arr1.add(3);
        System.out.println("len " + arr1.len + " capacity : " + arr1.capacity + " size : " + arr1.size());
        System.out.println("index of elem 2 is " + arr1.indexOf(2));
        System.out.println("get element at index 4 " + arr1.get(4));

        arr1.add(4);
        arr1.add(1);
        arr1.add(6);
        arr1.add(8);

        arr1.set(3, 5);
        System.out.println("get element at index 3 " + arr1.get(3));
        arr1.print();
    }

}
