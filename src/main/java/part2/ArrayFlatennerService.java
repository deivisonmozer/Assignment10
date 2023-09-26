package part2;

import java.util.ArrayList;
import java.util.List;

public class ArrayFlatennerService {
    public List<Integer> flattenArray(int[][] inputArray){
        List<Integer> flattened = new ArrayList<>();
        if (inputArray == null) {
            throw new IllegalArgumentException("Input array cannot be null");
        }
        for (int[] row : inputArray) {
            for (int element : row) {
                flattened.add(element);
            }
        }
        return flattened;
    }
}
