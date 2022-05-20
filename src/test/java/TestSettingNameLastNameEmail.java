import org.testng.Assert;
import org.testng.annotations.Test;


public class TestSettingNameLastNameEmail extends BaseTest {

    @Test(priority = 0)
    public void setName(){
        //Her testi kendi driverı ile çalıştırmak için ayırdık
        //Test başladığında kendi browserını açacak ve çalıştıracak
        //Böylelikle tüm testler birbirinden ayrı olarak çalışacak.
        //Birbirini etkilemeyecek.
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.setName("Melike Şeyma");
        Assert.assertEquals(practiceFormPage.getName(), "Melike Şeyma", "Name value is not correct!");
    }

    @Test(priority = 1)
    public void setLastName(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.setLastName("Korak");
        Assert.assertEquals(practiceFormPage.getLastName(), "Korak", "Surname is not correct!");
    }


    @Test(priority = 2)
    public void setEmail(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.setEmail("melikeseymakorak@gmail.com");
        Assert.assertEquals(practiceFormPage.getEmail(), "melikeseymakorak@gmail.com", "E-Mail is not correct!");
    }
}

