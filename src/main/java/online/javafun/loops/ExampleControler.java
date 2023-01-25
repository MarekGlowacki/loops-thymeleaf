package online.javafun.loops;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ExampleControler {

    @GetMapping("/")
    String example(Model model) {
        List<Person> people = List.of(
                new Person("Jan", "Nowak"),
                new Person("Kamil", "Kowalski"),
                new Person("Alicja", "Dąbrowska"),
                new Person("Marta", "Cybulska")
        );
        model.addAttribute("people", people);
        model.addAttribute("size", 5);
        return "example";
    }
}
