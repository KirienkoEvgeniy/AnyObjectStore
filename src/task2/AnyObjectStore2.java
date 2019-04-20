package task2;

import java.util.List;

public class AnyObjectStore2 {

    public static <T> void add(List testList, T item) {

        if(testList.add(item)){
            System.out.println("add element " + item);
        }else {
            System.out.println("not add");
        }
    }

    public static <T> void del(List testList, T item) {
        boolean test = testList.remove(item);
        if(test) {
            System.out.println("element deleted " + item);
        }  else {
            System.out.println("element does not exist " + item);
        }
    }

    public static <T> boolean containsDemo(List testList, T item) {
        boolean contains = testList.contains(item);
        if (contains) {
            System.out.println("element " + item + " contains");
        } else {
            System.out.println("element " + item + " not contains");
        }
        return  contains;
    }
}
