import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if(num%2 == 0){
      System.out.println("The given number: "+num+" is even");
    }
    else{
      System.out.println("The given number: "+num+" is odd");
    }
    sc.close();
  }
}
