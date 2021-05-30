# Menciptakan_Kelas
# KelasMobil3 menggunakan Java

package com.mycompany.menciptakan_kelas3;

//main class dengan nama Kelas_Mobil3
class Kelas_Mobil3{
    String merk;
    int Tahun;
    String warna;
        
        //metode
        void isidata(String merk, int Tahun, String warna){
            this.merk = merk;
            this.Tahun = Tahun;
            this.warna = warna;
        }
}
public class KelasMobil3 {
    public static void main(String[] args) {
      
        Kelas_Mobil3 mobil = new Kelas_Mobil3();
        
        mobil.isidata("Range Rover", 2021, "Putih");
      
             System.out.println("Mobil Impianku: " + mobil.merk + " warna " + mobil.warna + " tahun " + mobil.Tahun);
    }
    
}
