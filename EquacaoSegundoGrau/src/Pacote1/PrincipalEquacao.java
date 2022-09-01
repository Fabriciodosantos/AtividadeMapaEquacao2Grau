package Pacote1;

import java.util.Scanner;

public class PrincipalEquacao {
    private static double calcularDelta(int a, int b, int c) throws IllegalArgumentException {
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta < 0) {
            throw new IllegalArgumentException("Delta é: " + delta + "\nNão existem raízes reais.");
        }
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.println("#Resultado da Equação#");

        System.out.println("------------------------");

        System.out.println("Valor de Delta: " + delta);
        System.out.println("Valor de X1: " + x1);
        System.out.println("Valor de X2: " + x2);
        return delta;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 0, b = 0, c = 0;

        System.out.print("Digite o valor de A: ");
        a = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        b = scanner.nextInt();

        System.out.print("Digite o valor de C: ");
        c = scanner.nextInt();

        System.out.println("------------------------");

        try {
            calcularDelta(a, b, c);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
