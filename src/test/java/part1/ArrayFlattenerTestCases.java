package part1;

import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class ArrayFlattenerTestCases extends TestCase {

    @Test
    public void testFlattenArray() {
        int[][] inputArray = {{1, 3}, {0}, {4, 5, 9}};
        int[] expectedArray = {1, 3, 0, 4, 5, 9};

        int[] flattenedArray = ArrayFlattener.flattenArray(inputArray);
        assertArrayEquals(expectedArray, flattenedArray);
    }
    @Test
    public void testFlattenArrayWithNullInput() {
        int[][] inputArray = null;
        int[] expectedArray = {};
        int[] flattenedArray = ArrayFlattener.flattenArray(inputArray);

        assertArrayEquals(expectedArray, flattenedArray);
    }
}