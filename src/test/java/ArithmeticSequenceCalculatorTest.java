import org.example.ArithmeticSequenceCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ArithmeticSequenceCalculatorTest {
    private ArithmeticSequenceCalculator arithmeticSequenceCalculator;

    @BeforeEach
    public void beforeEach(){
        arithmeticSequenceCalculator = new ArithmeticSequenceCalculator();
    }

    @Test
    public void testCalculateArithmeticProgressionWithPositiveNumber() {
        assertEquals(15, ArithmeticSequenceCalculator.calculateArithmeticProgression(5));
        assertEquals(55, ArithmeticSequenceCalculator.calculateArithmeticProgression(10));
        assertEquals(5050, ArithmeticSequenceCalculator.calculateArithmeticProgression(100));
    }

    @Test
    public void testCalculateArithmeticProgressionWithNegativeNumber() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> ArithmeticSequenceCalculator.calculateArithmeticProgression(-5));
        assertEquals("Number must be positive", exception.getMessage());
    }

    @Test
    public void testCalculateArithmeticProgressionWithZero() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> ArithmeticSequenceCalculator.calculateArithmeticProgression(0));
        assertEquals("Number must be positive", exception.getMessage());
    }
}
