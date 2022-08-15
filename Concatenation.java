public class Concatenation {
  public static void main(String[] args){
    
    String nome = "Arthur";
    String enderaco = "Dicaten, Darv, Subsolo";
    float salario = 0.000F;
    int data_dia = 10;
    int data_mes = 8;
    int data_ano = 1800;

    System.out.print("Eu " + nome + ", morando em " + enderaco + ", confirmo que recebi o sálario de " + salario + ", na data " + (data_dia+"/"+data_mes+"/"+data_ano) );
  } 
}
