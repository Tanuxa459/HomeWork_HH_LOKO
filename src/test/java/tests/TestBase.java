package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;


public class TestBase {

    @BeforeAll
    static void setup() {

        Configuration.baseUrl = "https://www.lockobank.ru";
        Configuration.pageLoadStrategy = "eager";
        String remoteHost = System.getProperty("remoteHost", "host");
        Configuration.remote = "https://user1:1234@" + remoteHost + "/wd/hub";
        Configuration.browser = System.getProperty("browser", "chrome");
        Configuration.browserVersion = System.getProperty("browserVersion", "114");
        Configuration.browserSize = System.getProperty("browserSize", "1920×1080");


        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                "enableVNC", true,
                "enableVideo", true
        ));
        Configuration.browserCapabilities = capabilities;

    }






}
