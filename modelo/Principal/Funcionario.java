/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.Principal;

/**
 *
 * @author aluno
 */
    public class Funcionario {
    //inicialmente os atributos serao private
        //mudar os modificadores dos atrubutos
        //para PROTECTED de modo que esses atributos da classe Funcionario (PAI) tenha
        //visibilidade dentro da hierarquia da Herança na classe Gerente
    protected String nome;
    protected double salario;
    protected String cpf;
    
    
    //construtores Getters e Setters

    public Funcionario() {
    }

    public Funcionario(String nome, double salario, String cpf) {
        this.nome = nome;
        this.salario = salario;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getInformacao(){
        return "Funcionario: " + this.nome + " recebe " + this.salario;
    }
    public double getBonificacao(){
        return this.salario * 0.10;
    }
}
