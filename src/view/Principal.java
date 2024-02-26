package view;

import controller.SomatoriaRecursiva;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        SomatoriaRecursiva somatoriaRecursiva = new SomatoriaRecursiva();

        System.out.println("Entre com o valor a ser somado: ");
        int n = scan.nextInt();

        double resultado = somatoriaRecursiva.calcSomatoria(n);

        System.out.println("Somatória totaliza: " + resultado);
    }
}
