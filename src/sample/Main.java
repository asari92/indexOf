package sample;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Integer[] array = {1, 2, 3, 4, 5, 6 , 7, 8, 9, 10};

        String[] array2 = {"abc", "bcd", "cde", "def", "efg", "fgh", "ghi"};

        System.out.println(indexOf(array, 95));
        System.out.println(indexOf2(array, 95));

        System.out.println(indexOf(array2, "def"));
        System.out.println(indexOf2(array2, "def"));
    }

    public static int indexOf(Object[] array, Object value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOf2(Object[] array, Object value) {
       return Arrays.asList(array).indexOf(value);
    }

}
