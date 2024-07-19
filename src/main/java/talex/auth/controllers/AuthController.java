package talex.auth.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
public class AuthController {   
    @GetMapping("/")
    public String getDashboard() {
        return "dashboard";
    }
    @GetMapping("/login")
    public String loginForm() {
        return "login";
    }
}
