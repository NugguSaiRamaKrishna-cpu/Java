import java.util.*;
class Main{
  public static void main (String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=0; i<=10; i++){
      int prod = n*i;
      System.out.println(n+"*"+i+"="+prod);
    }
    sc.close();
  }
}
