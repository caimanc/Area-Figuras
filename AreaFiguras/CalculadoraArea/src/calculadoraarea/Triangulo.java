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
public class Triangulo extends Figura{

    private double base;
    private double altura;
    
    public Triangulo(){
        super();
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override
    
    public double calcularArea() {
        this.area=(this.base*this.altura)/2;
        return this.area; 
    }

    @Override
    public double calcularPerimetro() {
        this.perimetro=this.base+this.altura+Math.sqrt((this.base*this.base)+(this.altura*this.altura));
        return this.perimetro;
    }
    
}
