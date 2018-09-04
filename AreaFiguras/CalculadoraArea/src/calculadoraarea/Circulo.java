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
public class Circulo extends Figura {
    
    private double radio;
    
    public Circulo() {
        super();
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double calcularArea() {
        this.area=Math.PI*(Math.pow(this.radio, 2));
        return this.area;
    }

    @Override
    public double calcularPerimetro() {
        this.perimetro=2*Math.PI*this.radio;
        return this.perimetro;
    }
    
}
