package cz.czechitas;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import org.junit.jupiter.api.*;
import org.omg.CORBA.DynAnyPackage.*;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.*;

import static java.lang.Thread.*;

public class ShopPage {
  //proměnná
    private final WebDriver driver;
    WebElement element;

    private final By usernameadminlogin = By.id("username");
    private final By passwordadminlogin = By.id("password");
    private final By adminloginbutton = By.id("formSubmitButton");
    private final By loginfailmessage = By.xpath("//*[@id=\"logon\"]/div[1]/div");

    private final int maxWaitInSeconds= 10;

  //konstruktor
    public ShopPage(WebDriver driver)
    {
        this.driver = driver;
    }

  //metoda navigace na stránku
    public void openPage ()
    {
      String adminUrl = Settings.baseUrl + "/shop admin/";
      driver.navigate().to(adminUrl);
    }

  //metoda pro login s validním username do admina,
    public void ValidUsernameAdminLogin()
    {
      String ValidUsername ="admin@shopizer.com";
      driver.findElement(usernameadminlogin).sendKeys(ValidUsername);
    }

  //metoda pro login s nevalidním username do admina,
    public void InValidUsernameAdminLogin()
    {
      String InValidUsername ="wrongadmin@shopizer.com";
      driver.findElement(usernameadminlogin).sendKeys(InValidUsername);
    }

    //metoda pro login s validním password do admina
    public void ValidPasswordAdminLogin()
    {
      String ValidPassword ="password";
      driver.findElement(passwordadminlogin).sendKeys(ValidPassword);
    }

  //metoda pro login s nevalidním password do admina
     public void InValidPasswordAdminLogin()
    {
      String InValidPassword ="wrongpassword";
      driver.findElement(passwordadminlogin).sendKeys(InValidPassword);
    }

 //metoda pro příhlášení, click na adminloginbutton
    public void ConfirmAdminLogin()
    {
      driver.findElement(adminloginbutton).click();
    }

 //metoda pro nalezení elementu failmessage

}
