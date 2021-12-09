package androidTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public WebDriver driver;
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(xpath = "com.vkontakte.android:id/login_button")
    private WebElement loginButton;

    @FindBy(xpath = "com.vkontakte.android:id/email_or_phone")
    private WebElement loginInput;

    @FindBy(xpath = "com.vkontakte.android:id/vk_password")
    private WebElement passwdBtn;


    @FindBy(xpath = "com.vkontakte.android:id/continue_btn")
    private WebElement vhodBtn;


    public void clickLogin() {
        loginButton.click(); }


    public void inputLogin(String login) {
        loginInput.sendKeys(login); }

    public void inputPasswd(String passwd) {
        passwdBtn.sendKeys(passwd); }

    public void clickLoginBtn() {
        loginButton.click(); }

    public void clickVhodBtn() {
        vhodBtn.click(); }
}
