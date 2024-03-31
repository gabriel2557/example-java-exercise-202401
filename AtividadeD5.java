import java.text.DecimalFormat;
import java.util.Scanner;


public class AtividadeD5 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");

        double[] temperatura = new double[12];
        float mediaTotal = 0;

        for (int i = 0; i < 12; i++) {
            boolean aux = true;
            System.out.println("Insira uma temperatura " + (i + 1) + " (entre 4 e 10): ");

            while (aux) {
                temperatura[i] = sc.nextDouble();

                if (temperatura[i] < 4 || temperatura[i] > 10) {
                    System.out.print("Valor de temperatura informado Invalido! Digite um valor valido \n ");
                } else {
                    aux = false;
                }
            }
        } 

        for (int i = 0; i < 12; i++) {
            mediaTotal += temperatura[i];
        }

        mediaTotal /= temperatura.length;

        System.out.printf("A média das temperaturas é de:  %s ", df.format(mediaTotal));

        sc.close();
    }
    
}