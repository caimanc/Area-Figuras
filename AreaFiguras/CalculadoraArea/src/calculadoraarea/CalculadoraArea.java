/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraarea;

/**
 *
 * @author PROFESIONAL
 */
import java.util.Scanner;
public class CalculadoraArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("ingrese opcion de acceso");
        System.out.println("1. Cuadrado");
        System.out.println("2. circulo");
        System.out.println("3. rectangulo");
        System.out.println("4. triangulo");
        opcion=sc.nextInt();
        switch (opcion){
            case 1:
                Cuadrado c=new Cuadrado();
                System.out.println("ingrese lado");
                c.setLado(sc.nextFloat());
                c.calcularArea();
                c.calcularPerimetro();
                System.out.println("area: "+c.getArea());
                System.out.println("perimetro: "+c.getPerimetro());
                break;
            case 2:
                Circulo co=new Circulo();
                System.out.println("ingrese radio");
                co.setRadio(sc.nextFloat());
                co.calcularArea();
                co.calcularPerimetro();
                System.out.println("area: "+co.getArea());
                System.out.println("perimetro: "+co.getPerimetro());
                break;
            case 3:
                Rectangulo r=new Rectangulo();
                System.out.println("ingrese base");
                r.setBase(sc.nextFloat());
                System.out.println("ingrese altura");
                r.setAltura(sc.nextFloat());
                r.calcularArea();
                r.calcularPerimetro();
                System.out.println("area: "+r.getArea());
                System.out.println("perimetro: "+r.getPerimetro());
                break;
            case 4:
                Triangulo t=new Triangulo();
                System.out.println("ingrese base");
                t.setBase(sc.nextFloat());
                System.out.println("ingrese altura");
                t.setAltura(sc.nextFloat());
                t.calcularArea();
                t.calcularPerimetro();
                System.out.println("area: "+t.getArea());
                System.out.println("perimetro: "+t.getPerimetro());
                break;
        }
    }
    
}
