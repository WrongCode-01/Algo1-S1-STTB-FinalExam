
package Elektronik;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Toko_Elektronik {

    public static void main(String[] args) {
    Scanner in =new Scanner (System.in);
       int pilihan,input,kembalian,uang,total=0;
       String Ulang1,Ulang2,Nama,Alamat,NoHP;
       String[] listbarang=
       {"Broco OB Engkel ",
       "Broco OB Seri",
       "Broco OB Stop",
       "Broco Engkel Stop",
       "Broco Triple",
       "Broco Engkel Galeo",
       "Broco Seri Galeo",
       "Philips 2L Rice Cooker",
       "Broco Saklar",
       "Niko NK333S Setrika",
       "Kipas Angin Cosmos",
       "Polytron Cinemax LED TV 32Inch",
       "Kulkas Sharp SJ LG7",
       "Jam Dinding Selma",
       "Antenna Galeo",
       "MCB Broco 25, 32A",
       "Senter LED"
       },
       barang={};
       Integer[] hargabarang={14000,
           18000,
           16000,
           22000,
           24000,
           18000,
           20000,
           500000,
           20000,
           80000,
           220000,
           2500000,
           2500000,
           100000,
           45000,
           40000,
           150000
       },
                subtotal={}; 
                
    do{
        do{
    System.out.println ("================================");
    System.out.println ("|       SELAMAT DATANG         |");
    System.out.println ("|             DI               |");
    System.out.println ("|  TOKO PUSPA AYU ELECTRONIC   |");
    System.out.println ("|   Alamat : jl. Siliwangi     |");
    System.out.println ("|   Desa Ciwidey, Kec.Ciwidey  |");
    System.out.println ("");
            System.out.println("====List Barang====");
                                for (int i = 0; i < listbarang.length; i++) {
                                System.out.println(i+1+"." +listbarang[i]+" = "+hargabarang[i]);
                                }
                                System.out.println("==============================================");
                                System.out.print("Silahkan Masukan Angka Barang Yang Diinginkan : ");
                                input=in.nextInt()-1;
                                barang = addString(barang,listbarang[input]);
                                subtotal = addInteger(subtotal,hargabarang[input]); 
                                System.out.print("Membeli barang lagi ? : ");
                      
            Ulang1=in.next();        
        }while(Ulang1.equalsIgnoreCase("Y"));
        
        System.out.println("");
        System.out.println("====Keranjang Belanja====");      
                   System.out.println("Barang Anda Adalah : ");
                   for (int i = 0; i < barang.length; i++) {
                   System.out.println(i+1+"." +barang[i]+" = "+subtotal[i]);
                   }
                   for (int i = 0; i < barang.length; i++) {
                   total+=subtotal[i];
                   }
                   System.out.println("=======================");
                   System.out.println("Total Harga : " + total);
                   
                   System.out.println("Ingin Mencetak data struk ?");
                   System.out.println("1. Iya");
                   System.out.println("2. Tidak");
                   System.out.print("Pilih Menu : ");
                   pilihan=in.nextInt();
                   switch(pilihan){
                    case 1 : System.out.println("====Data Anda====");
                        System.out.print("|Nama : ");
                        Nama=in.next();
                        System.out.print("|Alamat : ");
                        Alamat=in.next();
                        System.out.print("|NoHP : ");
                        NoHP=in.next();   
                        System.out.print("|Uang Anda : ");
                        uang=in.nextInt();
                        kembalian = uang-total;
                        System.out.println("|Kembalian : "+kembalian);  
                        System.out.println("");
                        System.out.println ("|   Terima Kasih Telah Berbelanja Di Toko Kami     |");
                        System.out.println ("|            TOKO PUSPA AYU ELECTRONIC             |");
                        System.out.println ("| Alamat : jl. Siliwangi, Desa Ciwidey, Kec.Ciwidey|");
                        System.out.println("");
                        System.out.println("Nama : "+Nama);
                        System.out.println("Alamat : "+Alamat);
                        System.out.println("NoHp : "+NoHP);
                        System.out.println("Uang Anda : "+uang);
                        System.out.println("Kembalian : "+kembalian);
                        break;
                    default : System.out.println("=============");
                              System.out.print("Uang Anda : ");
                              uang=in.nextInt();
                              kembalian = uang-total;
                              System.out.println("Kembalian : "+kembalian);
                              System.out.println("");
                              System.out.println("===================================================");
                              System.out.println ("|   Terima Kasih Telah Berbelanja Di Toko Kami     |");
                              System.out.println ("|  TOKO PUSPA AYU ELECTRONIC                       |");
                              System.out.println ("| Alamat : jl. Siliwangi, Desa Ciwidey, Kec.Ciwidey|");
                              break;
                   }
                   System.out.println("=========================");
                   System.out.print("Mulai Ulang Program ? : ");
            Ulang2=in.next();        
        }while(Ulang2.equalsIgnoreCase("Y"));
}
    
        public static String[] addString(String data[], String barang) {
            List<String> arrList = new ArrayList<>(Arrays.asList(data));
            arrList.add(barang);
        data = arrList.toArray(data);
        return data;
    }
        public static Integer[] addInteger(Integer data[], Integer subtotal) {
            List<Integer> arrList = new ArrayList<>(Arrays.asList(data));
            arrList.add(subtotal); 
        data = arrList.toArray(data);
        return data;
        }
}