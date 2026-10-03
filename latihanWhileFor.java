import java.util.Scanner;
public class latihanWhileFor {
    private static int mahasiswa;

    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Masukan jumlah mahasiswa: ");
        int mahasiswa, i, j;
        double total, nilai;
        total = 0.0;
        mahasiswa = input.nextInt();
        while (mahasiswa > 1 ){
            for (i = 1; i <= mahasiswa; i++){
                System.out.println("Mahasiswa " + i);
                for (j=1; j <=3; j++){
                    System.out.print("Masukan nilai ke" + j+":");
                    nilai = input.nextDouble();
                    total = total + nilai;
                }
                System.out.println("Total mahasiswa ke " + j + ": " + total);

            }
        break;
        }
    }
}
