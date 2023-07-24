package tests.US001;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.Page;
import utilities.ConfigReader;
import utilities.Driver;

public class TC01_AramaKutusuTesti {
    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        Page page = new Page();
        page.aramaKutusu.sendKeys("iphone", Keys.ENTER);
        Driver.closeDriver();
        //Amazon sayfasina gidilip arama kutusu test edildi
        //Mehmet Bey yeni kodlar ekledi

    }
}
/*Yoksa once .gitignore olustur bossa icine
/.idea
/target
configuration.properties
yaz
 */

//git log versionlari gormek icin
//git log --oneline versiyonlari ayni satirda gormek icin
//bir kez add yaptiysak git commit-am"version ismi" ile direk commitleyebiliriz
//versiyonladiktan sonra bekletmenin bir anlami yok isimiz bitince push edelim

/*dosyalari alirken  url copy edince masaustunde bir klasor ac, cmd'den
git init
url yapistir
git pull  yapinca src altindaki dosyalari almis oluruz

clon yaparken url copy edince masaustunde bir klasor ac, cmd'den
git clone url yapistir enterla o zaman proje komple gelir
 */

/*
Branch olusturma
git branch isim
git log --oneline dersek branch hangisindeyse o onde olur
git checkout isim dersek ismi verilen branch e gecer

 */


