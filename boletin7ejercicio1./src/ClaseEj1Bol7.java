/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;
/**
 *
 * @author aabalalonso
 */
public class ClaseEj1Bol7 {
    public int perdirNum1(){
    int num1;
    String res = JOptionPane.showInputDialog("Teclea el numero 1");
   num1=Integer.parseInt(res);
    return num1;
    
}
   public void mayorque0(int num1){
       if (num1>0)
          JOptionPane.showMessageDialog(null,"el numero 1 es mayor que 0");
       else if (0>num1)
           JOptionPane.showMessageDialog(null,"el numero es menor que 0 ");
       else 
           JOptionPane.showMessageDialog(null,"el numero es 0");
       
       
   }
    
    
    
    
    
}
