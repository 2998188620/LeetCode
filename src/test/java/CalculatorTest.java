import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void returnResult2When1Add1() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Calculator calculator = new Calculator();
        int actualResult = calculator.compute(1, 1, "Add");
        int expectResult = 2;
        Assert.assertEquals(expectResult, actualResult);
    }

    @Test
    public void returnResult1When2Sub1() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Calculator calculator = new Calculator();
        int actualResult = calculator.compute(2, 1, "Sub");
        int expectResult = 1;
        Assert.assertEquals(expectResult, actualResult);
    }

    @Test
    public void returnResult4When2Multi2() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Calculator calculator = new Calculator();
        int actualResult = calculator.compute(2, 2, "Multi");
        int expectResult = 4;
        Assert.assertEquals(expectResult, actualResult);
    }
}