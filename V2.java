/*
Escribir un programa para que se llene un vector 
(arreglo unidimensional) con N números aleatorios reales, 
y realice las siguientes tareas:
1.	Despliegue en pantalla el contenido del vector
2.	Determine el menor y mayor valor de los elementos del vector
3.	Sume los valores del vector.
4.	Calcule el promedio de los valores del vector

 */
package ejemploc20201;
import java.util.Scanner;
import java.text.DecimalFormat;
public class V2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        float a[]= new float[20];
        float mayor,menor,suma=0,prom;
        int n;
        System.out.print("Cuantos datos?: ");
        n=input.nextInt();
        //Llenar el arreglo de números aleatorios
        for(int i=0;i<n;i++){
            a[i]=(float)(Math.random()*10);
        }
        //Mostrar el contenido del arreglo
        for(int k=0;k<n;k++){
          System.out.print(df.format(a[k])+"\t");
        }
        //Hallar el mayor y el menor valor
        mayor=a[0];
        menor = a[0];
        for (int k = 0; k < n; k++) {
            if (a[k] > mayor) {
                mayor = a[k];
            }
            if (a[k] < menor) {
                menor = a[k];
            }
            suma+=a[k];
        }
        System.out.println("\nMayor: " + df.format(mayor));
        System.out.println("Menor: " + df.format(menor));
        System.out.println("Sumatoria: "+df.format(suma));
        prom=suma/n;
        System.out.println("Promedio: "+df.format(prom));
    //Hacer el código que falta
    //Ordenamiento
    
    //Busqueda
    
    //Distribución
    
    }

}
