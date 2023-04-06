public class MergeApp {
  public static void main(String[] args) {
    int[] arrayA = { 23, 47, 81, 95 };
    int[] arrayB = { 7, 14, 39, 55, 62, 74 };
    int[] arrayC = new int[2];

    merge(arrayA, 1, arrayB, 1, arrayC);

    display(arrayC, 2);
  }

  // merge A and B into C
  public static void merge(int[] arrayA, int sizeA, int[] arrayB, int sizeB, int[] arrayC) {
    int aDex = 0, bDex = 0, cDex = 0;

    while (aDex < sizeA && bDex < sizeB) // neither array empty
    {
      if (arrayA[aDex] < arrayB[bDex])
        arrayC[cDex++] = arrayA[aDex++];
      else
        arrayC[cDex++] = arrayB[bDex++];
    }

    while (aDex < sizeA) // arrayB is empty, but arrayA isn't
      arrayC[cDex++] = arrayA[aDex++];

    while (bDex < sizeB) // arrayA is empty, but arrayB isn't
      arrayC[cDex++] = arrayB[bDex++];
  }

  // display array
  public static void display(int[] theArray, int size) {
    for (int j = 0; j < size; j++)
      System.out.print(theArray[j] + " ");
    System.out.println("");
  }
}