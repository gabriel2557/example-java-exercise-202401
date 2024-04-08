import java.util.Scanner;

public class Exercicio02{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetorNumeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for(int i = 0; i < vetorNumeros.length; i++){
            System.out.print("Digite o número: ");
           vetorNumeros[i] = input.nextInt();
        }

        System.out.println("Os números com a sequência ao contrário: ");

        for(int i = 9; i >= 0; i--){ 
            System.out.println( vetorNumeros[i]);
        }

        input.close();
    }
}