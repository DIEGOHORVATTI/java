// Vulgo matriz

import java.util.Date;
import java.util.Random;

public class ArrayMultDimencional {
  public static void main(String[] args) {
    
    Random seed = new Random(new Date().getTime());
    
    int dias[][] = new int[4][4];
    
    // atualiza matriz
    for (int j = 0; j < dias.length; j++) {
      for (int i = 0; i < dias.length; i++) {
        dias[j][i] = 10+(seed.nextInt(20));
      }
    }
    
    // imprimi matriz
    System.out.print("{\n\t");
    for (int j = 0; j < dias.length; j++) {
      for (int i = 0; i < dias.length; i++) {
        System.out.print("'" + dias[j][i] + "' ");
      }
      System.out.print("\n\t");
    }
    System.out.print("\n}");
  }
}