/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com.ikea;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Mahendra
 */
public class Ikea1Test {

    private WebDriver driver;
    private String baseUrl;

    public Ikea1Test() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {
    }

    @Test

    public void testIkea1() throws Exception {
        driver.get("https://www.ikea.com/us/en/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//li[4]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"loyalty-modal-content\"]/div/div/div[3]/ul/li[1]/a")).click();
        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("username")).sendKeys("akmselenium@gmail.com");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("ITExps123");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/form/button[1]")).click();
        driver.close();
    }
}
