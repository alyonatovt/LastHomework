package app;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
        calculator = null;
    }

    @Test
    void sum() {
        int a = 10;
        int b = 3;
        assertEquals(a + b,calculator.sum(a,b));
    }

    @Test
    void subtraction() {
        int a = 10;
        int b = 9;
        assertEquals(a-b,calculator.subtraction(a,b));
    }

    @Test
    void division() {
        int a = 15;
        int b = 5;
        assertEquals((double) a /b,calculator.division(a,b));
    }

    @Test
    void multiplication() {
        int a = 4;
        int b = 8;
        assertEquals(a*b,calculator.multiplication(a,b));
    }
}