package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class SpringBootXssApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootXssApplication.class, args);
    }

    @RequestMapping("/")
    public String index() {
        return "jsp";
    }

    @RequestMapping("/thymeleaf")
    public String thymeleaf() {
        return "thymeleaf";
    }

    @RequestMapping("/velocity")
    public String velocity() {
        return "velocity";
    }

    @ModelAttribute("username")
    public String username() {
    	return "\";alert(7)";
    }
}
