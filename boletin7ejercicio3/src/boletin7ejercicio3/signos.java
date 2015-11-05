
package boletin7ejercicio3;
import javax.swing.JOptionPane;
/**
 *
 * @author aabalalonso
 */
public class signos {
    public int perdirNum1(){
    int num1;
    String res = JOptionPane.showInputDialog("Teclea el numero 1");
   num1=Integer.parseInt(res);
    return num1;
    }
     public void Sacarsigno(int num1){
         if(num1>0)
             JOptionPane.showMessageDialog(null,"El numero lleva el signo +");
         else if (num1<0)
             JOptionPane.showMessageDialog(null,"El numero lleva el signo -"); 
         else
             JOptionPane.showMessageDialog(null,"El numero es 0"); 
                 
                 
                 
                 
                 
                 
     }
    
}
