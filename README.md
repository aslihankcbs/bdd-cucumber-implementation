# Cucumber ile Behaviour Driven Development(BDD)

**Cucumber?**

BDD anlayışını benimseyen açık kaynak kodlu bir araçtır. Cucumber'da testler Gherkin diliyle yazılmaktadır. Bu dil okunduğunda herkes tarafından kolaylıkla anlaşılabilir. Düz metinlere benzemektedir.

Cucumber kullanımı Features ve Glue Code olarak isimlendirilen iki kısımdan oluşmaktadır.
* Feature kısmında bir davranış tanımlanır(Hesaptan para transferinin yapılması, ana sayfanın görüntülenmesi, oturumun açılması vb.). 
* Scenario kısmında feature da yer alan ister için uygun olan senaryo oluşturuluyor(örneğin hesaptan EFT yapılması)(user story). 
* Given'da bazı bağlamlar belirtilir.Ön koşulda diyebiliriz. (Hesaplarımın listelendiği sayfadayım veya uygulamaya sahibim/uygulama elimde)
* When bazı eylemler gerçekleştirileceğinde kullanılır. Yani bir olay belirtiyoruz.(Bir hesabın seçilmesi, ana sayfaya gidilmesi vs.)
* Than kısmında ise olayın sonuçlanması belirtilir. Yani belirli bir gözlemlenebilir sonuç kümesi elde edilir.(Paramı transfer etmek istiyorum butonunu görmeliyiz veya ana sayfaya gidildiğinde welcome başlığını vs. görmeliyiz.)

**BDD vs TDD**

* TDD(Test Driven Development) kod öncesinde Unit Test yazarak yaptğımız geliştirme biçimi. TDD diğer classlara bağımlılığı az olan classlar yaratmayı sağlar. Classların sorumluluklarını ayırır. TDD ile kodun fonksiyon, sınıf, modül vs bazında çalışıp çalışmadığı kontrol edilmiş olur.

* BDD ise kullanıcı hikayelerinden çıkan behaviour'lar üzerinde acceptance test oluşturarak yazılım tasarlanmaya çalışılır. BDD yazılımın genel olarak davranışını test etmeye çalışır. TDD gibi önce test kodları yazılsın, sonrasında proje kodları yazılsın anlayışına sahiptir. Amacı yazılım kalitesini arttırmak, test maliyetlerini azaltmaktır. BDD ile aynı zamanda müşteri, alan uzmanları, test, geliştirici gibi yazılımda farklı süreçlerde rol oynayan insanların daha kolay iletişim kurması ve daha az sorunla daha kaliteli iş geliştirebilmek biraz daha mümkün hala gelmiş olur. 

* Yazılım geliştirmede  davranış odaklı bu yazılım sürecinin en genel hali (planlama ve tasarım ardından):

   * Test edilecek kodun olası davranış şekilleri Gherkin diliyle kodlanır. 
   * Testi gerçekleştirecek adım tanımlamaları yapılır. (Step Definition)
   * Sprint içerisindeki kodlama gerçekleştirilir. 
   * Kodlanan test çalıştırılır.
   * Testin fail veya pass durumuna göre kodda review yapılır.
   * Test tekrar çalıştırılır.

    Bu sayede Continuous Testing (Sürekli Test) sağlanmış olur.

*Konuyu araştırırken yararlanmış olduğum kaynaklardan tuttuğum notlarımdan bazı noktaları açıklayıcı olması için paylaştım. En fazla yararlandığım kaynakları aşağıya link olarak bırakıyorum.*

https://www.mobilhanem.com/cucumber-ile-behaviour-driven-development/

https://medium.com/@odayibasi/tdd-test-driven-development-vs-bdd-behavior-driven-development-30e225c29c14        
