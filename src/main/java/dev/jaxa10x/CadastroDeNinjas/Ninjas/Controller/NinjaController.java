package dev.jaxa10x.CadastroDeNinjas.Ninjas.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// O RestController é uma anotação que indica que essa classe é um controlador REST
//O requestMapping define a rota base para todas as requisições desse controlador
@RestController
@RequestMapping
public class NinjaController {

    // Rota de boas-vindas
    // A anotação @GetMapping indica que essa rota responde a requisições HTTP GET
    // O metodo boasVindas retorna uma String que será a resposta da requisição
    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Essa é minha primeira mensagem nessa rota";
    }


}
