package task1;

import java.util.HashSet;
import java.util.Set;

public class AnyObjectStore1<T> {
    private Set<T> setTest = new HashSet<T>();

    public void addToSet(T item){
        if(setTest.add(item)){
            System.out.println("add new element " + item);
        }else {
            System.out.println("not add, element exists " + item);
        }
    }

    public void delSet(T item){

            boolean remove = setTest.remove(item);
        if(remove) {
            System.out.println("element deleted " + item);
        }  else {
            System.out.println("element does not exist " + item);
        }
    }

    public boolean containsSet(T item){
        boolean contains = setTest.contains(item);
        if (contains) {
            System.out.println("element " + item + " contains");
        } else {
            System.out.println("element " + item + " not contains");
        }
        return  contains;

    }

}
