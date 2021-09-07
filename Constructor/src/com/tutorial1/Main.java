/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial1;

//class
 class Mobil{
    int roda, pintu;
    String brand,warna,Mesin;
    
    
//    //constructur tanpa parameter
    Mobil(){
        System.out.println("Hello world");
        
    }
    
    //constructor dengan parameter
     Mobil(String brand, String warna){
         this.brand = brand;
         this.warna = warna;
         
         System.out.println("Brand mobil adalah " +brand);
         System.out.println(warna);
       
        
    }
    
    
    
    
}


public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        
        //instansiasi
        Mobil mobil1 = new Mobil("Yamaha", "Hitam");
        Mobil mobil2 = new Mobil("Mitsubishi", "Hitam");
       
         
        
        
      
//        //ob1
//        Mobil mobil1 = new Mobil(); 
//        mobil1.roda= 4;
//        mobil1.pintu = 5;
//        mobil1.brand = "Yamaha";
//        mobil1.warna = "Merah";
//        
//         System.out.println("Jumlah roda mobil1 adalah "+mobil1.roda);
//         System.out.println("Jumlah pintu mobil1 adalah "+mobil1.pintu);
//         System.out.println("brand mobil1 adalah "+mobil1.brand);
//         System.out.println("warna mobil1 adalah "+mobil1.warna);
//         
//         
//         //ob2
//         Mobil mobil2 = new Mobil();
//         mobil2.roda = 8;
//         mobil2.pintu =2;
//         mobil2.brand = "Hino";
//         mobil2.warna = "Hijau";
//         
//          System.out.println("\nJumlah roda mobil2 adalah "+mobil2.roda);
//         System.out.println("Jumlah pintu mobil2 adalah "+mobil2.pintu);
//         System.out.println("brand mobil2 adalah "+mobil2.brand);
//         System.out.println("warna mobil2 adalah "+mobil2.warna);
//         
//        
        
    }
    
    
    
}
