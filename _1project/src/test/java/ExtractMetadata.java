import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;


public class ExtractMetadata {
    //1. Инициализировать точку входа в программу
    public static void main(String[] args) {
     //2. инициализировать вебдрайвер
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\e.halych\\IdeaProjects\\_1project\\driver\\chromedriver.exe");

     WebDriver driver = new ChromeDriver();

        //3. Перейти на страницу https://dou.ua/
        driver.get("https://dou.ua/");

        //установить размер окна
     driver.manage().window().maximize();
        //задать ожидание
     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


      //4. Вывести в консоль тайтл страницы
        System.out.println("We are on the page: "+driver.getTitle());

      //5. Выполнить клик на любую другую страницу сайта
        driver.findElement(By.xpath("/html/body/div[1]/header/ul/li[7]/a")).click();

      //6. Вывести в консоль тайтл страницы
        System.out.println("We are on the page: "+driver.getTitle());

      //7. Вывести текущий элемент страницы
        System.out.println("The URL of this page is: "+driver.getCurrentUrl());

      //8. Вывести в консоль текст, содержащийся в элементе страницы
        System.out.println("Text on this page is: "+driver.findElement(By.xpath("/html/body/footer/div/div/div[4]/div[2]/a")).getText());

      //9. Перейти обратно на страницу
        driver.navigate().back();

        //10. Вывести тайтл и URL страницы
        System.out.println("We are on the page: "+driver.getTitle());
        System.out.println("The URL of this page is: "+driver.getCurrentUrl());

      //11. Перейти вперед на страницу
        driver.navigate().forward();

      //12. Вывести тайтл и URL страницы
        System.out.println("We are on the page: "+driver.getTitle());
        System.out.println("The URL of this page is: "+driver.getCurrentUrl());
        //13. Перейти на другой сайт
        driver.navigate().to("https://ru.wikipedia.org/wiki/Заглавная_страница");
        // Конструкция if/else
        if (driver.getTitle().equals("trutrutru")) {
            System.out.println("This is not Wiki!");
        }else{
            System.out.println("This is Wiki!! :D");
        }
        //14. Вывести его тайтл, URL, и извлечь текст из любого элемента (.getTitle(); .getCurrentUrl(); .getText())
        System.out.println("We are on the page: "+driver.getTitle());
        System.out.println("The URL of this page is: "+driver.getCurrentUrl());
        System.out.println("Text on this page is: "+driver.findElement(By.xpath("//*[@id=\"interwiki-completelist\"]/a")).getText());
        //15. Закрыть браузер
        driver.quit();






    }
}
