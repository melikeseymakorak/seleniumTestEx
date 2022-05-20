import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeFormPage extends BasePage{

    private final By nameLocator = By.id("firstName");
    private final By lastNameLocator = By.id("lastName");
    private final By emailLocator = By.id("userEmail");


    //Genderları gruplayarak bir obje haline getiriyoruz.
    private GenderSection genderSection;

    //BasePage'teki fonksiyonları paylaşmak için yazdık.
    //BasePage'den gelen super ile geldi.
    public PracticeFormPage (WebDriver driver){
        super(driver);
        //urli beforesuits olarak değil, constructor kurulurken
        //çalıştırmak daha mantıklıdır.
        driver.get(baseURL.concat("automation-practice-form"));
        genderSection = new GenderSection(driver);
    }

    //PracticeFormPageden GenderSection metotlarına ulaşmak
    //için kullanırız. Oluşturduğumuz instancea ulaşmaya çalışıyoruz.
    public GenderSection genderSection(){
        return this.genderSection;

    }

    public void setName(String name){
        type(nameLocator, name);
    }

    public void setLastName(String lastName){
        type(lastNameLocator,lastName);


    }

    public void setEmail(String mail){
        type(emailLocator,mail);
    }


    //Attributelerinde text olmayan elementlerin textlerini
    //çekerek assert etme yöntemi (value olmak zorunda)
    public String getName(){
        return find(nameLocator).getAttribute("value");
    }

    public String getLastName(){
        return find(lastNameLocator).getAttribute("value");
    }

    public String getEmail(){
        return find(emailLocator).getAttribute("value");
    }

}


