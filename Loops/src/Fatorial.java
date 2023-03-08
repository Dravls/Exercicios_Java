/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número");
        int n = sc.nextInt();
        int resultado = n;
        int fatorial = n;

        while(n > 1){
            resultado *= n-1;
            --n;
        }

        System.out.println(fatorial + "! = " + resultado);
    }
}
