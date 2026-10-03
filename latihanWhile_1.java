import java.util.Scanner;
public class latihanWhile_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Masuka nilai n : ");
        n = input.nextInt();
        while (n >= 1 ){
            System.out.println(n);
            n--;
        }
    }
}
