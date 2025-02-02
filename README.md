# Проект по автоматизации тестирования для компании [ЛОКО банк](https://www.lockobank.ru/about/)

> Локо банк — Универсальный коммерческий банк с 30-летним опытом.

## **Содержание:**
____

* <a href="#tools">Технологии и инструменты</a>

* <a href="#cases">Примеры автоматизированных тест-кейсов</a>

* <a href="#jenkins">Сборка в Jenkins</a>

* <a href="#console">Запуск из терминала</a>

* <a href="#allure">Allure отчет</a>

* <a href="#allure-testops">Интеграция с Allure TestOps</a>

* <a href="#telegram">Уведомление в Telegram при помощи бота</a>

* <a href="#video">Примеры видео выполнения тестов на Selenoid</a>
____
<a id="tools"></a>
## <a name="Технологии и инструменты">**Технологии и инструменты:**</a>

<p align="center">  
<a href="https://www.jetbrains.com/idea/"><img src="images/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA"/></a>  
<a href="https://www.java.com/"><img src="images/Java.svg" width="50" height="50"  alt="Java"/></a>  
<a href="https://github.com/"><img src="images/Github.svg" width="50" height="50"  alt="Github"/></a>  
<a href="https://junit.org/junit5/"><img src="images/JUnit5.svg" width="50" height="50"  alt="JUnit 5"/></a>  
<a href="https://gradle.org/"><img src="images/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>  
<a href="https://selenide.org/"><img src="images/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>  
<a href="https://aerokube.com/selenoid/"><img src="images/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a>  
<a href="ht[images](images)tps://github.com/allure-framework/allure2"><img src="images/Allure.svg" width="50" height="50"  alt="Allure"/></a> 
<a href="https://qameta.io/"><img src="images/Allure2.svg" width="50" height="50"  alt="Allure TestOps"/></a>   
<a href="https://www.jenkins.io/"><img src="images/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>   
</p>

____
<a id="cases"></a>
## <a name="Примеры автоматизированных тест-кейсов">**Примеры автоматизированных тест-кейсов:**</a>
____
-  *Проверка полей таблицы с Тарифами по страхованию*
-  *Проверка меню на английском языке*
-  *Проверка меня на русском языке*
-  *Проверка названия раздела на странице Private-banking*
-  *Проверка файла инструкции инструкции*

____
<a id="jenkins"></a>
## <img alt="Jenkins" height="25" src="images/Jenkins.svg" width="25"/></a><a name="Сборка"></a>Сборка в [Jenkins](https://jenkins.autotests.cloud/job/032-TKI308-jenkins-FastProject/)</a>
____
<p align="center">  
<a href="https://jenkins.autotests.cloud/job/032-TKI308-jenkins-FastProject/)/"><img src="images/screen/jenkins.png" alt="Jenkins" width="950"/></a>  
</p>


### **Параметры сборки в Jenkins:**

- *browser (браузер, по умолчанию chrome)*
- *browserVersion (версия браузера, по умолчанию 100.0)*
- *browserSize (размер окна браузера, по умолчанию 1920x1080)*
- *remoteUrl (логин, пароль и адрес удаленного сервера Selenoid)*

<a id="console"></a>
## Команды для запуска из терминала
___
***Локальный запуск:***
```bash  
gradle clean Loko_test
```

***Удалённый запуск через Jenkins:***
```bash  
clean
Loko_test
"-DremoteHost=${REMOTEHOST}"
"-Dbrowser=${BROWSER}"
"-DbrowserVersion=${VERSION_BROWSER}"
"-DbrowserSize=${BROWSER_SIZE}"
```
___
<a id="allure"></a>
## <img alt="Allure" height="25" src="images/Allure.svg" width="25"/></a> <a name="Allure"></a>Allure [отчет](https://jenkins.autotests.cloud/job/032-TKI308-jenkins-FastProject/11/allure/)</a>
___

### *Основная страница отчёта*

<p align="center">  
<img title="Allure Overview Dashboard" src="images/screen/allure.png" width="850">  
</p>  

### *Тест-кейсы*

<p align="center">  
<img title="Allure Tests" src="images/screen/allure_test.png" width="850">  
</p>

### *Графики*

<p align="center">  
<img title="Allure Graphics" src="images/screen/graph.png" width="850">
 
</p>

___
<a id="allure-testops"></a>
## <img alt="Allure" height="25" src="images/Allure2.svg" width="25"/></a>Интеграция с <a target="_blank" href="https://allure.autotests.cloud/launch/44397">Allure TestOps</a>
____
### *Allure TestOps просмотр запусков Jenkins*

<p align="center">  
<img title="Allure TestOps Dashboard" src="images/screen/testops_number.png" width="850">  
</p>  

<p align="center">  
<img title="Allure TestOps Dashboard" src="images/screen/testops.png" width="850">  
</p> 


____


<a id="telegram"></a>
## <img alt="Telegram" height="25" src="images/Telegram.svg" width="25"/></a> Уведомление в Telegram при помощи бота
____
<p align="center">  
<img title="Allure Overview Dashboard" src="images/screen/telegram.png" width="450">  
</p>

____
<a id="video"></a>
## <img alt="Selenoid" height="25" src="images/Selenoid.svg" width="25"/></a> Примеры видео выполнения тестов на Selenoid
____
<p align="center">
<img title="Selenoid Video" src="images/Gif.gif" width="550" height="350"  alt="video">   
</p>
