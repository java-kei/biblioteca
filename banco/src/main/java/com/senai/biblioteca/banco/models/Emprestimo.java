package com.senai.biblioteca.banco.models;

import java.time.LocalDate;

public class Emprestimo {
    private int id;
    private int contaId;
    private LocalDate diaEmprestimo;
    private LocalDate diaDevolucao;
    private String livro;


    public Emprestimo () {} 
    public Emprestimo (int contaId, LocalDate diaEmprestimo, LocalDate diaDevolucao, String livro) {
        this.contaId = contaId;
        this.diaEmprestimo = diaEmprestimo;
        this.diaDevolucao = diaDevolucao;
        this.livro = livro;
    }

    

}
