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
public class Compararshorts {
    public short perdirNum1(){
    short num1;
    String res = JOptionPane.showInputDialog("Teclea el numero 1");
   num1=Short.parseShort(res);
    return num1;
    
    
    
    
}
    public short perdirNum2(){
    short num2;
    String res = JOptionPane.showInputDialog("Teclea el numero 2");
   num2=Short.parseShort(res);
    return num2;
    }
    public void comparar(short num1,short num2){
        if (num1>num2)
        JOptionPane.showMessageDialog(null,"el numero 1 es mayor que el numero 2,la resta daría  "+ (num1-num2));
        else if (num1<num2)
            JOptionPane.showMessageDialog(null,"el numero 2 es mayor que el numero 1,la suma daria  "+ (num1+num2));
        else 
                JOptionPane.showMessageDialog(null,"los numero son iguales,la suma daría  "+(num1+num2));
        
        
    }
    
    
}
