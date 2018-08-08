/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joaodengoso;

import java.util.ArrayList;
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
        ArrayList<Doente> bancoDeDados = new ArrayList<Doente>();

        int escolha = 0;
        int sexo, data;
        Scanner objetoScanner = new Scanner(System.in);

        do {
            System.out.println("1 - Cadastro de Doente");
            System.out.println("2 - Relatório 1");
            System.out.println("3 - Relatório 2");
            System.out.println("4 - Relatório 3");
            System.out.println("5 - Relatório 4");
            System.out.println("Digite 0 para sair.");
            System.out.print("Digite o número da sua opção: ");
            escolha = objetoScanner.nextInt();

            switch (escolha) {
                case 1:
                    Doente novoDoente = new Doente();

                    System.out.println("Qual o sexo? 0/1 ");
                    sexo = objetoScanner.nextInt();
                    novoDoente.setSexo(sexo);

                    System.out.println("Qual a data de nascimento? (somente numeros");
                    data = objetoScanner.nextInt();
                    novoDoente.setDataNascimento(data);

                    System.out.println("Informe o nome da rua: ");
                    String rua = objetoScanner.next();

                    System.out.println("Informe o bairro: ");
                    String bairro = objetoScanner.next();

                    Endereco endereco = new Endereco(rua, bairro);
                    novoDoente.setEndereco(endereco);

                    bancoDeDados.add(novoDoente);

                    break;

            }
        } while (escolha != 0);
        System.out.println(bancoDeDados.size());

    }

}
