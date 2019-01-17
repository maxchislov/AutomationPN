import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PNTests {



    @Test //Test when we enter a composite number, we get the message "falseMsg"
    public void testCheckfalseMsg()
    {
        System.setProperty("webdriver.chrome.driver", "//Users/maksimchislov/IdeaProjects/chromedriver");
        WebDriver webDriver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(webDriver, 30, 500);

        webDriver.get("http://localhost:8080/PN_war_exploded/");


        webDriver.findElement(By.id("number_input")).sendKeys("1");
        webDriver.findElement(By.id("button")).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("falseMsg")));

        Assert.assertNotNull(webDriver.findElement(By.className("falseMsg")).isDisplayed());

        webDriver.findElement(By.id("number_input")).clear();

        webDriver.quit();
    }


    @Test //Test when we enter a prime number, we get the message "trueMsg"
    public void testCheckTrueMsg()
    {
        System.setProperty("webdriver.chrome.driver", "//Users/maksimchislov/IdeaProjects/chromedriver");
        WebDriver webDriver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(webDriver, 30, 500);

        webDriver.get("http://localhost:8080/PN_war_exploded/");


        webDriver.findElement(By.id("number_input")).sendKeys("2");
        webDriver.findElement(By.id("button")).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("trueMsg")));

        Assert.assertNotNull(webDriver.findElement(By.className("trueMsg")).isDisplayed());

        webDriver.findElement(By.id("number_input")).clear();

        webDriver.quit();
    }

    @Test //Test when we enter a  ZERO, we get the message "ZEROMsg"
    public void testCheckZEROMsg()
    {
        System.setProperty("webdriver.chrome.driver", "//Users/maksimchislov/IdeaProjects/chromedriver");
        WebDriver webDriver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(webDriver, 30, 500);

        webDriver.get("http://localhost:8080/PN_war_exploded/");


        webDriver.findElement(By.id("number_input")).sendKeys("0");
        webDriver.findElement(By.id("button")).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("ZEROMsg")));

        Assert.assertNotNull(webDriver.findElement(By.className("ZEROMsg")).isDisplayed());

        webDriver.findElement(By.id("number_input")).clear();

        webDriver.quit();
    }

    @Test //Test when we click on a button without entering any value, we get the message "NullMsg"
    public void testCheckNullMsg()
    {
        System.setProperty("webdriver.chrome.driver", "//Users/maksimchislov/IdeaProjects/chromedriver");
        WebDriver webDriver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(webDriver, 30, 500);

        webDriver.get("http://localhost:8080/PN_war_exploded/");


        webDriver.findElement(By.id("button")).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("NullMsg")));

        Assert.assertNotNull(webDriver.findElement(By.className("NullMsg")).isDisplayed());

        webDriver.findElement(By.id("number_input")).clear();

        webDriver.quit();
    }


}
