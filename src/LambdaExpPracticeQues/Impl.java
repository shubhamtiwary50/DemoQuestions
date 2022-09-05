package LambdaExpPracticeQues;

import java.util.Scanner;

public class Impl {
    public static void main(String[] args) {
        int number;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number you want to test");
        number = sc.nextInt();
        Impl impl = new Impl();
         EvenOrOdd o1= new EvenOrOdd() {
             @Override
             public boolean isNumberOddOrEven(int number)
             {
                 if (number%2==0)
                 {
                     System.out.println(number+ " is even ");
                     return true;
                 }else
                 {
                     System.out.println(number+ " is odd ");
                     return false;
                    }
             }
         };
         o1.isNumberOddOrEven(number);
    }
}
