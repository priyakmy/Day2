import java.util.Scanner;
public class FibCalc {
	
  public static int fibRecursion(int count) {
    if (count == 0) {
      return 0;
    } 

    if (count == 1 || count == 2) {
      return 1;
    } 
	
    return fibRecursion(count - 1) + fibRecursion(count - 2);
  }

  public static void main(String args[]) {
    int fib_len ;
	System.out.println("Enter number upto which Fibonacci series to print: "); 
	  fib_len = new Scanner(System.in).nextInt();


    System.out.print("Fibonacci Series of " + fib_len + " numbers is: \n");

    for (int i = 0; i < fib_len; i++) {
      System.out.print(fibRecursion(i) + " ");
    }
  }
}
