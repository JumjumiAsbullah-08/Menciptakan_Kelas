# Menciptakan_Kelas
# KelasMobil2 menggunakan java

package com.mycompany.menciptakan_kelas2;

//soal no 2 dengan nama class KelasMobil2
class KelasMobil2{
        String merk,warna,model;
        int tahun_produksi,harga_mobil;
        
        
    //ini adalah metode dengan nama metode kelasmobil2
    void kelasmobil2(String merk_mobil, String warna_mobil, String model_mobil, int tahun_produksi_mobil, int hrg_mobil){
    merk = merk_mobil;
    warna = warna_mobil;
    model = model_mobil;
    tahun_produksi = tahun_produksi_mobil;
    harga_mobil = hrg_mobil;
    
}
   String Merk(){
    return merk;
    }
    String Warna(){
    return warna;
    }
    String Model(){
    return model;
    } 
    int Tahun_Produksi(){
        return tahun_produksi;
    }
    int Harga_Mobil(){
        return harga_mobil;
    }

}
public class kelas_mobil2 {
    public static void main(String[] args) {
        KelasMobil2 kelas_mobil2 = new KelasMobil2();
        
        kelas_mobil2.kelasmobil2("Lamborgini", "merah", "Baru", 2020, 1500000000);
        
        System.out.println("Saya mempunyai sebuah mobil " +kelas_mobil2.merk +" Mobil saya berwarna " +kelas_mobil2.warna + " \nModel Mobil Saya " + kelas_mobil2.model + ". Tahun Keluaran " + kelas_mobil2.tahun_produksi + ". Mobil Saya di Bandrol Sekitar Rp " +kelas_mobil2.harga_mobil);
    } 
}
