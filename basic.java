import java.util.Scanner;

public class SumOfDigit{
    public static void main(String args[]){
        int num = 12345;
        int sum =0;
         while (num!=0){
             sum = sum + num % 10;
             num = num / 10;
         }

        int result = sum + sum ;
        System.out.println("sum is into 2 : " + result );
     
    }
}
