/*
Realizar un programa que llene una matriz NxM de 
números aleatorios enteros, luego calcule dos vectores 
donde se escriban la suma de las filas y las columnas.
 */
package ejemploc20201;

import java.util.Scanner;

public class M1 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int mt[][] = new int[20][20];
        int sf[] = new int[20];
        int sc[] = new int[20];
        int m, n;
        System.out.print("No. de Filas: ");
        m=input.nextInt();
        System.out.print("No. de Columnas: ");
        n=input.nextInt();
        //Llenar la matriz
        for(int f=0;f<m;f++){
            for(int c=0;c<n;c++){
                mt[f][c]=(int)(Math.random()*10);
            }
        }
        //Mostrar el contenido de la matriz
        int acum=0;
        for(int f=0;f<m;f++){
            acum=0;
            for(int c=0;c<n;c++){
                System.out.print(mt[f][c]+"\t");
                acum=acum+mt[f][c];
            }
            System.out.println();
            sf[f]=acum;
        }
        System.out.println("Vector Suma de filas");
        for(int i=0;i<m;i++){
            System.out.print(sf[i]+"\t");
        }
        //Recorrido de la matriz por columnas
        for(int c=0;c<n;c++){
            acum=0;
            for(int f=0;f<m;f++){
                acum=acum+mt[f][c];
            }
            sc[c]=acum;
        }
        System.out.println("\nVector Suma de columnas");
        for(int i=0;i<n;i++){
            System.out.print(sc[i]+"\t");
        }

    }
}
