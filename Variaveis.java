public class Variaveis{
  public static void main(String[] args){

    // int, double, float, char, byte, short, long, boolean
    int inteiro = 19;
    double dobro = 90.4D;
    float flutuante = 91.96F;
    char caracter = 'D';
    byte bayte = 127;
    short curto = 42;
    long longo = 4000;
    boolean boleano = false;
    String string = "Java é diferenciado!";
    
    System.out.printf(
      "Tipos de dados em Java" +
      "\n  byte...:[" + "1 byte " + "] = " + bayte + 
      "\n  int....:[" + "4 bytes" + "] = " + inteiro + 
      "\n  double.:[" + "8 bytes" + "] = " + dobro + 
      "\n  float..:[" + "4 bytes" + "] = " + flutuante + 
      "\n  char...:[" + "2 bytes" + "] = " + caracter + 
      "\n  short..:[" + "2 bytes" + "] = " + curto +
      "\n  long...:[" + "8 bytes" + "] = " + longo +
      "\n  bolean.:[" + "1 byte " + "] = " + boleano +
      "\n  String.:[" + "x" + "] = " + string 
    );

    System.out.println(
      "\n\nTamanho de dados em Java" +
      "\n  Menor Byte: " + Byte.MIN_VALUE +
      "\n  Maior Byte: " + Byte.MAX_VALUE +
      "\n  Menor Short Int: " + Short.MIN_VALUE +
      "\n  Maior Short Int: " + Short.MAX_VALUE +
      "\n  Menor Int: " + Integer.MIN_VALUE +
      "\n  Maior Int: " + Integer.MAX_VALUE +
      "\n  Menor Long: " + Long.MIN_VALUE +
      "\n  Maior Long:" + Long.MAX_VALUE +
      "\n  Menor Float: " + Float.MIN_VALUE +
      "\n  Maior Float: " + Float.MAX_VALUE +
      "\n  Menor Double: " + Double.MIN_VALUE +
      "\n  Maior Double: " + Double.MAX_VALUE
    );

    // Tabela ascii -> https://web.fe.up.pt/~ee96100/projecto/Tabela%20ascii.htm

  }
}