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
public class Rectangulo extends Figura {
    
    private double base;
    private double altura;
    
    public Rectangulo(){
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
        this.area=this.base*this.altura;
        return this.area; 
    }

    @Override
    public double calcularPerimetro() {
        this.perimetro=(2*this.base)+(2*this.altura);
        return this.perimetro;
    }
    
}
