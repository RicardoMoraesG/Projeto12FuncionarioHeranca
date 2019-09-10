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
public class Projeto12FuncionarioHeranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Funcionario objFunc01 = new Funcionario();
        objFunc01.setNome("Joao");
        objFunc01.setSalario(500);
        objFunc01.setCpf("111222333");
        System.out.println("Func01: " +objFunc01.getNome());
       
        
        Gerente objGer01= new Gerente();
        objGer01.setNome("Maria");
        objGer01.setSalario(600);
        objGer01.setCpf("222111444");
        objGer01.setSetor("ADM");
        objGer01.setSenha("112233");
        System.out.println("Ger01" +objGer01.getNome());
        System.out.println("Info: " + objGer01.getInformacao());
        objGer01.gerAutenticacao("112233");
        
       
        
        /*nem todo funcionário será um gerente, mas todo gerente será um funcionário
        Funcionario objFunc02 = new Gerente();
        //Gerente objGer02 = new Funcionario();
        pode ser utilizado um recurso de *Casting entre objetos* para converter o tipo.*/
        //exemplo:        
        Funcionario objFunc02 = new Gerente();
        //Gerente objGer02 = (Gerente) new Funcionario();
        
        //Atribuição entre objetos
        //usando casting
        //objFunc02 = objGer02;
       //objGer02 = (Gerente)objFunc02;
        
        
        
        
    }
    
}
