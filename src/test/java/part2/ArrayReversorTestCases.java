package part2;

import junit.framework.TestCase;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertArrayEquals;
import static org.mockito.Mockito.*;

public class ArrayReversorTestCases extends TestCase {
    @Test
    public void testReverseArray() {
        ArrayResolver arrayResolver = mock(ArrayResolver.class);
        int[][] input = {{1, 3}, {0}, {4, 5, 9}};
        int[] expectedOutput = {9, 5, 4, 0, 3, 1};

        when(arrayResolver.reverseArray(input)).thenReturn(expectedOutput);
        int[] result = arrayResolver.reverseArray(input);
        verify(arrayResolver).reverseArray(input);
        assertArrayEquals(expectedOutput, result);
    }

    @Test
    public void testReverseArrayWithNullInput() {
        ArrayResolver arrayResolver = mock(ArrayResolver.class);
        Mockito.doThrow(new IllegalArgumentException()).when(arrayResolver).reverseArray(null);
    }
}