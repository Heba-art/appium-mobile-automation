package tests;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;

public class TC03_VerifyNetworkOption extends BaseTest {

    @Test
    public void openNetworkAndInternetSection() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));

        try {
            // ------------------------------------------------------
            // 0) Ensure the Settings app is currently active
            // ------------------------------------------------------
            if (!"com.android.settings".equals(driver.getCurrentPackage())) {
                driver.activateApp("com.android.settings");
            }

            // ------------------------------------------------------
            // 1) Navigate back until we reach the main Settings home
            //    (This ensures we are not stuck inside sub-menus)
            // ------------------------------------------------------
            for (int i = 0; i < 5; i++) {

                boolean onHome = !driver.findElements(
                        AppiumBy.xpath("//android.widget.TextView[@text='Search Settings' or @text='Search settings']")
                ).isEmpty();

                if (onHome) {
                    System.out.println("✅ On Settings Home screen");
                    break;
                }

                // Try navigating back
                driver.navigate().back();
                Thread.sleep(400);

                // Re-activate Settings if we accidentally exited it
                if (!"com.android.settings".equals(driver.getCurrentPackage())) {
                    driver.activateApp("com.android.settings");
                }
            }

            // ------------------------------------------------------
            // 2) Click on the “Network & internet” option
            // ------------------------------------------------------
            By networkMenu = AppiumBy.xpath(
                    "//android.widget.TextView[@text='Network & internet' or @text='Network & Internet']"
            );

            WebElement networkRow = wait.until(
                    ExpectedConditions.elementToBeClickable(networkMenu)
            );

            networkRow.click();
            System.out.println("👉 Clicked on 'Network & internet'");

            // ------------------------------------------------------
            // 3) Validate that we are inside the Network section
            //    by confirming the presence of the “Internet” option
            // ------------------------------------------------------
            By internetOption = AppiumBy.xpath(
                    "//android.widget.TextView[@text='Internet']"
            );

            WebElement internet = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(internetOption)
            );

            Assert.assertTrue(
                    internet.isDisplayed(),
                    "Expected 'Internet' option inside Network & internet screen."
            );

            System.out.println("🔎 Found 'Internet' option");
            System.out.println("✅ TC03 Passed: Network / Internet screen opened successfully.");

        } catch (Exception e) {

            // ------------------------------------------------------
            // Capture screenshot + page source on failure
            // ------------------------------------------------------
            try {
                Files.createDirectories(Path.of("target"));
                Files.write(
                        Path.of("target", "TC03-failed.png"),
                        ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)
                );
                Files.writeString(
                        Path.of("target", "TC03-source.xml"),
                        driver.getPageSource()
                );
                System.out.println("📸 Saved target/TC03-failed.png and target/TC03-source.xml");
            } catch (Exception ignored) {}

            Assert.fail("❌ TC03 Failed: " + e.getMessage(), e);
        }
    }
}
