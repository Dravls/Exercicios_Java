/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/
import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] vetor = new String[6];

        int quantConsoantes = 0;
        int contador = 0;

        do{
            System.out.println("Digite 6 letras");
            String letra = sc.next();

            if(!(letra.equalsIgnoreCase("a") | 
            letra.equalsIgnoreCase("e") |
            letra.equalsIgnoreCase("i") |
            letra.equalsIgnoreCase("o") |
            letra.equalsIgnoreCase("u"))){
                vetor[contador] = letra;
                quantConsoantes++;
            }
            contador++;
        }
        while(contador < vetor.length);

        for (String i : vetor) {
            if(i != null)
                System.out.print(i + " ");
        }
        System.out.println("Consoantes " + quantConsoantes);
    }
}
