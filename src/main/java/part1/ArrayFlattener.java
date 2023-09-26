package part1;

import java.util.ArrayList;
import java.util.List;

public class ArrayFlattener {
    public static int[] flattenArray(int[][] inputArray) {
        List<Integer> flattenedList = new ArrayList<>();
        if(inputArray == null) return new int[0];;

        for (int[] innerArray : inputArray) {
            for (int element : innerArray) {
                flattenedList.add(element);
            }
        }
        int[] resultArray = new int[flattenedList.size()];
        for (int i = 0; i < flattenedList.size(); i++) {
            resultArray[i] = flattenedList.get(i);
        }

        return resultArray;
    }
}