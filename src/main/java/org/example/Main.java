package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {
    public static void main(String[] args) {
        System.out.println(myMethod());
        System.setProperty("webdriver.chrome.driver","E:\\Lekcyjne\\Słowik\\Projekt\\chromedriver.exe" );
        ChromeOptions opt = new ChromeOptions();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
    }
    private static String myMethod() {
        return "my string";
    }
}
// Token: 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