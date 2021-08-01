import com.codeborne.selenide.*;
import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class FirstSelenideTest {

    @Test
    public void firstSelenideTest(){
        Configuration.baseUrl = "https://www.google.com";

//        Configuration.browser = "firefox";
//        Configuration.timeout = 8000;
        open("/search?q=alert+selenide");
        $(By.name("fodshofuhweofh")).setValue("Selenide").submit();
        sleep(2000);

        $$("").filter(Condition.name(""))
                .shouldHave(CollectionCondition.sizeGreaterThan(6), Duration.ofSeconds(8));
        $(By.name(""))
                .shouldNot(Condition.visible)
                .shouldNot(Condition.text("homework"))
                .setValue("1 august")
                .click(ClickOptions.usingJavaScript());


       long time = System.currentTimeMillis();
       long end = 12;
       long start = 3;

       long x = time % (end - start);
       long randomInt = x + start;

       System.out.println("Random int " + randomInt);

        $(By.name("")).findAll("//*").get(0);

        $(".demoqa").dragAndDropTo("droppable");

        Selenide.switchTo().alert().dismiss();
        Selenide.switchTo().alert().accept();

        $("").click();
    }
}
