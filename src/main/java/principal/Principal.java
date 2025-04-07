/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;
import javax.swing.JOptionPane;
import model.Circulo;
/**
 *
 * @author User
 */
public class Principal {
    public static void main (String[] args) {
        Circulo cir1 = new Circulo();
        
        cir1.setRaio(Double.parseDouble(JOptionPane.showInputDialog("Digite o raio do circulo: ")));
       
        JOptionPane.showMessageDialog(null, "A area do circulo é: " + cir1.getArea());
    }
}
