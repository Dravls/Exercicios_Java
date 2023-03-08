/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/

import java.util.Scanner;

public class NotaJava{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int nota;

        while(true){
            System.out.println("Dê uma nota de 0 a 10");
            nota = sc.nextInt();

            if(nota <= 10 && nota >= 0){
                System.out.println("Sua nota foi " + nota);
                break;
            }
            else{
                System.out.println("Nota inválida");
            }
        }

    }
}