package application;

import task1.AnyObjectStore1;
import task2.AnyObjectStore2;
import task3.ArrayAndListUtils;

import java.util.ArrayList;
import java.util.List;

public class AnyObjectStore {
    public static void main(String[] args) {

        System.out.println("Task 1 ");
        AnyObjectStore1<Integer> anyObjectStore1 = new AnyObjectStore1<>();
        anyObjectStore1.addToSet(1);
        anyObjectStore1.addToSet(2);
        anyObjectStore1.addToSet(3);
        anyObjectStore1.addToSet(4);
        anyObjectStore1.addToSet(5);
        anyObjectStore1.addToSet(3);
        anyObjectStore1.delSet(4);
        anyObjectStore1.delSet(56);
        anyObjectStore1.containsSet(4);
        anyObjectStore1.containsSet(1);

        System.out.println();
        System.out.println("Task 2");
        List testList = new ArrayList<>();
        testList.add(10);
        testList.add(5);
        testList.add(3);
        testList.add(7);
        testList.add(4);
        testList.add(6);
        AnyObjectStore2 anyObjectStore2 = new AnyObjectStore2();
        anyObjectStore2.add(testList, 5);
        anyObjectStore2.del(testList, 3);
        anyObjectStore2.del(testList, 9);
        anyObjectStore2.containsDemo(testList, 5);
        anyObjectStore2.containsDemo(testList, 3);

        System.out.println();
        System.out.println("Task 3 ");
        int indexN = 2;
        int indexM = 3;
        Integer[] array = {1, 2, 3, 4, 5, 6};
        for (Integer integer : array) {
            System.out.print(" " + integer);
        }
        System.out.println();
        ArrayAndListUtils arrayAndListUtils = new ArrayAndListUtils();
        arrayAndListUtils.changingPlaces(array, indexN, indexM);

        System.out.println();
        System.out.println();
        System.out.println("Task 4 ");
        arrayAndListUtils.searchMaxElement(testList, 1, 4);
    }
}
