package Collection;

import java.util.*;


public class SetExercise {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>(); //tree set

        set1.add("김경록");
        set1.add("김미미");

        Set<Integer> setInteger = new HashSet<>();
        setInteger.add(1);
        setInteger.add(1);
        setInteger.add(2);
        setInteger.add(3);

        System.out.println(setInteger);

    }
}