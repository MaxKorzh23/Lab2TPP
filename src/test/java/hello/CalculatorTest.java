package hello;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    @Test
    public void testValidExpression() {
        Calculator calculator = new Calculator();
        double value = calculator.calculate("1 + 1"); // той що проходить, відсутні помилки в коді
        assertEquals(2.0, value);
    }

//     @Test
//     public void testFailingExpression() {
//         Calculator calculator = new Calculator();
//         double value = calculator.calculate("5 - 1"); // той що завжди буде видавати помилку
//         assertEquals(2.0, value);
//     }

    @Test
    public void testInvalidExpression() {
        Calculator calculator = new Calculator();
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            calculator.calculate("Invalid expression"); // Неправильний формат
        });
        assertEquals("Неправильний формат виразу", thrown.getMessage());
    }
}
