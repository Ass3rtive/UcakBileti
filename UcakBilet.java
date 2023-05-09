import java.util.Scanner;
public class UcakBilet {
    public static void main(String[] args) {

        int mesafe, yas, tip;
        double yas12Indirimi, yas24Indirimi, yas65Indirimi, normalTutar, gidisdonusIndirimi;
        Scanner input = new Scanner(System.in);

        System.out.print("Km Cinsinden Mesafe Giriniz : ");
        mesafe = input.nextInt();
        System.out.print("Yaşınızı Girin : ");
        yas = input.nextInt();
        System.out.print("Yolculuk Tipini Giriniz : ");
        tip = input.nextInt();

        if (mesafe>0)
            switch (tip){
            case 1: 
            if (yas >24 && yas<65){
            normalTutar = mesafe*0.10;
            System.out.print("Toplam Tutar : " + normalTutar);
            }else if (yas<12){
                normalTutar = mesafe*0.10;
                yas12Indirimi = normalTutar - (normalTutar*0.50);
            System.out.print("Toplam Tutar : " +yas12Indirimi);
            }else if (yas > 12 && yas < 24){
                normalTutar = mesafe*0.10;
                yas24Indirimi = normalTutar - (normalTutar*0.10);
            System.out.print("Toplam Tutar : "+yas24Indirimi);
            }else if (yas > 65){
                normalTutar = mesafe*0.10;
                yas65Indirimi = normalTutar - (normalTutar*0.30);
            System.out.print("Toplam Tutar : "+ yas65Indirimi);
            }break;
            case 2:
            if (yas >24 && yas<65){
            normalTutar = mesafe*0.10;
            gidisdonusIndirimi = normalTutar - (normalTutar*0.20);
            System.out.print("Toplam Tutar : " + gidisdonusIndirimi*2);
            }else if (yas<12){
                normalTutar = mesafe*0.10;
                yas12Indirimi = normalTutar - (normalTutar*0.70);
            System.out.print("Toplam Tutar : " +yas12Indirimi*2);
            }else if (yas > 12 && yas < 24){
                normalTutar = mesafe*0.10;
                yas24Indirimi = normalTutar - (normalTutar*0.30);
                System.out.print("Toplam Tutar : "+yas24Indirimi*2);
            }else if (yas > 65){
                normalTutar = mesafe*0.10;
                yas65Indirimi = normalTutar - (normalTutar*0.50);
                System.out.print("Toplam Tutar : "+ yas65Indirimi*2);
            }break;
                default:
                    System.out.print("Hatalı Giriş Yaptınız Lütfen 1 veya 2 Tuşlayınız ");

        }

    }

}
