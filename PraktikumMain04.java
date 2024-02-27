import java.util.Scanner;

public class PraktikumMain04 {

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                praktikum03.PersegiPanjang[] arrayofPersegiPanjang = new praktikum03.PersegiPanjang[3];

                for (int i = 0; i < 3; i++) {
                        arrayofPersegiPanjang[i] = new praktikum03.PersegiPanjang();

                        System.out.println("Persegi panjang ke-" + (i + 1));
                        System.out.print("Masukan Panjang: ");
                        arrayofPersegiPanjang[i].panjang = sc.nextInt();
                        System.out.print("Masukkan lebar: ");
                        arrayofPersegiPanjang[i].lebar = sc.nextInt();
                }
                for (int i = 0; i < 3; i++) {
                        System.out.println("Persegi panjang ke-" + (i + 1) + ", panjang: "
                                        + arrayofPersegiPanjang[i].panjang + ", lebar: "
                                        + arrayofPersegiPanjang[i].lebar);
                }
        }
}
