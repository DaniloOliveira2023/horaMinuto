import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double horaMinuto;
        double minutoHora;
        int conversao;
        double valor = 0;
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("Digite o método de conversão");
            System.out.println("1 - Hora para minutos");
            System.out.println("2 - Minutos para hora");
            System.out.println("0 - Encerrar programa");
            conversao = s.nextInt();
            System.out.println("Digite o valor a ser convertido");
            valor = s.nextDouble();
            if (conversao == 1) {
                valor = horaMinuto(valor);
                System.out.println("O valor equivale a " +valor+ " minutos");
            } else if (conversao==2) {
                minutoHora(valor);
            }
            else {
                System.out.println("Valor inválido");
            }
        } while (conversao != 0);
    }

    public static double horaMinuto (double valor) {
        valor = valor * 60;
        return valor;
    }

    public static void minutoHora (double valor) {
        System.out.println("O valor equivale a " +valor/60+ " horas");
    }
}