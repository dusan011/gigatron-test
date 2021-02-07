package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GigatronLogIn extends BaseHelper
{
    //@FindBy(className = "hd-reg")
   // WebElement prijava;

    public GigatronLogIn(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private void closePopUp()
    {
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"gdpr-cookie-settings\"]/div[2]/button")));
        WebElement prihvatamButton = driver.findElement(By.xpath("//*[@id=\"gdpr-cookie-settings\"]/div[2]/button"));
        prihvatamButton.click();
    }

    private void clickOnPrijava() {
        closePopUp();
        WebElement prijava = driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[1]/div[1]/div/div/div/div[1]/ul/li[2]/div/a[1]"));
        prijava.click();
    }


    private void insertLogInInformation() throws InterruptedException {
        System.out.println("Ovo se ispisuje");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("loginSubmit")));
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("enter your email");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("enter your password");
        WebElement prijavaButton = driver.findElement(By.id("loginSubmit"));
        prijavaButton.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div/div[1]/ul/li[15]/a")));
        Thread.sleep(5000);

    }


    public void gigatronLogIn() throws InterruptedException {
        navigateToUrl("https://gigatron.rs/");
        clickOnPrijava();
        insertLogInInformation();
    }
}
