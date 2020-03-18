import javax.swing.*;
public class LerTresNumeros{
   public static void main (String args []){
      int x, y, z;
      x = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
      y = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
      z = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro numero"));
      if (x > y && x > z){
         if (y > z){
            JOptionPane.showMessageDialog(null, x + "," + " " + y + " " + "e " + z);
         }
         else{
            JOptionPane.showMessageDialog(null, x + "," + " " + z + " " + "e " + y);
         }
      }
      else if (y > x && y > z){
         if (x>z){
            JOptionPane.showMessageDialog(null, y + "," + " " + x + " " + "e " + z);
         }
         else{
            JOptionPane.showMessageDialog(null, y + "," + " " + z + " " + "e " + x);
         }
      }
      else if (x > y) JOptionPane.showMessageDialog(null, z + "," + " " + x + " " + "e " + y);
         else JOptionPane.showMessageDialog(null, z + "," + " " + y + " " + "e " + x);      
   }
}