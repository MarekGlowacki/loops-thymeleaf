package online.javafun.loops;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExampleControler {

    @GetMapping("/")
    String example(Model model) {
        return "example";
    }
}
