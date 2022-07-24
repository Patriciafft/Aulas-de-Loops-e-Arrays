package aulas.loops.e.arrays;

import java.util.Scanner;

public class NomeEIdadeWhileIfBreak {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;
        //Esse programa se repete enquanto não é for parado pelo Break if/break.
        while (true) {
            System.out.println("Nome: ");
            nome = scan.next();
            if (nome.equals("0")) break;
            System.out.println("Idade: ");
            idade = scan.nextInt();
        }

        System.out.println("Continua aqui... ");
    }

    }
