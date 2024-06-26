package com.sudoagile.ejercicio2;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@Slf4j
public class ControladorInicio {
@Value("${index.saludo}")
    private String saludo;


    @GetMapping("/")
    public String inicio(Model model) {
        var mensaje ="Hola mundo con Thymeleaf";
        log.info("Ejecutando el controlador Spring MVC");
        model.addAttribute("mensaje", mensaje);
        model.addAttribute("saludo", saludo);
        return "index";
    }
}
