import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void retutn2When1Plus1() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Calculator calculator = new Calculator();
        int actualresult = calculator.computer(1, 1, "Add");
        int expectresult = 2;
        Assert.assertEquals(expectresult, actualresult);
    }

    @Test
    public void retutn0When1Sub1() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Calculator calculator = new Calculator();
        int actualresult = calculator.computer(1, 1, "Sub");
        int expectresult = 0;
        Assert.assertEquals(expectresult, actualresult);
    }
}