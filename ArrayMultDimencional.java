// Vulgo matriz

import java.util.Date;
import java.util.Random;

public class ArrayMultDimencional {
  public static void main(String[] args) {
    
    Random seed = new Random(new Date().getTime());
    
    
    /* For */
    
    int dias[][] = new int[4][4];
    
    // atualiza matriz
    for (int j = 0; j < dias.length; j++) {
      for (int i = 0; i < dias.length; i++) {
        dias[j][i] = 10+(seed.nextInt(80));
      }
    }
    
    // imprimi matriz
    System.out.print(" {\n\t");
    for (int j = 0; j < dias.length; j++) {
      for (int i = 0; i < dias.length; i++) {
        System.out.print("'" + dias[j][i] + "' ");
      }
      System.out.print("\n\t");
    }
    System.out.print("\n }");
    
    
    /* Foreach */
    
    int meses[][] = new int[4][4];
    
    // atualiza matriz
    for (int j = 0; j < meses.length; j++) {
      for (int i = 0; i < meses.length; i++) {
        meses[j][i] = 10+(seed.nextInt(80));
      }
    }
    
    // imprimi matriz foreach
    System.out.print(" {\n\t");
    for (int j[]: meses){
      for (int i:j){
        System.out.print("'" + i + "' ");
      }
      System.out.print("\n\t");
    }
    System.out.print("\n }");
    
    
    /* Outra forma de iniciar um array */
    
    // atualiza matriz
    int ano[][] = { 
      {75, 18, 22, 71}, 
      {21, 54, 35, 29}, 
      {28, 77, 70, 19}, 
      {77, 84, 35, 39} 
    }; 
    
    // imprimi matriz foreach
    System.out.print(" {\n\t");
    for (int j[] : ano) {
      for (int i : j) {
        System.out.print("'" + i + "' ");
      }
      System.out.print("\n\t");
    }
    System.out.print("\n }");
  }
}