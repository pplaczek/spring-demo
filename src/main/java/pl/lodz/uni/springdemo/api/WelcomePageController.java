package pl.lodz.uni.springdemo.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class WelcomePageController {

    // inject from application.properties
    @Value("${welcome.message:test}")
    private String message = "Welcome";

    @GetMapping("/welcome")
    public String welcome(Map<String, Object> model) {
        model.put("message", this.message);
        return "welcome";
    }

}
