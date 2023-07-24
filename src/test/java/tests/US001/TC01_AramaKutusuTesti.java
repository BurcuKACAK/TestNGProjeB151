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

