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
public class Compara {

    
    
    private String nombre ;
    private float peso ;
   
    
public void pedirDatos(){
    nombre=JOptionPane.showInputDialog ("Escribe el nombre");
    peso=Float.parseFloat(JOptionPane.showInputDialog ("Teclea el peso"));

}
   
   
 public void compara(Compara obx1,Compara obx2){
         if(obx1.peso>obx2.peso)
             JOptionPane.showMessageDialog(null,"La persona "+obx1.nombre+" pesa más que "+obx2.peso+", la diferencia de peso entre ellos es "+(obx1.peso-obx2.peso));
         else if (obx2.peso>obx1.peso)
             JOptionPane.showMessageDialog(null,"La persona "+obx2.nombre+" pesa más que "+obx1.nombre+", la diferencia de peso entre ellos es de "+(obx2.peso-obx1.peso)); 
         else
             JOptionPane.showMessageDialog(null,"La persona "+obx1.nombre+" pesa lo mismo que "+obx2.nombre); 
  
    
    
    
    
    
}







}