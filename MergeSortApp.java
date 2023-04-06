public class MergeSortApp {
  public static void main(String[] ar) {
    int maxSize = 100; // array size
    Darray arr; // reference to array
    arr = new Darray(maxSize); // create the array

    arr.insert(64); // insert items
    arr.insert(21);
    arr.insert(33);
    arr.insert(70);
    arr.insert(12);
    arr.insert(85);
    arr.insert(44);
    arr.insert(3);
    arr.insert(99);
    arr.insert(0);
    arr.insert(108);
    arr.insert(36);

    System.out.println("Data awal");
    arr.display(); // display items

    System.out.println();
    System.out.println("Data sesudah merge sort");
    arr.mergeSort(); // mergesort the array
    arr.display(); // display items again
  }
}