package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

@Controller
public class HomeController {

    @Autowired
    private CarServiceImpl carServiceImpl;

    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        if (count == null || count >= 5) {
            model.addAttribute("cars", carServiceImpl.getCars(5));
        } else {
            model.addAttribute("cars", carServiceImpl.getCars(count));
        }
        return "cars";
    }

}
