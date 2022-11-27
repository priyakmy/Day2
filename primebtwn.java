// prime  number between 1 to n
import java.util.Scanner;

class primebtwn {

  public static int isprime(int n) {
    
    for (int i = 2; i <= Math.sqrt(n); i++) {
      
      if (n % i == 0) {
        return -1;
      }
    }
   
    return 1;
  }

  public static void main(String args[]) {

    Scanner in = new Scanner(System.in);
    System.out.print("Enter the value of n : ");
    int n = in.nextInt();

    in.close();

    for (int i = 1; i <= n; i++) {
     
      if (i == 1) continue;

    
      if (isprime(i) == 1) {
        System.out.print(i + " ");
      }
    }
  }
}
