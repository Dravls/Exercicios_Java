import java.util.Scanner;

public class NomeEIdade{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;

        while(true){
            System.out.println("Nome: ");
            nome = sc.nextLine();
            if(nome.equals("0")) 
                break;

            System.out.println("Idade: ");
            idade = sc.nextInt();
        }

        sc.close();
    }
}