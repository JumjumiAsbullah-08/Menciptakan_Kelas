# Membuat sebuah lingkup di Java

package com.mycompany.lingkup;

class Lingkup{
    //nama dalam bentuk class
    String nama = " Jumjumi Asbullah";
    String alamat = "Desa Pangirkiran";
   
    void infoLingkup(){
        //nama dalam bentuk Metode
        String nama = " Asbullah Jumjumi";
        String alamat = " Desa Pangirkiran";
        
        //output dalam bentuk metode
        System.out.println(" INI ADALAH CONTOH NAMA DALAM BENTUK METODE");
        System.out.println(" Perkenalkan Nama Saya "+ nama + " Alamat Saya" +alamat);
        System.out.println(" =======================================================================");
        
        //output dalam bentuk class
        System.out.println(" INI ADALAH CONTOH NAMA DALAM BENTUK CLASS");
        System.out.println(" Perkenalkan Nama Saya" +this.nama + " Alamat Saya " +this.alamat);
        System.out.println(" =======================================================================");
    }
}

public class LingkupVariabel {
    public static void main(String[] args) {
       Lingkup lingkup = new Lingkup();
       lingkup.infoLingkup();
    }
    
}
