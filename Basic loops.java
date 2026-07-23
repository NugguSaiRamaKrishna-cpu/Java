class Main{
  public static void main(String[] args){
    for(int i = 0;i<11;i++){
      System.out.println(i);
    }
    // printing in same line
    for(int i = 0;i<11;i++){
      System.out.print(i+" ");
    }
    System.out.println();
    int i = 0;
    while(i<11){
      System.out.println(i);
      i++;
    }
    // do while loop will run once if the condition is also false
    int j = 0;
    do{
      System.out.println(j);
      j++;
    }while(j<11);
  }
}
