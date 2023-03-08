/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = 0;
        int impar = 0;
        int par = 0;
        int contador = 10;
    
        for(int i = 0; i < 10; i++){
            System.out.println("Digite um número. ( " + contador + " números restantes)");
            n = sc.nextInt();

            if(n % 2 == 0){
                ++par;
            }
            else{
                ++impar;
            }

            --contador;
        }

        System.out.println("\nForam digitados 10 números");
        System.out.println("Sendo eles " + impar + " números impar e " + par + " números par.\n");

    }
}
