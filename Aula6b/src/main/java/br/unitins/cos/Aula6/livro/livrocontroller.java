package br.unitins.cos.Aula6.livro;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class livrocontroller {
    @Autowired
    livroservice livroservice;


    @GetMapping("/livro")
    List<livro> pegarlivro(){
        return livro
    }
}
