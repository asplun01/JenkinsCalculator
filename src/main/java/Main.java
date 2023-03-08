import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    System.out.println("Welcome to the calculator");
    System.out.println("Enter a command: ");
    Calculator calc = new Calculator();
    BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
    String line = reader.readLine();
    String[] words = line.split("\\s+");
    while(!words[0].equals("exit")) {
      if (words[0].equals("add")) {
        int num1 = Integer.parseInt(words[1]);
        int num2 = Integer.parseInt(words[2]);
        System.out.println(calc.add(num1, num2));
      }
      else if (words[0].equals("subtract")) {
        int num1 = Integer.parseInt(words[1]);
        int num2 = Integer.parseInt(words[2]);
        System.out.println(calc.subtract(num1, num2));
      }
      else if (words[0].equals("multiply")) {
        int num1 = Integer.parseInt(words[1]);
        int num2 = Integer.parseInt(words[2]);
        System.out.println(calc.multiply(num1, num2));
      }
      else if (words[0].equals("divide")) {
        int num1 = Integer.parseInt(words[1]);
        int num2 = Integer.parseInt(words[2]);
        System.out.println(calc.divide(num1, num2));
      }
      else if (words[0].equals("fib")) {
        System.out.println(calc.fibonacciNumberFinder(Integer.parseInt(words[1])));
      }
      else if (words[0].equals("binary")) {
        System.out.println(calc.intToBinaryNumber(Integer.parseInt(words[1])));
      }
      line = reader.readLine();
      words = line.split("\\s+");

    }

  }
}
