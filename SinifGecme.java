import java.util.Scanner;
public class SinifGecme {
    public static void main(String[] args) {

        //Değişkenlerin tanımlanması.

        int mat, fizik, turkce, kimya, muzik;
        double ortalama;

        //Notların girilmesi.

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();

        //Ortalamanın hesaplanması.

        if ((mat >= 0 && mat <= 100) && (turkce >= 0 && turkce <= 100) &&
                (fizik >= 0 && fizik <= 100) && (muzik >= 0 && muzik <= 100)) {

            ortalama = (mat + fizik + turkce + kimya + muzik) / 5;
            System.out.println("Ortalama: " + ortalama);

            //Ortalamanın karşılaştırılması ve sonucun yazılması.

            if (ortalama <= 55) {
                System.out.println("Sınıfta kaldınız. Tekrar görüşmek üzere!");
            } else {
                System.out.println("Tebrikler.Sınıfınızı geçtiniz.");
            }
        }
             else {
                System.out.println("Notlarınızın aralığı 0 ile 100  olmalıdır.");
            }
        }
    }



