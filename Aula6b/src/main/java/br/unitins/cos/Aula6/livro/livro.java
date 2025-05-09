package br.unitins.cos.Aula6.livro;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;



@Entity

public class livro {
    @Id
    Long IdLivro;
    String titulo;
    String autor;
    String editora;
    int gtdePaginas;
}
