/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4bol7;
import javax.swing.JOptionPane;
/**
 *
 * @author aabalalonso
 */
public class Ejercicio4Bol7 {
float peso ;
String nombre ;
    
    public static void main(String[] args) {
        Compara persona1 = new Compara();
        Compara persona2 = new Compara();
        persona1.pedirDatos();
        persona2.pedirDatos();
        persona1.compara(persona1, persona2);
        
        
        
        
        
    }
    
}
