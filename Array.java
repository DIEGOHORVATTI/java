import java.util.Date;
import java.util.Random;

public class Array {
  public static void main(String[] args){
    
    Random seed = new Random(new Date().getTime());
    
    int idades[] = new int[3];
    
    for (int i = 0; i < idades.length; i++) {
      idades[i] = seed.nextInt(20);
    }
    
    System.out.print("{ ");
    for (int i = 0; i < idades.length; i++) {
      System.out.print("'" + idades[i] + "' ");
    }
    System.out.print("}");
  }
}
