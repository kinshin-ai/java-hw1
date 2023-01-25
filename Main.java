/* Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! */

/*import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.print("введите число n: ");
        int num = in.nextInt();
    int count = 1;
    int fact = 1;
    int triangle = 0;

    while (count <= num)  {
      triangle = triangle + count;
      fact = fact * count;
      count ++;
    }

    System.out.printf("треугольное число = %s", triangle);
    System.out.printf("\nфакториал = %s", fact);
    in.close();
  }
}*/


/*Вывести все простые числа от 1 до 1000*/

/*class Main {
  public static void main(String[] args) {
    int i = 1;

    while (i!=1000) {
      if (i==2 | i==3 | i==5 | i==7) {
         System.out.println(i);
        i++;
      }
      else if (i%2==0 | i%3==0 || i%5==0 || i%7==0) {
         i ++;       
      }
      else {
        System.out.println(i);
        i++;
      }
    }
  }
}*/


/*Реализовать простой калькулятор

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.print("введите первое число: ");
    Scanner in1 = new Scanner(System.in);
      float num1 = in1.nextFloat();

    System.out.print("введите второе число: ");
    Scanner in2 = new Scanner(System.in);
      float num2 = in2.nextFloat();

    System.out.print("какое действие хотите сделать с этими числами (+, -, *, /)? ");
    Scanner in3 = new Scanner(System.in);
      String action = in3.next();
    float result = 0;

    if (action == "+") {
      result = num1+num2;
    }
    else if (action == "-") {
      result = num1-num2;
    }
    else if (action == "*") {
      result = num1*num2;
    }
    else if (action == "/") {
      result = num1/num2;
    }    
    System.out.print(result);
  } 
}*/

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      double num1;
      double num2;
      double result;
      char action;
      Scanner reader = new Scanner(System.in);
      System.out.print("введите два числа: ");
      
     num1 = reader.nextDouble();
      num2 = reader.nextDouble();
      System.out.print("\nЧто вы хотите с ними сделать (+, -, *, /): ");
      action = reader.next().charAt(0);
      
      if (action == "+") {
        result = num1+num2;
      }
      else if (action == "-") {
        result = num1-num2;
      }
      else if (action == "*") {
        result = num1*num2;
      }
      else if (action == "/") {
        result = num1/num2;
      }    
     
     switch(action) {
         case '+': result = num1 + num2;
            break;
         case '-': result = num1 - num2;
            break;
         case '*': result = num1 * num2;
            break;
         case '/': result = num1 / num2;
            break;
         default:  System.out.printf("Error! Enter correct operator");
            return;
      }
      System.out.printf(num1 + " " + action + " " + num2 + " = " + result);
   }
}
}


