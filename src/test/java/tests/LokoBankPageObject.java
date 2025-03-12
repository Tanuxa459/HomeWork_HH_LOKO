package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.List;

import pages.MainPage;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.logevents.SelenideLogger.step;

@Tag("Loko")
public class LokoBankPageObject extends TestBase {


//    @Test
//    void checkFormForCredit() {
//        MainPage mainPage = new MainPage();
//        mainPage.openPage()
//                .switchToFormIframe()
//                .setFullNameInput("Пупсиков Иван Петрович")
//                .setPhoneInput("+7(495) 515-11-11")
//                .setBirthDayInput("02.02.1987");
//
//        step("Проверка пунктов меню на английском меню", () -> {
//
//        });
//    }


}
