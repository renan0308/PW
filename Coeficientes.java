/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coeficientes;


import java.io.PrintStream;
import java.util.Scanner;
import static javafx.scene.input.KeyCode.X;


public class Coeficientes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
              
      int a,b,c;
      
      System.out.print("a: ");
      a = ler.nextInt();
      
      System.out.print("b: ");
      b = ler.nextInt();
      
      System.out.print("c: ");
      c = ler.nextInt();
      
      double delta;
      delta = Math.pow(b, 2) - (4 * a * c);
      
      System.out.println();
      
      if (delta < 0)
          System.out.printf("não existem resultado reais/n");
      
      if (delta == 0);
      double x;
         x = -b / (2 * a);
          System.out.printf("x' e x'' = %.2f/n", x);
          
          if (delta > 0);
          double X1,X2;
          X1 = (-b + Math.sqrt(delta)) / (2 * a);
          X2 = (-b - Math.sqrt(delta)) / (2 * a);
           System.out.printf("x' = %.2f\n", X1);
           System.out.printf("x' = %.2f\n", X2);

              
      
    }
    
}
