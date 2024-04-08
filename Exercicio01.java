import java.util.Scanner;

public class Exercicio01{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] NumInt = new int[5];

        for(int i = 0; i < NumInt.length; i++){
            System.out.print("Digite a nota do aluno: ");
            NumInt[i] = input.nextInt();
        }
        for(int i = 0; i < NumInt.length; i++){
            System.out.println(NumInt[i]);
        }
        input.close();
    }
}