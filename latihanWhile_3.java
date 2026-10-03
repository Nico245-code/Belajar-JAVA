import java.util.Scanner;
public class latihanWhile_3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int tebakan, angka, percobaan;
        angka = 73;
        percobaan = 0;
        while (true ) {
            System.out.print("Masukan tebakan anda : ");
            tebakan = input.nextInt();
            percobaan++;

            if (tebakan > angka){
                System.out.println("Terlalu besar");
            } else if (tebakan < angka){
                System.out.println("Terlalu kecil");
            } else {
                System.out.println("Angka Benar");
                System.out.println("Jumlah percobaan : " + percobaan);
                break;
            }

        }
    }
}
