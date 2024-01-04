package pizzamachine;

import java.util.Scanner;

public class PizzaMachine {


    static Scanner input =new Scanner(System.in);
    static int secenek;
    static int  kucukBoy=25;
    static int  ortaBoy =30;
    static int  buyukBoy =35;
    static int boyutFiyat;
    static String pizzaBoyut;

    public static void boyutSec(){
        System.out.println("Lutfen pizzanizin boyutunu seciniz." +
                "\nKucuk boy icin  =  25 tl  ==>  1" +
                "\nOrta boy icin   =  30 tl  ==>  2" +
                "\nBuyuk boy icin  =  35 tl  ==>  3" +
                "\ngiriniz");

        secenek = input.nextInt();
        switch (secenek){
            case 1:
                boyutFiyat=kucukBoy;
                pizzaBoyut="Kucuk Boy";
                break;
            case 2:
                boyutFiyat=ortaBoy;
                pizzaBoyut="Orta Boy";
                break;
            case 3:
                boyutFiyat=buyukBoy;
                pizzaBoyut="Buyuk Boy";
                break;
            default:
                System.out.println("Hatali giris yaptiniz Tekrar deneyiniz.");
                boyutSec();
        }
        System.out.println("Seciminiz"+pizzaBoyut+boyutFiyat);
    }

    static int inceHamurFiyat = 5;
    static int ortaHamurFiyat = 7;
    static int hamurTipiFiyat;
    static String hamurTipi;
    public static void hamurTipiSec(){
        System.out.println("Lutfen pizzanizin hamur tipini seciniz." +
                "\nInce hamur icin              = 5 tl         ==>   1" +
                "\nOrta kalinlikta hamur icin   = 7 tl         ==>   2" +
                "\ngiriniz");
        secenek=input.nextInt();

        if (secenek==1){
            hamurTipi="Ince Hamur";
            hamurTipiFiyat =inceHamurFiyat;
        }else if (secenek==2){
            hamurTipi="Orta Hamur";
            hamurTipiFiyat =ortaHamurFiyat;
        }else {
            System.out.println("Hatali giris yaptiniz Tekrar deneyiniz.");
            hamurTipiSec();
        }
        System.out.println("Seceminiz ==> "+hamurTipi+"= "+hamurTipiFiyat);
    }

    static int ekstrasucuk = 8;
    static int ekstraKasar = 5;
    static int mantar = 6;
    static int sayac;
    static int toplamMalzemeFiyati;

    public static void malzemeEkle(){
        System.out.println("Malzeme Listesi" +
                "\nEkstra Sucuk    = 8 tl               ==> 1" +
                "\nEkstra Kasar    = 5 tl               ==> 2" +
                "\nMantar          = 6 tl               ==> 3" +
                "\nSiparisi tamamlamak icin             ==> 4" +
                "\ngiriniz");

        do {
            System.out.println("Seciminizi yapiniz");
            secenek= input.nextInt();
            switch (secenek){
                case 1:
                    toplamMalzemeFiyati+=ekstrasucuk;
                    sayac++;
                    break;
                case 2:
                    toplamMalzemeFiyati+=ekstraKasar;
                    sayac++;
                    break;
                case 3:
                    toplamMalzemeFiyati+=mantar;
                    sayac++;
                    break;
                case 4:
                    sayac=3;
                    break;
                default:
                    System.out.println("Hatali giris yaptiniz Tekrar deneyiniz.");

            }

        }while(sayac<3);
        System.out.println("Eklenen Malzeme toplam Fiyati ==>"+toplamMalzemeFiyati);
    }

    public static void odemeYap(){
        System.out.println("Toplam Odenecek Tutar = "+(boyutFiyat+hamurTipiFiyat+toplamMalzemeFiyati));
        System.out.println("Onayliyorsaniz ==>1\n" +
                "Cikis icin ==> 0 \ngiriniz");
        secenek=input.nextInt();
        switch (secenek){
            case 1:
                System.out.println("Odeme isleminiz Gerceklesmistir.Pizzaniz Hazirdir.Afiyet olsun.");
                cikis();
                break;
            case 0:
                cikis();
                break;
            default:
                System.out.println("Hatali giris yaptiniz Tekrar deneyiniz.");
                break;
        }

    }

    public static void cikis(){
        System.out.println("Bizi Tercih Ettiniginiz icin Tesekkur ederiz.Yine Bekleriz.");

    }




}