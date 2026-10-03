import java.util.Scanner;
public class latihanWhile_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan angka : ");
        int angka, total;
        total = 0;

        while (true){
            angka = input.nextInt();
            total = total + angka;
            if (angka == 0){
                System.out.println("Hasil penjumlahan : " + total);
                break;
            }
        }
    }
}
