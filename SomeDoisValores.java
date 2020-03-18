import javax.swing.*;
public class SomeDoisValores{
   public static void main (String args[]){
      int x, y, res;
      x = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
      y = Integer.parseInt(JOptionPane.showInputDialog("Digite outro valor inteiro"));
      res = x + y;
      if (res > 10){
      JOptionPane.showMessageDialog(null, "A sua soma deu =" + " " + res);
      }
   }
}