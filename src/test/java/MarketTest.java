import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.disappear;
import static com.codeborne.selenide.Condition.hidden;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by Вова on 05.06.2017.
 */
public class MarketTest {
    @BeforeTest
    public void set() {
        Configuration.browser = "chrome";
        Configuration.timeout = 5000;
        open("http://market.test2.local");
    }
    @Test
    public void test() {
        LoginPage loginPage = new LoginPage();
        DashboardPage dashboardPage = new DashboardPage();
        OrdersPage ordersPage = new OrdersPage();

        loginPage.getUsername().shouldBe(visible);
        loginPage.getPassword().shouldNot(disappear);
        loginPage.login("Notus", "123qweqwe");

        dashboardPage.getDiagram().shouldBe(hidden);
        dashboardPage.viewAllClick();

        ordersPage.getH2().shouldBe(visible);
    }
}
