/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joaodengoso;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class JoaoDengoso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int escolha = 0;
        Scanner objetoScanner = new Scanner(System.in);
        
        System.out.println("1 - Cadastro de Doente");
        System.out.println("2 - Relatório 1");
        System.out.println("3 - Relatório 2");
        System.out.println("4 - Relatório 3");
        System.out.println("5 - Relatório 4");
        System.out.print("Digite o número da sua opção: ");
        escolha = objetoScanner.nextInt();
        
        switch (escolha){
            case 1:
                Doente novoDoente = new Doente();
            break;    
        
        }
        
        System.out.println(escolha);
        
        
    }
    
}
