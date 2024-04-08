import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nota = new int[4];
        double media = 0;

        for(int i = 0; i < nota.length; i++){
            System.out.print("Digite a nota do aluno: ");
            nota[i] = input.nextInt();
        }

        for(int i = 0; i < nota.length; i++){
            media += nota[i];
        }

        for(int i = 0; i < nota.length; i++){
            System.out.println("A nota é: " + nota[i]);
            
        }

        System.out.println("A média é: " + media / nota.length);

        input.close();
    }
}