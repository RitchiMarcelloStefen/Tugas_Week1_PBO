package Tugas;

public class Tugas2 {
    public static void main(String[] args){
         //Persegi
         int sisi = 5;
         int luas = sisi * sisi;
         int keliling = sisi * sisi * sisi * sisi;
         System.out.println("1. Luas dan Keliling persegi dengan sisi 5 adalah              LUAS         : " + luas);
         System.out.println("                                                               KELILING     : " + keliling);
         System.out.println(" -------------------------------------------------------------------------------");
         //Segitiga
         int alas = 5;
         int tinggi = 5;
         float luasSegitiga = (alas * tinggi) / 2;
         int kelilingSegitiga = alas + tinggi + alas;
         System.out.println("2. Luas dan Keliling segitiga dengan alas 5 dan tinggi 5 adalah LUAS        : " + luasSegitiga);   
         System.out.println("                                                                KELILING    : " + kelilingSegitiga);
         System.out.println(" -------------------------------------------------------------------------------");
        //Lingkaran
        int jari = 5;
        float phi = 3.14f;
        float luasLingkaran = phi * jari * jari;
        float kelilingLingkaran = 2 * phi * jari;
        System.out.println("3. Luas dan Keliling lingkaran dengan jari-jari 5 adalah          LUAS        : " + luasLingkaran);   
        System.out.println("                                                                  KELILING    : " + kelilingLingkaran);
        System.out.println(" -------------------------------------------------------------------------------");
        //Kubus
        int sisiKubus = 5;
        int luasKubus = 6 * sisiKubus * sisiKubus;
        int kelilingKubus = 12 * sisiKubus * sisiKubus;
        System.out.println("4. Luas dan Keliling kubus dengan sisi 5 adalah                    LUAS        : " + luasKubus);
        System.out.println("                                                                   KELILING    : " + kelilingKubus);
        System.out.println(" -------------------------------------------------------------------------------");
    }
}
