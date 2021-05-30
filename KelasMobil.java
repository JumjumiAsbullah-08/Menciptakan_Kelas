# Menciptakan_Kelas
# KelasMobil menggunakan java

package com.mycompany.menciptakan_kelas;

class kelas_mobil{
    String merk,warna,model;
    int tahun_produksi,harga_mobil;
}

public class KelasMobil {

    public static void main(String[] args) {
        kelas_mobil mobilku = new kelas_mobil();
        
        mobilku.merk = "Tesla";
        mobilku.warna = "Silver";
        mobilku.model = "Tesla Model 3";
        mobilku.tahun_produksi = 2020;
        mobilku.harga_mobil = 1000000000;
   
            
        System.out.println("Hai!!, Saya mempunyai Sebuah Mobil Baru Buatan Eropa \ndengan merk " + mobilku.merk +" warnanya " + mobilku.warna +" model mobil Saya " + mobilku.model +" \ntahun Produksi pada tahun " + mobilku.tahun_produksi  +". Harganya lumayan mahal, harganya sekitaran Rp." + mobilku.harga_mobil);
    }
    
}

