import java.util.Scanner; 
public class FindLargestSmallestNumber {

 public static void main(String[] args) 
 {
    int numbers[] = new int[10];
    int smallest = numbers[0];
    int largetst = numbers[0];
	
	Scanner sc=new Scanner(System.in); 
	
    
System.out.println("Enter the elements of the array: ");  
for(int i=0; i<10; i++)  
{  
numbers[i]=sc.nextInt();  
}  
System.out.println("Array elements are: ");  
  
 
 
  for (int i = 1; i < numbers.length; i++)
  {
   if (numbers[i] > largetst)
    largetst = numbers[i]; 

   else if (numbers[i] < smallest)
    smallest = numbers[i];
  }

for (int i=0; i<10; i++)   
{  
System.out.println(numbers[i]);
}
  System.out.println("Largest Number is : " + largetst);
  System.out.println("Smallest Number is : " + smallest);
 
}
}
