import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void testAdd() {
        assertEquals(7, Calculator.add(2, 5));
    }
    @Test
    public void testSub() {
        assertEquals(4, Calculator.subtract(7, 3));
    }
    @Test
    public void testMul() {
        assertEquals(24, Calculator.multiply(4, 6));
    }
    @Test
    public void testDiv() {
        assertEquals(3.5, Calculator.divide(7.0, 2.0), 0.01);
    }
}
