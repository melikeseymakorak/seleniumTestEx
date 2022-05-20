import org.testng.Assert;
import org.testng.annotations.Test;

public class TestGenderSelection extends BaseTest{

    @Test(priority = 0)
    public void checkMaleButton(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.genderSection().clickButton(GenderSection.Genders.MALE);
        Assert.assertTrue(practiceFormPage.genderSection().isButtonChecked(GenderSection.Genders.MALE),
                "Male Button is not checked!");
    }

    @Test(priority = 1)
    public void checkFemaleButton(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.genderSection().clickButton(GenderSection.Genders.FEMALE);
        Assert.assertTrue(practiceFormPage.genderSection().isButtonChecked(GenderSection.Genders.FEMALE),
                "Female Button is not checked!");
    }

    @Test(priority = 2)
    public void checkOtherButton(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.genderSection().clickButton(GenderSection.Genders.OTHER);
        Assert.assertTrue(practiceFormPage.genderSection().isButtonChecked(GenderSection.Genders.OTHER),
                "Other Button is not checked!");
    }


}
