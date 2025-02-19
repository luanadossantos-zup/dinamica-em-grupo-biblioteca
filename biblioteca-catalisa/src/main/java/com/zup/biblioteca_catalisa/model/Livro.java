package com.zup.biblioteca_catalisa.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "livros")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String autor;
    private int ano;
    private String genero;

}
