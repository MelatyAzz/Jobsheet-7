import java.util.Scanner;
public class SiakadFor18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //deklarasi variabel
        double nilai, tertinggi = 0;
        double terendah = 100;

        for (int i = 1; i <= 10; i++ ) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah =  nilai;
    System.out.println("Nilai tertinngi: " + tertinggi);
    System.out.println("Nilai terendah:" + terendah);
            }
        }
    }
}
