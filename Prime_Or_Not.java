 import java.util.*;
public class Prime_Or_Not {
    public static void main(String[] args){
        System.out.println("Enter a number to check whether a number is prime or not");
        Scanner input = new Scanner(System.in);
        int n  = input.nextInt();
        System.out.println(isPrime(n));
        
    }
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int count = 2;
        while(count*count <=n){
            if(n%count == 0){
                return false;
            }
            count++;
        }
        return true;
    }
}


