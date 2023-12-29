import org.example.ContainerProcessor;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ContainerProcessorTest {

    @Test
    public void simpleTest() {
        double[] a = {1.0, 2.0, 3.0, 3.0, 4.0};
        double[] b = ContainerProcessor.makeUnique(a);

        assertArrayEquals(new double[]{1.0, 2.0, 3.0, 4.0}, b, 0.0);
    }

    @Test
    public void emptyArray() {
        double[] a = {};
        double[] b = ContainerProcessor.makeUnique(a);
        assertArrayEquals(new double[]{}, b, 0.0);
    }

    @Test
    public void allUnique() {
        double[] a = {1.0, 2.0, -1.0, 5.0};
        double[] b = ContainerProcessor.makeUnique(a);
        assertArrayEquals(a, b, 0.0);
    }

    @Test
    public void allNotUnique() {
        double[] a = {1.0, 1.0, 1.0, 5.5, 5.5, 5.5, 3.2, 3.2};
        double[] b = ContainerProcessor.makeUnique(a);
        assertArrayEquals(b, new double[]{1.0, 5.5, 3.2}, 0.0);
    }
}
