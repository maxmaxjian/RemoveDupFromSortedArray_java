import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class SolutionTest {
    private int[] input;
    private int expected;
    private Solution soln = new Solution1();

    public SolutionTest(int[] input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection parameters() {
        return Arrays.asList(new Object[][]{
                {new int[]{1,1,2}, 2},
                {new int[]{0,0,1,1,1,2,2,3,3,4}, 5}
        });
    }

    @Test
    public void testRemoveDups() {
        assertEquals(expected, soln.removeDuplicates(input));
    }
}