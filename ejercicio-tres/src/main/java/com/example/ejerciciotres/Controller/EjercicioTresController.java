package com.example.ejerciciotres.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EjercicioTresController {

    @RequestMapping("/formulario")
    public String formulario() {
        return "formulario";
    }

    @PostMapping("/validar-contrasena")
    public String validarContrasena(@RequestParam String contrasena, Model model) {
        if (contrasena.length() < 8) {
            model.addAttribute("mensaje", "La contraseña debe tener al menos 8 caracteres.");
            return "notValidPassword";
        } else {
            model.addAttribute("mensaje", "Welcome user");
            return "validUser";
        }
    }

}
