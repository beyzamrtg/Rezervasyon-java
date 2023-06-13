import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App{
    public static String EngelDurumu;
    public static int BiletAdeti;
    public static int alinanbiletler;

    public static void main(String[] args) {
        Film film1 = new Film();
        film1.FilmAdi = "Şimşek Hırsızı";
        film1.FilmTuru= "Fantastik";

        LocalDate VizyonTarihi1 = LocalDate.of(2010, 3, 4);
        System.out.println("1) " + VizyonTarihi1.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));

        Film film2 = new Film();
        film2.FilmAdi = "Oyuncaklar";
        film2.FilmTuru= "animasyon";
        LocalDate VizyonTarihi2 = LocalDate.of(2012, 5, 6);
        System.out.println("2) " + VizyonTarihi2.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));

        System.out.println("Filmler");
        System.out.println("1. " + film1.FilmAdi);
        System.out.println("2. " + film2.FilmAdi);
        System.out.println("Hangi filme bilet almak istiyorsunuz");

        Scanner scanner = new Scanner(System.in);
        int secilen_film = (scanner.nextInt());

        

        switch (secilen_film) {
            case 1:
                System.out.println("Seçtiğiniz film " + film1.FilmAdi);
                break;
            case 2:
                System.out.println("Seçtiğiniz film " + film2.FilmAdi);
                break;
            default:
                System.out.println("Film Bulunamamaktadır.");
                break;
        }
    

        Seans seans1 = new Seans();
        seans1.salonNo = 2;
        seans1.suresi = 120;

        Seans seans2 = new Seans();
        seans2.salonNo = 3;
        seans2.suresi = 240;

        switch (secilen_film) {
            case 1:
                System.out.println("Salon No: " + seans1.salonNo);
                break;
            case 2:
                System.out.println("Salon No: " + seans2.salonNo);
                break;
            default:
                System.out.println("Böyle bir seans bulunmamaktadır.");
                break;
        }

        Salon salon1 = new Salon();
        salon1.SalonAdi = 2;
        salon1.SalonKapasitesi = 150;

        Salon salon2 = new Salon();
        salon2.SalonAdi = 3;
        salon2.SalonKapasitesi = 200;
    

       

        switch (secilen_film) {
            case 1:
                System.out.println("Salon Kapasitesi: " + salon1.SalonKapasitesi);
                break;
            case 2:
                System.out.println("Salon Kapasitesi: " + salon2.SalonKapasitesi);
                break;
            default:
                System.out.println("Salon bulunamamaktadır.");
                break;
}


Rezervasyon rezervasyon1 = new Rezervasyon();
Rezervasyon rezervasyon2 = new Rezervasyon();

switch (secilen_film) {
    case 1:
        System.out.println("Adınız ve Soyadınızı giriniz:");
        rezervasyon1.MusteriAdSoyad = scanner.nextLine();

        System.out.println("Cinsiyet giriniz:");
        rezervasyon1.Cinsiyet = scanner.nextLine();

        System.out.println("Kaç bilet almak istiyorsunuz?");
        rezervasyon1.BiletAdeti = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i < rezervasyon1.BiletAdeti + 1; i++) {
            System.out.println("almak istediğiniz koltuk numrasını yazınız");
            System.out.println("koltuk" + i);
            alinanbiletler = Integer.parseInt(scanner.nextLine());
        }
        break;
    case 2:
        System.out.print("Adınız ve Soyadınızı giriniz:");
        rezervasyon2.MusteriAdSoyad = scanner.nextLine();

        System.out.print("Cinsiyet giriniz:");
        rezervasyon2.Cinsiyet = scanner.nextLine();

        System.out.println("Kaç bilet almak istiyorsunuz?");
        rezervasyon2.BiletAdeti = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i < rezervasyon2.BiletAdeti + 1; i++) {
            System.out.println("almak istediğiniz koltuk numrasını yazınız");
            System.out.println("koltuk" + i);
            alinanbiletler = Integer.parseInt(scanner.nextLine());
        }
        break;
    default:
        System.out.println("rezervasyon bulunamamaktadır.");
        break;
}

boolean ok_engel = true;
while (ok_engel) {
    System.out.println("Herhangi bir Engeliniz Var Mı?, 'Evet' ya da 'Hayir '");
    EngelDurumu = scanner.nextLine();
    if (EngelDurumu.equals("Evet")) {
        System.out.println("Size Uygun Yer Ayarlandı");
        ok_engel = false;
    } else if (EngelDurumu.equals("Hayir")) {
        System.out.println("Engel Durumu Yok");
        ok_engel = false;
    } else {
        System.out.println("Yanlış Yazdınız");
        ok_engel = true;
    }
}

switch (secilen_film) {
    case 1:
        System.out.println("Bilet Adeti:" + rezervasyon1.BiletAdeti);
        System.out.println("Koltuk No:" + alinanbiletler);
        System.out.println("Müşteri Ad Soyad:" + rezervasyon1.MusteriAdSoyad);
        System.out.println("Cinsiyet:" + rezervasyon1.Cinsiyet);
        break;
    case 2:
        System.out.println("Bilet Adeti:" + rezervasyon2.BiletAdeti);
        System.out.println("Koltuk No:" + alinanbiletler);
        System.out.println("Müşteri Ad Soyad:" + rezervasyon2.MusteriAdSoyad);
        System.out.println("Cinsiyet:" + rezervasyon2.Cinsiyet);
        break;
    default:
        System.out.println("Rezervasyon Bulunmamaktadır.");
        break;
     
}




























    }
}
 