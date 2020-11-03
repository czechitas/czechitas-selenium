import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MainApp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\work\\java\\test\\czechitas-selenium\\chromedriver_win32\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");

        WebDriver chromeDriver = new ChromeDriver(options);
        chromeDriver.navigate().to("https://media.cikanek.net/");
        chromeDriver.manage().window().maximize();


        Thread.sleep(2000);

        chromeDriver.close();
    }
}
