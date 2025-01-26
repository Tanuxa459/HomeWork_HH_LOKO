package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;

import java.io.File;
import java.util.List;
import java.util.stream.Stream;

import com.codeborne.pdftest.PDF;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.files.DownloadActions.click;
import static com.codeborne.selenide.logevents.SelenideLogger.step;


public class LokoBank extends TestBase {


    @BeforeEach
    void listebner(){
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();

    }

    static Stream<Arguments> checkAtributeOfMenuOnSuchLanguage() {
        return Stream.of(
                Arguments.of(List.of("Частным лицам", "Бизнесу", "Корпорациям", "Private-Banking","О банке",
                        "Для частных лиц","Для юридических лиц")));
    }
    @MethodSource
    @Tag("Loko")
    @ParameterizedTest(name = "Проверка наличия кнопок {0}")
    void checkAtributeOfMenuOnSuchLanguage(List<String> expectedButtons) {
        step("Open source", () -> {
        open("https://www.lockobank.ru");
        });
        step("Check menu", () -> {
        $("#header").$$("p").shouldHave(texts(expectedButtons));
        });
    }

    @Tag("Loko")
    @DisplayName("Проверка просмотра файла инструкции")
    @Test
    void pdfFileParsingTest() throws Exception {

            open("/apps");

            File downloaded = $("[href='https://www.lockobank.ru/cms/prod/Android_Ru_Store_Instrukcziya_dlya_klientov_po_ustanovke_mobilnogo_prilozheniya_0a508e9be2.pdf']").download();
            PDF pdf = new PDF(downloaded);
            Assertions.assertEquals(3, pdf.numberOfPages);
    }
    @DisplayName("Проверка таблицы Тарифы страхования")
    @Tag("Loko")
    @Test
    void checkTableOfTariff() throws Exception {

        step("Open source", () -> {
            open("/personal/strakhovanie/strakhovanie-imushchestva/");
        });
        step("Check table of tariff", () -> {
        $(byTagAndText("th", "Конструктивные элементы")).sibling(0).shouldHave(text("250 000"));
        $(byTagAndText("th", "Инженерные сети и оборудования, внутренняя отделка (всего)")).sibling(0).shouldHave(text("50 000"));
        $(byTagAndText("th", "Инженерные сети")).sibling(0).shouldHave(text("37%"));
        $(byTagAndText("th", "Внутренняя отделка")).sibling(0).shouldHave(text("63%"));
        $(byTagAndText("th", "Движимое имущество: мебель, электронная и бытовая техника и пр. имущество в квартире")).sibling(0).shouldHave(text("30 000"));
        $(byTagAndText("th", "Гражданская ответственность перед третьими лицами")).sibling(0).shouldHave(text("250 000"));
        $(byTagAndText("th", "Общая страховая сумма")).sibling(0).shouldHave(text("580 000"));
        $(byTagAndText("th", "Стоимость 1 год")).sibling(0).shouldHave(text("6 000"));
        $(byTagAndText("th", "Стоимость 2 года")).sibling(0).shouldHave(text("12 000"));
        });
    }









}


