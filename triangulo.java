import java.io.Console;
import java.util.Scanner;
class Main {

  static Scanner console = new Scanner(System.in);

  static void ExecutarTriangulo()
  {
    float numero = 0;
    float numero2 = 0;
    float numero3 = 0;
    System.out.println("Qual o valor do primeiro lado ");
    numero = console.nextFloat();
    System.out.println("Qual o valor do segundo lado ");
    numero2 = console.nextFloat();
    System.out.println("Qual o valor do terceiro lado ");
   numero3 = console.nextFloat();    

  
   if(numero == numero2 && numero3 != numero || numero2 == numero3 && numero3 != numero)
  {
     System.out.println("Seu triangulo é Isósceles");
   }
    else if (numero != numero2 && numero2 != numero && numero3 != numero )
    {
      System.out.println("Seu triangulo é escaleno");
    }
     else if (numero == numero2 && numero2 == numero3 && numero3 == numero)
    {
      System.out.println("Seu triangulo é equilatero");
    }
    
  }

  public static void main(String[] args) {


    ExecutarTriangulo();
    
    
  }
}
