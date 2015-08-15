// Project Euler

//Multiples of 3 & 5

public class Euler{

  public static int Multiples(int limit){
    int totalSum = 0;
      for (int x=0 ; x<limit; x++){
        if(x%3==0 || x%5==0){
          totalSum +=x;
        }
      }
      return totalSum;
  }S
  public static void main(String[] args){
    System.out.println(Multiples(1000));
  }
}
