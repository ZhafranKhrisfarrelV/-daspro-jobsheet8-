import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);

    int jumlahTokoh;
    do {
        System.out.print("Jumlah toko: ");
        jumlahTokoh = sc.nextInt();
    } while (jumlahTokoh < 1);

    int totalSemua = 0;
    int terbanyak = -1;
    int tokoTerbanyak = 0;

    for (int toko = 1; toko <= jumlahTokoh; toko++) {
        int pelanggan;
        do {
            System.out.print("Jumlah Pelanggan Toko" + toko + ": ");
            pelanggan = sc.nextInt();
        } while (pelanggan < 0);

        int totalToko = 0;
        for (int p = 1; p <= pelanggan; p++) {
            int barang;
            do {
                System.out.print("Jumlah Barang Pelanggan" + p + ": ");
                barang = sc.nextInt();
            } while (barang < 0);

            totalToko += barang;
        }
        System.out.println("Toko" + toko + "- pelanggan" + pelanggan + "total barang:" + totalToko);
        totalSemua += totalToko;

        if (totalToko > terbanyak) {
            terbanyak = totalToko;
            tokoTerbanyak = toko;
        }

    }
    System.out.println("Total barang seluruh toko: " + totalSemua);
    System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
    sc.close();


}