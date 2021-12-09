package androidTest;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.*;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.Test;

public class testEmulator {
    private AndroidDriver driver;

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "pixel");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "9.0");
        capabilities.setCapability("udid", "emulator-5554");
        capabilities.setCapability("appPackage", "com.vkontakte.android");
        capabilities.setCapability("appActivity", "com.vkontakte.android.MainActivity");

        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
    }

    @Test
    public void testAddition() throws InterruptedException {
   driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        MobileElement el1 = (MobileElement) driver.findElementById("com.vkontakte.android:id/login_button");
        el1.click();

        driver.findElementById("com.google.android.gms:id/cancel").click();
        MobileElement el2 = (MobileElement) driver.findElementById("com.vkontakte.android:id/email_or_phone");
        el2.sendKeys("+7 (927) 482-58-03");
        MobileElement el3 = (MobileElement) driver.findElementById("com.vkontakte.android:id/vk_password");
        el3.sendKeys("1234567890");
        MobileElement el4 = (MobileElement) driver.findElementById("com.vkontakte.android:id/continue_btn");
        el4.click();
        MobileElement el5 = (MobileElement) driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Messenger\"]/android.widget.ImageView");
        el5.click();

        new TouchAction(driver)
                .press(PointOption.point(402, 1223))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(440, 760))
                .release().perform();
        new TouchAction( driver)
                .press(PointOption.point(428, 603))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(451, 1138))
                .release().perform();

        Thread.sleep(10000);
        MobileElement el1_1 = (MobileElement) driver.findElementByAccessibilityId("Open menu");
        el1_1.click();
        Thread.sleep(10000);
        MobileElement el5_1 = (MobileElement) driver.findElementByAccessibilityId("Settings");
        el5_1.click();
        MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[7]/android.widget.TextView");
        el6.click();
        MobileElement el7 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[3]/android.widget.TextView");
        el7.click();
        MobileElement el8 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[2]/android.widget.TextView");
        el8.click();
        MobileElement el9 = (MobileElement) driver.findElementByAccessibilityId("Close screen");
        el9.click();
        new TouchAction( driver)
                .press(PointOption.point(446, 1686))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(443, 917))
                .release().perform();
        MobileElement el10 = (MobileElement) driver.findElementById("com.vkontakte.android:id/logout");
        el10.click();
        MobileElement el11 = (MobileElement) driver.findElementById("android:id/button1");
        el11.click();
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}
