# Rezervasyon-java
Proje
Sinema Rezervasyon Programı Bu program, müşterilerin sinema seanslarında film rezervasyonu yapmasına imkan tanır. App, Musteri, Rezervasyon, Film,salon ve Seans sınıflarından oluşur.Kullanım Programı kullanmak için, proje klasöründe yer alan App.java dosyasını açın ve uygulamayı başlatın. Ardından, müşterinin adı soyadı, cinsiyeti, engel durumu, seans, film adı ve bilet adeti gibi bilgileri girmesini sağlayan bir arayüz görüntülenir. Müşteri bilgileri girildikten sonra, rezervasyon bilgileri ekrana yazdırılır.
ınıflar musteri Bu sınıf, müşteriye ait bilgileri içerir. MusteriAdSoyad, Cinsiyet ve EngelDurumu gibi özellikleri gösterir.

rezervasyon Bu sınıf, müşterinin yaptığı rezervasyonu temsil eder. Musteri sınıfından miras alır ve MusteriAdsoyad, BiletAdeti, KoltukNo, Seans gibi özellikleri gösterir .rezervasyon sınıfı musteri sınıfının özelliklerini almıştır.

Film Bu sınıf, sinema filmleri hakkında bilgi tutar. FilmAdi, FilmTürü ve VizyonTarihi gibi özellikleri gösterir.

Seans Bu sınıf, sinema seanslarını temsil eder. Seans suresi, salonNo, film gibi özellikleri gösterir.

Salon Bu sınıf,sinema salon numaralarını temsil eder. salon adi ve salon kapasitesi gibi özellikleri gösterir.
müşteri sınıfı , müşteri ad soyad ve engel durumu gibi özellikleri gösterir,


Özellikler
Mevcut filmleri ve vizyon tarihlerini görüntüleme,
Film seçimi yapma,
Seansları görüntüleme,
Salon bilgilerini görüntüleme,
Bilet rezervasyonu yapma,
Engel durumunu belirleme,
Rezervasyon bilgilerini görüntüleme.


Kullanım
Program çalıştırıldığında mevcut filmler ve vizyon tarihleri görüntülenir.
Kullanıcı film seçimini yapar ve seçtiği filmin adı ekrana yazdırılır.
Seçilen film için mevcut seanslar görüntülenir ve kullanıcı bir seans seçer. Seçilen seansın salon numarası ekrana yazdırılır.
Seçilen film ve seans için uygun salonun kapasitesi ekrana yazdırılır.
Kullanıcı bilet rezervasyonu yapmak istediği bilgileri girmesi istenir, örneğin ad soyad, cinsiyet ve bilet adedi.
Kullanıcı her bir bilet için koltuk numarasını girer ve alınan biletler listelenir.
Kullanıcıdan engel durumu bilgisi alınır, "Evet" veya "Hayır" şeklinde cevap vermesi beklenir.
Kullanıcının engel durumuna göre uygun yer ayrılır veya engel durumu yoksa mesaj verilir.
Rezervasyon bilgileri ekrana yazdırılır, örneğin bilet adedi, koltuk numaraları, müşteri ad soyadı ve cinsiyet.
