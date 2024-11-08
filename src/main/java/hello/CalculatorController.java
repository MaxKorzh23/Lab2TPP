package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    private final Calculator calculator = new Calculator();

    @PostMapping("/calculate")
    public String calculate(@RequestParam("expression") String expression, Model model) {
        double result;
        try {
            result = calculator.calculate(expression);
        } catch (IllegalArgumentException e) {
            model.addAttribute("error", e.getMessage());
            return "index"; // Повертаємо до index.html у разі помилки
        }

        model.addAttribute("expression", expression);
        model.addAttribute("result", result);
        return "index"; // Повертаємо до index.html
    }
}
