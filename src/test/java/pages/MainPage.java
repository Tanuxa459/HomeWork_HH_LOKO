package pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.commands.ScrollTo;
import io.qameta.allure.Step;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;


public class MainPage {

    private final SelenideElement fullNameInput = $("#fullName"),
            phoneInput = $("#phone"),
            birthDayInput = $("#birthDay");
            //checkBoxPatronomic = $(By.name("whithPassNoPatronymic"));

    @Step("Открытие главной страницы")
    public MainPage openPage() {
        open("/personal/kredit/nalichnymi/#form");

        return this;
    }

    @Step("Переключиться на iframe")
    public MainPage switchToFormIframe() {
        switchTo().frame("iFrame1");
        return this;
    }


   @Step ("Ввод фамилии, имени, отчества")
    public MainPage setFullNameInput(String value) {
       fullNameInput.setValue(value);

        return this;
    }

    public MainPage setPhoneInput(String value) {
        phoneInput.setValue(value);
        return this;
    }



    @Step ("Ввод дня рождения")
    public MainPage setBirthDayInput(String value) {
        birthDayInput.setValue(value);

        return this;
    }





}
