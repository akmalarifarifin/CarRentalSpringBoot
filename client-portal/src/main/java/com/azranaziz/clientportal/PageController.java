package com.azranaziz.clientportal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String home() {
        return "index"; // This will render the home.html template
    }

    @GetMapping("/dashboardV2")
    public String dashboardV2() { return "index2"; }

    @GetMapping("/dashboardV3")
    public String dashboardV3() { return "index3"; }

    @GetMapping("/add-car")
    public String addCar() { return "pages/add-car"; }

}
