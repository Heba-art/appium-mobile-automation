package tests;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC02_VerifySearchIcon extends BaseTest{

@Test
public void verifySearchIconVisibility(){
    try{
    // 🔹 Step 1: Wait until the "Search settings" element becomes visible
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement searchIcon = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.id("com.android.settings:id/search_bar_title")));
    // 🔹 Step 2: Validate that the icon is displayed and enabled
    boolean isDisplayed = searchIcon.isDisplayed();
    boolean  isEnabled = searchIcon.isEnabled();
    // 🔹 Step 3: Assertion
    Assert.assertTrue(isDisplayed && isEnabled,"❌ Search icon should be visible and enabled on the Settings home screen");
    System.out.println("✅ TC02 Passed: Search icon is visible and enabled.");
    } catch (Exception e) {
        System.err.println("❌ TC02 Failed: Search icon not found or not visible.");
        e.printStackTrace();
        Assert.fail("Search icon verification failed.", e);
        }
    }
}
