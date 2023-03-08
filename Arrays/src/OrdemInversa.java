/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

public class OrdemInversa {
    public static void main(String[] args){
        int[] vetor = {1, 2, 3, 4, 5, 6};

        System.out.println("Ordem correta");
        for(int i : vetor){
            System.out.print(i);
        }
        
        System.out.println("\n\nOrdem inversa");
        int contador = 5;
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[contador]);
            --contador;
        }
    }
}
