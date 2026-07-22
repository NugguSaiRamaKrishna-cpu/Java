import java.util.*;
class Main{
  public static void main (String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of a :");
    int a = sc.nextInt();
    System.out.println("Enter the value of b :");
    int b = sc.nextInt();
    System.out.println("Enter operation :");
    String choice = sc.next();
    switch(choice){
      case "add" :
        System.out.println("The sum of given numbers is: "+(a+b));
        break;
      case "sub" :
        System.out.println("The subtraction of given numbers is: "+(a-b));
        break;
      case "mul" :
        System.out.println("The multiplication of given numbers is: "+(a*b));
        break;
      case "div" :
        if (b != 0){
          System.out.println("Result = " + (a / b));
        }
        else{
          System.out.println("Division by zero is not allowed.");
        }
        break;
      case "mod" :
        if (b != 0){
           System.out.println("Result = " + (a % b));
        }
        else{
           System.out.println("Modulus by zero is not allowed.");
        }
        break;
      default :
        System.out.println("Invalid operator");
    }
    sc.close();
  }
}
