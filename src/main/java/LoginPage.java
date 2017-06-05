import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by Вова on 05.06.2017.
 */
public class LoginPage {
    private SelenideElement username = $("#username"),
            password = $("#password"),
            submitButton = $(By.xpath("//button[contains (@class, 'btn-link-sign')]"));

    public SelenideElement getUsername(){
        return username;
    }
    public SelenideElement getPassword(){
        return password;
    }
    public SelenideElement getSubmitButton(){
        return submitButton;
    }

    public DashboardPage login(String name, String pwd){
        getUsername().sendKeys(name);
        getPassword().sendKeys(pwd);
        getSubmitButton().click();
        return new DashboardPage();
    }

}
