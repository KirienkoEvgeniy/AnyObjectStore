package task3;

import java.util.List;

public class ArrayAndListUtils  {

    public static <E> E[] changingPlaces(E[] testArray, int n, int m) {
        E temp;
        temp = testArray[n];
        testArray[n] = testArray[m];
        testArray[m] = temp;
        for (E e : testArray) {
            System.out.print(" " + e);
        }
        return testArray;
    }

    public static <E extends Comparable> E searchMaxElement(List<E> testList, int n, int m) {
        E maxElement = null;
        List<E> tail = testList.subList(n, m);
        for (E var : tail) {
            if (maxElement == null || var.compareTo(maxElement) > 0) {
                maxElement = var;
            }
        }
        System.out.println("maximum element in the array " + maxElement);
        return maxElement;
    }
}
