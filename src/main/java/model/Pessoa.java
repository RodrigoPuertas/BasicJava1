/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author Rodrigo Puertas
 */
public class Pessoa {
    
    private String nome;
    private LocalDate nascimento;
    
    public Pessoa(){
    }

    public Pessoa(String nome, LocalDate nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNacimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nacimento) {
        this.nascimento = nacimento;
    }
}
