import java.util.Scanner;
public class CheckEvenOdd {
   public static void main(String[] args) {
       Scanner reader = new Scanner(System.in);
       System.out.print("Enter a number: ");
       int num = reader.nextInt();
       if (num % 2 == 0)
           System.out.println(num + " is even");
       else
           System.out.println(num + " is odd");
   }
}

//code added by Developer-2 
public class Main {
   public static void main(String[] args) {
       System.out.println("Hello World");
   }
}
