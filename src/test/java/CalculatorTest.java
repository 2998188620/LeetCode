import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void retutn2When1Plus1() {
        Calculator calculator = new Calculator();
        int actualresult = calculator.computer(1, 1, '+');
        int expectresult = 2;
        Assert.assertEquals(expectresult, actualresult);
    }

    @Test
    public void retutn0When1Sub1() {
        Calculator calculator = new Calculator();
        int actualresult = calculator.computer(1, 1, '-');
        int expectresult = 0;
        Assert.assertEquals(expectresult, actualresult);
    }
}