import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import javax.lang.model.type.ArrayType;

//import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void sum() {

        // given
        Calculator calculator = new Calculator();

        // when
        int result = calculator.sum(4, 7);

        // then
        assertThat(result).isEqualTo(11);
       // assertEquals(11,result);
        assert result == 11;

    }

    @Test
    public void sumOfHugeNumbers() {
        // given
        Calculator calculator = new Calculator();
        // when
        long result = calculator.sum(Integer.MAX_VALUE, 7);
        // then
        assert result == 11;

    }

    @Test
    public void subtract() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(10,5);
        assert result == 5;
    }

    @Test
    public void multiply() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(10,5);
        assert result == 50;
    }

    @Test
    public void divideWithNoReminder() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(30,6);
        assert result == 5;
    }

    @Test
    public void divideWithReminder() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(6,30);
        assert result == 0.2;
    }


    @Test(expected = ArithmeticException.class)  //method 1
    public void divideWithDivisionByZero() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(6,0);
        //then Exception should be thrown
    }

    @Test  //annotation //method 2
    public void divideWithDivisionByZero2() {
        Calculator calculator = new Calculator();
        expectedException.expect(ArithmeticException.class);
        double result = calculator.divide(6,0);
        //then Exception should be thrown
    }

    @Test  //annotation
    public void divideWithDivisionByZero3() {
        Calculator calculator = new Calculator();

        //when
        try {
        double result = calculator.divide(6,0);
        } catch (ArithmeticException e) {
            System.out.println(e);
            //then Exception should be thrown
            return;
        }
        fail("Arithmetic exception expected with 0");

    }

    public void testAssertJ() {

        //assertThat

        //assertThat("Some text").

        Object[] products = {"a","b","c","d"};

        assertThat(products).hasSize(4).contains("a").containsOnlyOnce("d");

    }


}