package model;

import java.time.LocalDate;

public class Funcionario extends Pessoa {
    
    // Variável estática para controlar a matrícula
    private static Integer controleDeMatricula = 0;
    
    // Atributos da classe Funcionario
    private Integer matricula;
    private LocalDate contratacao;
    private Double salario = 1682.37;

    // Construtor padrão
    public Funcionario() {
        this.matricula = ++controleDeMatricula;
    }
    
    // Construtor com parâmetros
    public Funcionario(String nome, LocalDate nascimento, LocalDate contratacao){
        super(nome, nascimento);
        this.matricula = ++controleDeMatricula;
        this.contratacao = contratacao; // Atribui o valor do parâmetro contratacao ao atributo this.contratacao
    }

    // Método para obter o controle de matrícula
    public Integer getControleDeMatricula() {
        return controleDeMatricula;
    }

    // Método setter para controleDeMatricula - não muito útil neste contexto
    public void setControleDeMatricula(Integer controleMatricula) {
        this.controleDeMatricula = controleMatricula;
    }

    // Método getter para matrícula
    public Integer getMatricula() {
        return matricula;
    }

    // Método setter para matrícula
    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    // Método getter para contratação
    public LocalDate getContratacao() {
        return contratacao;
    }

    // Método setter para contratação
    public void setContratacao(LocalDate contratacao) {
        this.contratacao = contratacao;
    }
    
    // Método getter para salário
    public Double getSalario() {
        return salario;
    }
    
    public Double calcularSalario(){
        return salario;
    }
}
