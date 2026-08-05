import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of n: ");
    int n = sc.nextInt();
    for(int i =n;i>=1;i--){
      for(int j=1;j<=i;j++){
          if(j<10){
              System.out.print(" "+j+" ");
          }
          else{
              System.out.print(j+" ");
          }
        
      }
      System.out.println();
    }
    sc.close();
  }
}
