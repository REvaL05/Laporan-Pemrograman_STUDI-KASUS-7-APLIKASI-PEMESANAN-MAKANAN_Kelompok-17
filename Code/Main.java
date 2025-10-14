import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pemesanan pesan = new Pemesanan();

        System.out.println("=====================================");
        System.out.println("      APLIKASI PEMESANAN MAKANAN     ");
        System.out.println("=====================================");

        System.out.print("Nama Pelanggan     : ");
        String nama = input.nextLine();
        System.out.print("Nomor Telepon      : ");
        String telepon = input.nextLine();
        pesan.setPelanggan(nama, telepon);

        System.out.print("Jenis Makanan      : ");
        String makanan = input.nextLine();
        System.out.print("Jumlah Pesanan     : ");
        int jumlah = input.nextInt();
        System.out.print("Harga per Porsi    : ");
        int harga = input.nextInt();

        pesan.setPesanan(makanan, jumlah);
        pesan.hitungTotalHarga(harga);
        
        System.out.println("\n------------ RINCIAN PESANAN ------------");
        System.out.println("Nama Pelanggan  : " + pesan.getPelanggan()[0][0]);
        System.out.println("Nomor Telepon   : " + pesan.getPelanggan()[0][1]);
        System.out.println("Jenis Makanan   : " + pesan.getPesanan()[0][0]);
        System.out.println("Jumlah Pesanan  : " + pesan.getPesanan()[0][1]);
        System.out.println("Total Harga     : Rp" + pesan.getTotalHarga());
        System.out.println("-----------------------------------------");

        System.out.println("Terima kasih telah memesan!");
        input.close();
    }
}
