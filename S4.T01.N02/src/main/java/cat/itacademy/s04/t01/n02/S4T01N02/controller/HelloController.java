package cat.itacademy.s04.t01.n02.S4T01N02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "nom", defaultValue = "unknown") String nom){
       return "Hola " + nom + ". Estàs executant un projecte Gradle";
    }


    @GetMapping(path = {"/hello2", "/hello2/{nom}"})
    public String hello2(@PathVariable(required = false)  String nom){
        if(nom == null){
            nom = "";
        }
        return "Hola2 " + nom + ". Estàs executant un projecte Gradle";
    }
}
