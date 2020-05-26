/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploc20201;

import java.util.Scanner;
import java.text.DecimalFormat;

public class V1 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        double[] a = new double[100];
        double sum = 0;
        System.out.println("Introduzca la longitud del vector: ");
        int n = input.nextInt();
        DecimalFormat df = new DecimalFormat("0.00");
        double ax = 0;
        double b = 200;
        for (int i = 0; i < n; i++) {
            a[i] = (double) (Math.random() * 100);
            sum = sum + a[i];
            if (a[i] > ax) {
                ax = a[i];
            }
            if (a[i] < b) {
                b = a[i];
            }
        }
        System.out.println("El vector es: ");
        for (int o = 0; o < n; o++) {
            System.out.print(df.format(a[o]) + " ");
        }
        System.out.println("");
        System.out.println("El mayor es: " + df.format(ax));
        System.out.println("El menor es: " + df.format(b));
        System.out.println("La suma es: " + df.format(sum));
    }
}




