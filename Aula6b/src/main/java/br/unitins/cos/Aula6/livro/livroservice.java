package br.unitins.cos.Aula6.livro;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class livroservice {
    @Autowired
    livrorepositorio livrorepositorio;

    List<livro> getlivro(){
        return (List<livro>)  livrorepositorio.findAll();
    }
}
