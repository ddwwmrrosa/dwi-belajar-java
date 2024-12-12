public class Lingkaran {
    // Property jari_jari dengan tipe data double
    double jari_jari;

    // Property phi dengan tipe data double bernilai 3.14
    double phi = 3.14;

    // Property static jumlahLingkaran dengan tipe data integer bernilai 0
    static int jumlahLingkaran = 0;

    // Konstruktor pertama tanpa ada masukan dan tidak melakukan apa-apa
    public Lingkaran() {}

    // Konstruktor kedua memiliki 1 masukan yaitu jari_jari_baru bertipe data double
    public Lingkaran(double jari_jari_baru) {
        jari_jari = jari_jari_baru;
        jumlahLingkaran++;
    }

    // Method getLuas, mengembalikan nilai luas lingkaran
    public double getLuas() {
        return phi * jari_jari * jari_jari;
    }

    // Method getKeliling, mengembalikan nilai keliling lingkaran
    public double getKeliling() {
        return 2 * phi * jari_jari;
    }

    // Method static getJumlahLingkaran, mengembalikan nilai jumlah lingkaran yang dibuat
    public static int getJumlahLingkaran() {
        return jumlahLingkaran;
    }
}