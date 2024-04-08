import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[] caracteres = new char[10];


        for(int i = 0; i < caracteres.length; i++){
            System.out.print("Digite o caracter: ");
            caracteres[i] = input.next().charAt(0);
        }

        for(int i= 0; i < caracteres.length; i++){
            if (caracteres[i] != 'a' && caracteres[i] != 'e' && caracteres[i] != 'i' && caracteres[i] != 'o' && caracteres[i] != 'u'){
                if (caracteres[i] != 'A' && caracteres[i] != 'E' && caracteres[i] != 'I' && caracteres[i] != 'O' && caracteres[i] != 'U') {
                    System.out.println("Os caracteres sem as vogais: " + caracteres[i]);
                }
            }
        }
        input.close();;
    }
}