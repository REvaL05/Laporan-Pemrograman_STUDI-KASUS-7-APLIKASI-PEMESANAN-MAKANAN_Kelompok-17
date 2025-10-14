public class Pemesanan {  
    private String[][] pelanggan = new String[1][2];
    private Object[][] pesanan = new Object[1][2]; 
    private int totalHarga;
 
    public void setPelanggan(String nama, String telepon) {
        pelanggan[0][0] = nama;
        pelanggan[0][1] = telepon;
    }

    public void setPesanan(String jenisMakanan, int jumlah) {
        pesanan[0][0] = jenisMakanan;
        pesanan[0][1] = jumlah;
    }

    public void hitungTotalHarga(int hargaPerPorsi) {
        int jumlah = (int) pesanan[0][1];
        totalHarga = hargaPerPorsi * jumlah;
    }

    public String[][] getPelanggan() {
        return pelanggan;
    }

    public Object[][] getPesanan() {
        return pesanan;
    }

    public int getTotalHarga() {
        return totalHarga;
    }
}
