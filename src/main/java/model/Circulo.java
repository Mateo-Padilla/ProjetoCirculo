/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author User
 */
public class Circulo {
    private double raio;
    private double pi;
    
    public Circulo (){
        this(0,0);
    }
    public Circulo(double raio, double pi){
        this.raio = raio;
        this.pi = pi;
    }
    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }
    public double getPi() {
        return pi;
    }
    public void setPi(double pi) {
        this.pi = pi;
    }
      public double getArea(){
        return ((getRaio()) * getRaio()) * 3.14159;
    }
}
