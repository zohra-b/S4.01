package cat.itacademy.s04.t01.n01.S4.T01.N01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String saluda(@RequestParam(value = "nom", defaultValue = "unknown") String nom){
        return "Hello " + nom + ". Estàs executant un projecte Maven.";
    }

    @GetMapping({"/hello2", "/hello2/{nom}"})
    public String saluda2(@PathVariable(required = false) String nom){
        if (nom == null){
            nom = "";
        }

        return "Hello2 " + nom + ". Estàs executant un projecte Maven.";


    }
}
