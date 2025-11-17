import java.util.*;
public class Even_Or_Odd {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(IsEvev(n));

    }
    static String IsEvev(int n){
        if(n%2 == 0){
            return "Even";
        }
    return "Odd";    
    }

    
}
