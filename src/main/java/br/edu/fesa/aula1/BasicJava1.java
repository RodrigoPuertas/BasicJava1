/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.fesa.aula1;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import model.Funcionario;

/**
 *
 * @author Rodrigo Puertas
 */
public class BasicJava1 {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("José da Silva", LocalDate.of(2003, 8, 27), LocalDate.now());
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMMM/YYYY");
        
        System.out.println(funcionario.getNome());
        System.out.println(dtf.format(funcionario.getNacimento()));
        System.out.println(dtf.format(funcionario.getContratacao()));
        System.out.println(funcionario.getMatricula());
        System.out.println(funcionario.getSalario());
    }
}
