package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rodrigo Puertas
 */
public class Gerente extends Funcionario {
    // Atributo específico para o percentual de aumento do salário do gerente
    private Double percentual = 18.78;
    
    // Método para calcular o salário do gerente
    @Override
    public Double calcularSalario() {
        // Retorna o salário base do funcionário (herdado da classe Funcionario) multiplicado pelo percentual de aumento
        return super.getSalario() * percentual; 
    }
}


