package part2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayResolver {
    ArrayFlatennerService service = new ArrayFlatennerService();
    public int[] reverseArray(int[][] inputArray) {
        List<Integer> flattened = service.flattenArray(inputArray);

        Collections.reverse(flattened);
        int[] resultArray = new int[flattened.size()];
        for (int i = 0; i < flattened.size(); i++) {
            resultArray[i] = flattened.get(i);
        }

        return resultArray;
    }
}