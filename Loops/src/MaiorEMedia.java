/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

import java.util.Scanner;

public class MaiorEMedia {
    
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        int maiorNumero = 0;
        int soma = 0;
        int x = 5;
        int n;

        for(int i = 0; i < 5; i++){
            System.out.println("Digite " + x + " números");
            n = sc.nextInt();

            if(n > maiorNumero){
                maiorNumero = n;
            }

            soma += n;

            --x;
        }

        System.out.println("O maior número é " + maiorNumero);
        System.out.println("A soma dos números é " + soma);
    }

}
