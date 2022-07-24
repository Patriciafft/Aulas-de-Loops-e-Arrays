package aulas.loops.e.arrays;

import java.util.Scanner;

public class NotaWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();

        // Esse programa é true enquanto a nota é menor que zero e maior que 10
        while(nota < 0 | nota > 10) {
            System.out.println("Nota inválida! Digite novamente: ");
            nota = scan.nextInt();

        }


    }
}
