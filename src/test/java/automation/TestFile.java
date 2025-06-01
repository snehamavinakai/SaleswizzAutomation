package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;
import java.util.List;

public class TestFile extends LocatorsJava {

    public void login(WebDriver driver) {

//        driver.findElement(By.xpath(solutionLink)).click();
//
//        driver.findElement(By.xpath(pricingLink)).click();
//
//        driver.findElement(By.xpath(blogLink)).click();
//
//        driver.findElement(By.xpath(aboutUslink)).click();
//
//        driver.findElement(By.xpath(contactLink)).click();

        driver.findElement(By.xpath(startNowBtn)).click();
        driver.findElement(By.xpath(phoneInput)).sendKeys("57673");
        driver.findElement(By.xpath(nextBtn)).click();

        String errorTextOnSubmit = driver.findElement(By.xpath(errorText)).getText();
        if (errorTextOnSubmit.contains("Mobile number is not valid")) {
            driver.findElement(By.xpath(phoneInput)).clear();
            driver.findElement(By.xpath(phoneInput)).sendKeys("8867509576");
            driver.findElement(By.xpath(nextBtn)).click();
        }

        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(By.xpath(verifyOTPBtn)).click();
    }

    public void addCatalogueGroupDetails(WebDriver driver) throws InterruptedException {
        //driver.findElement(By.xpath(addBtn)).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(addBtn))).click();
        driver.findElement(By.xpath(catalogueGroupBtn)).click();
        String filePath = "C:\\Users\\PC\\Desktop\\SalesWizz\\j1.jpg";
        WebElement fileUpload = driver.findElement(By.xpath(uploadPhotoEditIcon1));
        fileUpload.sendKeys(filePath);

        driver.findElement(By.xpath(groupName)).sendKeys("One Piece");

        List<WebElement> radioButtons = driver.findElements(By.xpath(allRadioBtns));
        for (int i = 0; i < radioButtons.size()-2; i++) {
            Thread.sleep(1000);
            radioButtons.get(i).click();
//            Thread.sleep(1000);
            radioButtons.get(i).click();
        }

        driver.findElement(By.xpath(unitOfMeasureSelect)).click();
        driver.findElement(By.xpath(unitOfMeasureGrams)).click();
        driver.findElement(By.xpath(quantitySelect)).click();
        driver.findElement(By.xpath(getQuantityKiloGram)).click();
        driver.findElement(By.xpath(otherFields1)).sendKeys("Hi");
        driver.findElement(By.xpath(otherFields2)).sendKeys("Hello");
        driver.findElement(By.xpath(whiteListRadio)).click();
        driver.findElement(By.xpath(createBtn)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(confirmNoBtn)).click();

    }

    public void addCatalogueDetails(WebDriver driver) throws InterruptedException {
        driver.findElement(By.xpath(addBtn)).click();
        driver.findElement(By.xpath(catalogueBtn)).click();
        String filePath1 = "C:\\Users\\PC\\Desktop\\SalesWizz\\d1.png";
        WebElement fileUpload = driver.findElement(By.xpath(uploadPhotoEditIcon2));
        fileUpload.sendKeys(filePath1);


        driver.findElement(By.xpath(catalogueName)).sendKeys("Book");

        List<WebElement> radioButtons = driver.findElements(By.xpath(allRadioBtns));
        for (int i = 0; i < radioButtons.size(); i++) {
            radioButtons.get(i).click();
            radioButtons.get(i).click();
        }

        driver.findElement(By.xpath(unitOfMeasureCatalogue)).click();
        driver.findElement(By.xpath(unitOfMeasureGrams)).click();
        driver.findElement(By.xpath(whiteListRadio)).click();
        driver.findElement(By.xpath(privacyPublic)).click();
        driver.findElement(By.xpath(createBtn)).click();
        driver.findElement(By.xpath(confirmNoBtn)).click();
        //driver.findElement(By.xpath(myCataloguesBtn)).click();

       // driver.findElement(By.xpath(addToCatalogues)).click();
        driver.findElement(By.xpath(addProductButton)).click();

        String filePath3 = "C:\\Users\\PC\\Desktop\\SalesWizz\\j1.jpg";
        WebElement fileUpload2 = driver.findElement(By.xpath(uploadImage));
        fileUpload2.sendKeys(filePath3);

        driver.findElement(By.xpath(productTitle)).sendKeys("Luffy");
        driver.findElement(By.xpath(productDescription)).sendKeys("King of the Priates");
        driver.findElement(By.xpath(productSKU)).sendKeys("1");
        driver.findElement(By.xpath(productUOM)).sendKeys("10");
        driver.findElement(By.xpath(productTag)).sendKeys("Anime");
        driver.findElement(By.xpath(productSave)).click();
        driver.findElement(By.xpath(productFilter)).click();
        driver.findElement(By.xpath(productAvailability)).click();
//        driver.findElement(By.xpath(productInStock)).click();
        driver.findElement(By.xpath(productOutOfStock)).click();
        driver.findElement(By.xpath(productApply)).click();
        driver.findElement(By.xpath(productShare)).click();

       // driver.findElement(By.xpath(productDesc)).click();
       // driver.findElement(By.xpath(productDesc)).sendKeys("Hello");
        //driver.findElement(By.xpath(productExpire)).click();
       // driver.findElement(By.xpath(productExpireOption)).click();
        driver.findElement(By.xpath(productShareBtn)).click();
        driver.findElement(By.xpath(productShareLink)).click();
        driver.findElement(By.xpath(productShareClose)).click();
        driver.findElement(By.xpath(productManageInventory)).click();
//        driver.findElement(By.xpath(productMnKg)).sendKeys("1");
//        WebElement prdInput = driver.findElement(By.xpath(productMnKg));
//        prdInput.sendKeys("1");
//        driver.findElement(By.xpath(productMnSubBtn)).click();
        driver.findElement(By.xpath(forwardToSupplier)).click();
        driver.findElement(By.xpath(searchSupplier)).click();
        driver.findElement(By.xpath(supplier1)).click();
        driver.findElement(By.xpath(s1)).click();
        //Thread.sleep(1000);
//        driver.findElement(By.id(orderValue)).sendKeys("500");
       // driver.findElement(By.xpath(orderDate)).click();
//        driver.findElement(By.xpath(selectDate)).click();
        //Thread.sleep(1000);

//        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath(orderValue))).click();

//        driver.findElement(By.xpath(orderValue)).click();
        driver.findElement(By.xpath(orderValue)).sendKeys("500");
         driver.findElement(By.xpath(orderDate)).sendKeys("02/06/2025");;

//        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath(selectDate))).click();
//        driver.findElement(By.xpath(selectDate)).click();
        driver.findElement(By.xpath(selectDate)).click();
        driver.findElement(By.xpath(forward)).click();

    }





}
