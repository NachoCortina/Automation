package paginas;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AE_Register {
    
    public AE_Register(WebDriver driver) {
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20),this);
        
    }


    //Using FindBy to locate elements 

    @FindBy(xpath="//a[normalize-space()='Signup / Login']")
    WebElement btnPageLogin;

    @FindBy(xpath = "//input[@placeholder='Name']")
    WebElement txtName;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    WebElement txtNewEmail;

    @FindBy(xpath = "//button[normalize-space()='Signup']")
    WebElement btnSignUp;

    @FindBy(xpath = "//b[normalize-space()='Enter Account Information']")
    WebElement noteCompleteRegister;

    @FindBy(xpath="//input[@id='password']")
    WebElement txtNewPassword;

    @FindBy(id="first_name")
    WebElement txtNombre;

    @FindBy(id="id_gender1")
    WebElement rbtnMr;

    @FindBy(id="days")
    WebElement ddlDays;

    @FindBy(id="months")
    WebElement ddlMonths;

    @FindBy(id="years")
    WebElement ddlYears;

    @FindBy(id="last_name")
    WebElement txtLastName;

    @FindBy(id="address1")
    WebElement txtAddress;

    @FindBy(id="country")
    WebElement ddlCountry;

    @FindBy(id="state")
    WebElement txtState;

    @FindBy(id="city")
    WebElement txtCity;

    @FindBy(id="zipcode")
    WebElement txtZipCode;

    @FindBy(id="mobile_number")
    WebElement txtMobileNumber;

    @FindBy(xpath = "//div[@class='grippy-host']")
    WebElement popUp;

    @FindBy(xpath ="//*[@id=\"form\"]/div/div/div/div/form/button")
    WebElement btnCreateAccount;

    @FindBy(xpath = "//b[normalize-space()='Account Created!']")
    WebElement noteSuccessfulRegister;

    public void registerPage(String strName,String strEmail){
        btnPageLogin.click();
        txtName.sendKeys(strName);
        txtNewEmail.sendKeys(strEmail);
        btnSignUp.click();
    }

    public void completeRegister(String strNombre,String strPassword, String strDays, 
    String strMonth, String strYear, String strLastName, 
    String strAddress, String strCountry, String strState, String strCity, 
    String strZipCode, String strMobileNumber)
    {
        rbtnMr.click();
        txtNewPassword.sendKeys(strPassword);
        
        Select dropdownDays = new Select(ddlDays);
        dropdownDays.selectByVisibleText(strDays);

        Select dropdownMonths = new Select(ddlMonths);
        dropdownMonths.selectByVisibleText(strMonth);

        Select dropdownYears = new Select(ddlYears);
        dropdownYears.selectByVisibleText(strYear);

        txtNombre.sendKeys(strNombre);
        txtLastName.sendKeys(strLastName);
        txtAddress.sendKeys(strAddress);
        
        Select dropdownCountry = new Select(ddlCountry);
        dropdownCountry.selectByVisibleText(strCountry);

        txtState.sendKeys(strState);
        txtCity.sendKeys(strCity);
        txtZipCode.sendKeys(strZipCode);
        txtMobileNumber.sendKeys(strMobileNumber);
        txtMobileNumber.sendKeys(Keys.RETURN);

        //popUp.click();
        
        //btnCreateAccount.click();
    }

    public String getValidNoteRegister(){
        return noteCompleteRegister.getText();
    }

    public String getValidNoteCompleteRegister(){
        return noteSuccessfulRegister.getText();
    }
    







}
