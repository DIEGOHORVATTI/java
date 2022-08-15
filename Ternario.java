public class Ternario {
  public static void main(String[] args){
  
    boolean res_1 = true ? true : false;
    System.out.print(res_1);

    String res_2 = true ? "sim" : "não";
    System.out.print("\n" + res_2);

    String res_3 = false ? "1" : false ? "2" : "3";
    System.out.print("\n" + res_3);
  
  }
}