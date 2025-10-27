

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.Test;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CalculatorTest {
    
    @Test
    public void testGetSum() {
        // Creates an instance of the class Calculator
        Calculator calculator = new Calculator(4.0, 2.0);
        // Defines the expected result for the operation
        double expResult = 6.0;
        // Calls the sum operation and gets its result
        double result = calculator.getSum();
        // Verifies if the values are equal
        assertEquals(expResult,result,2);
    }
    
    @Test
    void testGetDifference(){
        // Creates an instance of the class Calculator
        Calculator calculator = new Calculator(4.0,2.0);
        // Defines the expected result for the operation
        double expResult = 2.0;
        // Calls the difference operation and gets its result
        double result = calculator.getDifference();
        // Verifies if the values are equal
        assertEquals(expResult,result,0);
    }
    
    @Test
    void testGetProduto(){
        // Creates an instance of the class Calculator
        Calculator calculator = new Calculator(4.0,2.0);
        // Defines the expected result for the operation
        double expResult = 8.0;
        // Calls the getProduct operation and gets its result
        double result = calculator.getProduct();
        // Verifies if the values are equal
        assertEquals(expResult,result,0);
    }
    
    @Test
    void testGetQuociente(){
        // Creates an instance of the class Calculator
        Calculator calculator = new Calculator(4.0,2.0);
        // Defines the expected result for the operation
        double expResult = 2.0;
        // Calls the getQuotient operation and gets its result
        double result = calculator.getQuotient();
        // Verifies if the values are equal
        assertEquals(expResult,result,0);
    }
}
