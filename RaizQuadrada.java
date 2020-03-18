import javax.swing.*;
public class RaizQuadrada{
   public static void main (String args[]){
   double x, res;
   res = 0;
   x = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor"));
   if (x > 0){
      res = Math.sqrt(x);
      JOptionPane.showMessageDialog(null, "Essa é a sua raiz = " + res);
   }
   else{
      res = Math.pow(x,2);
      JOptionPane.showMessageDialog(null, "Esse é o quadrado do seu numero = " + res);
   }
   }
}