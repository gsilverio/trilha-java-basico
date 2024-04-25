package org.example;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO:Conhecer e importar a classe Scanner;
        //Exibir as mensagens para o nosso usuario;
        //Obter pela scanner os valores digitados no terminal;
        //Exibir a mensagem conta criada;

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite seu nome!");
        String nome = sc.nextLine();
        System.out.println("Por favor, digite o numero da Agencia!");
        String agencia = sc.nextLine();
        System.out.println("Por favor, digite o numero da conta!");
        int numero = sc.nextInt();
        System.out.println("Por favor, digite o saldo!");
        double saldo = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nome,agencia,numero, saldo);
    }
}