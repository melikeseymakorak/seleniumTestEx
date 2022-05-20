import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GenderSection extends BasePage {


    //driverı superdan cagırınca buna gerek kalmadı
    //private WebDriver driver;

    //Butonun Text Kısmı
    private final By maleLabelLocator = new By.ByCssSelector("label[for='gender-radio-1']");
    private final By femaleLabelLocator = new By.ByCssSelector("label[for='gender-radio-2']");
    private final By otherLabelLocator = new By.ByCssSelector("label[for='gender-radio-3']");


    //Butonun Yuvarlak Kısmı
    private final By maleButtonLocator = By.id("gender-radio-1");
    private final By femaleButtonLocator = By.id("gender-radio-2");
    private final By otherButtonLocator = By.id("gender-radio-3");


    public enum Genders {MALE, FEMALE, OTHER}

    public GenderSection(WebDriver driver) {
       super(driver);
    }

    public void clickButton(Genders gender){
        switch (gender){
            case FEMALE:
                click(femaleLabelLocator);
                break;
            case MALE:
                click(maleLabelLocator);
                break;
            case OTHER:
                click(otherLabelLocator);
                break;
        }

    }

    public boolean isButtonChecked(Genders gender){
        boolean isChecked = false;
        switch (gender){
            case FEMALE:
                isChecked=isSelected(femaleButtonLocator);
                break;
            case MALE:
                isChecked=isSelected(maleButtonLocator);
                break;
            case OTHER:
                isChecked=isSelected(otherButtonLocator);
                break;
        }
        return isChecked;


    }
}
