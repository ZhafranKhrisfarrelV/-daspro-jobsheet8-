import java.util.Scanner;

void main () {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan nilai n = ");
    int n = sc.nextInt();

    int jumlah = 0;

    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
            int hasil = j * i;
            System.out.print(hasil + "\t");
            jumlah += hasil;
        }
        System.out.println();
    }
    System.out.print("Jumlah seluruh angka : " + jumlah);
    sc.close();
}