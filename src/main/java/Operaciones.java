
/*
Autor: jhon freddy grizales
Fecha de creacion: 2021-07-03
Programa de:
Realizar la suma, la resta, la división y la multiplicación de dos números
leídos por teclado y mostrar en pantalla “La <operación> de <número 1>
y <número 2> es igual a <resultado> ”.
*/
import java.util.Scanner;
public class Operaciones{
    public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            System.out.print("Ingrese el primer numero: ");
            int num1 = in.nextInt();
            System.out.print("Ingrese el segundo numero: ");
            int num2 = in.nextInt();
            System.out.println("La suma de los dos numeros es: " + num1 + " + " + num2 + " = " +
                    (num1 + num2));
            System.out.println("La resta de los dos numeros es: " + num1 + " - " + num2 + " = " +
                    (num1 - num2));
            System.out.println("La multiplicacion de los dos numeros es: " + num1 + " x " + num2 + " = " +
                    (num1 * num2));
            System.out.println("La division de los dos numeros es: " + num1 + " / " + num2 + " = " +
                    (num1 / num2));
            System.out.println("Fin del programa");

        }

    }

    /*
    import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  System.out.println("Input the first number: ");
  int n1 = scanner.nextInt();
  System.out.println("Input the second number: ");
  int n2 = scanner.nextInt();
  int sum = n1 + n2;
  int minus = n1 - n2;
  int multiply = n1 * n2;
  int subtract = n1 + n2;
  int divide = n1 / n2;
  int rnums = n1 % n2;
  System.out.printf("Sum = %d\nMinus = %d\nMultiply = %d\nSubtract = %d\nDivide = %d\nRemainderOf2Numbers = %d\n ", sum, minus, multiply, subtract, divide, rnums);
 }
}
     */


