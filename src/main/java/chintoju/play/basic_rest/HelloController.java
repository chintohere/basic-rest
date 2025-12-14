package chintoju.play.basic_rest;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam(defaultValue = "World") String name, HttpServletRequest request, Model model) {
        String clientIp = request.getRemoteAddr();
        model.addAttribute("name", name);
        model.addAttribute("clientIp", clientIp);
        return "hello";
    }
}
