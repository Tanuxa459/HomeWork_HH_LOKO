package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;


public class TestBase {

    @BeforeAll
    static void setup() {

        Configuration.baseUrl = "https://www.lockobank.ru";
        Configuration.pageLoadStrategy = "eager";
//        String remoteHost = System.getProperty("remoteHost", "host");
//        Configuration.remote = "https://user1:1234@" + remoteHost + "/wd/hub";
//        Configuration.browser = System.getProperty("browser", "chrome");
//        Configuration.browserVersion = System.getProperty("browserVersion", "114");
//        Configuration.browserSize = System.getProperty("browserSize", "1920×1080");

    }






}
