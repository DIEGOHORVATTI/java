public class Loop {
  public static void main(String[] args) {
    
    // while
    int x=0;
    while (x < 10) {
      System.out.print(x + "\n");
      x++;
    }
    System.out.print("\n");
    
    // for
    for (int i = 0; i < 10; i++) {
      System.out.print(i + "\n");
    }
    int y = 0;
    
    // do while
    do {
      System.out.print(y + "\n");
      y++; 
    }while (y < 10);
    System.out.print("\n");
    
  }
}