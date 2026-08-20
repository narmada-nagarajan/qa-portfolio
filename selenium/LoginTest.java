package tests;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Sample Selenium WebDriver automation script.
 * Covers positive and negative login scenarios corresponding to
 * login-test-cases.md (TC_LOGIN_001 and TC_LOGIN_002).
 *
 * Application Under Test: https://www.saucedemo.com (public Selenium practice site)
 *
 * Author: Narmada Nagarajan
 */
public class LoginTest {

    private WebDriver driver;
    private static final String BASE_URL = "https://www.saucedemo.com/";

    @BeforeEach
    public void setUp() {
        // Requires chromedriver on PATH, or configure WebDriverManager in a real project
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(BASE_URL);
    }

    /**
     * TC_LOGIN_001: Verify successful login with valid credentials
     */
    @Test
    public void testSuccessfulLogin() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        String currentUrl = driver.getCurrentUrl();
        assertTrue(currentUrl.contains("inventory.html"),
                "Expected to land on the inventory/products page after login");
    }

    /**
     * TC_LOGIN_002: Verify login fails with invalid password
     */
    @Test
    public void testLoginFailsWithInvalidPassword() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("wrong_pass");
        driver.findElement(By.id("login-button")).click();

        WebElement errorMessage = driver.findElement(By.cssSelector("h3[data-test='error']"));
        assertEquals("Epic sadface: Username and password do not match any user in this service",
                errorMessage.getText());
    }

    /**
     * TC_LOGIN_005: Verify locked-out user cannot log in
     */
    @Test
    public void testLockedOutUserCannotLogin() {
        driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        WebElement errorMessage = driver.findElement(By.cssSelector("h3[data-test='error']"));
        assertTrue(errorMessage.getText().contains("locked out"),
                "Expected a locked-out error message");
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
