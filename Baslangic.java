package Giris;
import java.util.Scanner;
public class Baslangic {
    public static void main(String[] args) {
        /*  Soru-4 kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran
        programı yazın.
        Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak
        KDV tutarı hesaplayan programı yazınız
        */
        double tutar,kdvOran1 = 0.18, kdvOran2 = 0.08, kdvliTutar, kdvTutar, oran;

        Scanner inp = new Scanner(System.in);
        System.out.println("Tutari giriniz : ");
        tutar = inp.nextDouble();

        kdvTutar = tutar > 1000 ? tutar * kdvOran2 : tutar * kdvOran1;
        kdvliTutar = tutar + kdvTutar;
        oran = tutar< 1000 ? kdvOran2 : kdvOran1;

        System.out.println("KDV'siz Tutari : "+tutar);
        System.out.println("KDV orani : "+oran);
        System.out.println("KDV Tutari : "+kdvTutar);
        System.out.println("KDV'li Tutari : "+kdvliTutar);
    }
}
