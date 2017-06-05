import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class OrdersPage {
    private SelenideElement h2 = $(byText("В обработке"));

    public SelenideElement getH2(){
        return h2;
    }
}
