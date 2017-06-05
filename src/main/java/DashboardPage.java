import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DashboardPage {
    private SelenideElement diagram = $(".rz-sellerorder-diagram-block");
    private ElementsCollection viewall = $$(".novisited").filterBy(text("Посмотреть все"));

    public SelenideElement getDiagram(){
        return diagram;
    }
    public SelenideElement getViewAll(){
        return viewall.get(0);
    }

    public OrdersPage viewAllClick(){
        getViewAll().click();
        return new  OrdersPage();
    }
}
