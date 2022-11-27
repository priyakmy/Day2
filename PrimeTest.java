import java.util.Scanner;

public class PrimeTest {

  public static void main(String[] args) {

    int num ;
    boolean flag = false;
	System.out.println("Enter your number : "); 
	  num = new Scanner(System.in).nextInt();
	  
    for (int i = 2; i <= num / 2; ++i) {
    
      if (num % i == 0) {
        flag = true;
        break;
      }
    }

    if (!flag)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");
  }
}


// Prime number between two number
