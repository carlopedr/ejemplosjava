/*
 1.	Crea una clase Complejo que permita trabajar 
con números complejos (parte real y parte imaginaria). 
Incluye los siguientes métodos: 
constructores (por defecto y parametrizado), getters, setters, 
suma, resta, multiplicación, división, acumulación y print().
 */
package clases20201;
import java.util.Scanner;

public class Complejos {
    private float real;
    private float imag;
    //Constructor parametrizado
    public Complejos(float real, float imag) {
        this.real = real;
        this.imag = imag;
    }
    //Constructor por defecto
    public Complejos() {
        this.real = 0;
        this.imag = 0;
    }

    public float getReal() {
        return real;
    }

    public float getImag() {
        return imag;
    }

    public void setReal(float real) {
        this.real = real;
    }

    public void setImag(float imag) {
        this.imag = imag;
    }
    
    public void suma(float real, float imag){
        this.real=this.real+real;
        this.imag=this.imag+imag;
    }
    
    public Complejos suma(Complejos sum){
        Complejos res = new Complejos();
        res.real=this.real+sum.real;
        res.imag=this.imag+sum.imag;
        return res;
    }
    
    public void resta(float real, float imag) {
        this.real = this.real - real;
        this.imag = this.imag - imag;
    }

    @Override
    public String toString() {
        return "Complejos{" + "real=" + real + ", imag=" + imag + '}';
    }
    
    
    
    
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Complejos c1 = new Complejos(1,2);
        System.out.println(c1.toString());
        c1.suma(3, 4);
        System.out.println("Suma P:"+c1.toString());
        c1.resta(5, 6);
        System.out.println("Resta:"+c1.toString());
        Complejos c2=new Complejos(3,4);
        Complejos res=c1.suma(c2);
        System.out.println("Suma C"+res.toString());
     }
}
