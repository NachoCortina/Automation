package paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class AE_Login {
    
    public AE_Login(WebDriver driver){
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
    }

    //Using FindBy to locate elements 

    @FindBy(xpath="//a[normalize-space()='Signup / Login']")
    WebElement btnPageLogin;

    @FindBy(xpath = "//input[@data-qa='login-email']")
    WebElement txtEmail;

    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement txtPassword;

    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement btnLogin;


    public void setEmail (String strEmail){
        txtEmail.sendKeys(strEmail);
    }

    public void setPassword(String strPassword){
        txtPassword.sendKeys(strPassword);
    }

    public void clickOnNextButton(){
        btnLogin.click();
    }

    
        
    




}

