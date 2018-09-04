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
public class Cuadrado extends Figura{

    private double lado;
    
    public Cuadrado() {
        super();
    }
    
    public void setLado(double lado) {
        this.lado = lado;
    }

    
    @Override
    public double calcularArea() {
        this.area=this.lado*this.lado;
        return this.area;
    }

    @Override
    public double calcularPerimetro() {
        perimetro=this.lado*4;
        return this.perimetro;
    }
    
}
