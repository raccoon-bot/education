import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MyFirstTestClass {
    public static void main(String[] args) {
        //задать файловый путь до скачаного драйвера
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\e.halych\\IdeaProjects\\_1project\\driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // go to google
        driver.get("https://algarvegolf.holiday/");

        //установить размер окна
        driver.manage().window().setSize(new Dimension(1200, 900));
        //задать ожидание
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //найти элемент и кликнуть по нему
        driver.findElement(By.xpath("//div[1]/nav/ul/li[1]/a")).click();

        //ввести URL текущей страницы
        System.out.println("Now I am on page: "+ driver.getCurrentUrl());
        System.out.println("****");
        //вернуться на предыдущую страницу
        driver.navigate().back();
        //вывести URL текущей страницы
        System.out.println("Now I am on page: "+ driver.getCurrentUrl());
        System.out.println("****");

        //вернуться вперед на страницу
        driver.navigate().forward();
        //вывести URL текущей страницы
        System.out.println("Now I am on page: "+ driver.getCurrentUrl());
        System.out.println("****");

        new WebDriverWait(driver, '8').until(ExpectedConditions.visibilityOfElementLocated(By.className("banner-title")));

        //обьявить найденную переменную
        WebElement round = driver.findElement(By.className("golf-packages-filter"));

        //вывести извлеченный по селектору текст
        System.out.println("On this page we have: "+round.getText());

        //закрыть браузер
        driver.quit();
    }
}
