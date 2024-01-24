import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TrckkysiteAutomation {
public static void main(String[] args) throws InterruptedException {
	

// Set the path to the ChromeDriver executable System.setProperty("webdriver.chrome.driver", "C:\\Users\\20063\\Dropbox\\My FC (DESKTOP-6109MDB)\\Downloads\\chromedriver-win64\\chromedriver
// Create a ChromeDriver Instance WebDriver driver new ChromeDriver();
System.setProperty("webdriver.chrome.driver", "C:\\Users\\20063\\Dropbox\\My PC (DESKTOP-6ID9MDB)\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\\");


WebDriver driver= new ChromeDriver();




driver.get("https://www.trukky.com/door-to-door-goods-delivery");

// Step 2: Check if you have landed in the correct page
System.out.println("Page URL: " + driver.getCurrentUrl());
System.out.println("Page Title: " + driver.getTitle());

driver.manage().window().maximize();

WebDriverWait wait = new WebDriverWait(driver, 20);

Thread.sleep(6000);
//Q) The Pickup City Hyderabad

WebElement pickupLocationInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@class, 'searchBoxInnerWrap')]/div/input")));
pickupLocationInput.sendKeys("Hyderabad");
WebElement searchResultDiv = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class, 'recentSearch')]")));

// Select the desired result
WebElement firstResult = searchResultDiv.findElement(By.xpath(".//li[1]"));
firstResult.click();



WebElement toCityInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@class, 'searchBoxInnerWrap')]/div[2]/input")));

toCityInput.sendKeys("Delhi");

WebElement toSearchResultDiv = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class, 'recentSearch')]"))); // Adjust XPath if needed

WebElement firstToSuggestion = toSearchResultDiv.findElement(By.xpath(".//li[1]"));
firstToSuggestion.click();

//first page done
//Q) Click on Check Price
WebElement checkPriceButton= driver.findElement(By.xpath("//button[text()='Check price']"));
wait.until(ExpectedConditions.elementToBeClickable(checkPriceButton));
checkPriceButton.click();
// first page done
Thread.sleep(1000);
// Q Click on services type as a personal WebElement personalRadioButton driver.findElement(By.xpath("//*[contains(class, 'serviceOptions')]/11[2]"));
WebElement personalRadioButton = driver.findElement(By.xpath("//*[contains(@class, 'serviceOptions')]/li[2]/div"));
wait.until(ExpectedConditions.elementToBeClickable (personalRadioButton));
personalRadioButton.click();

Thread.sleep(1000);
//Q) Select load service as Few packed items (1-5)
WebElement loadServiceDropdown = driver.findElement(By.xpath("//*[contains(@class, 'serviceOptions')]/li"));
wait.until(ExpectedConditions.elementToBeClickable(loadServiceDropdown));
loadServiceDropdown.click();
//3rd page done
Thread.sleep(1000);
//Q) Click on Add material
WebElement addMaterialButton = driver.findElement(By.xpath("//*[contains(@class, 'primary')]"));
wait.until(ExpectedConditions.elementToBeClickable(addMaterialButton));
addMaterialButton.click();
Thread.sleep(1000);
//Q) Select a material from choose material dropdown-Window AC
WebElement chooseMaterialDropdown = driver.findElement(By.xpath("//*[@id='form_0']/div/div[2]"));
wait.until(ExpectedConditions.elementToBeClickable(chooseMaterialDropdown));
chooseMaterialDropdown.click();
Thread.sleep(1000);
WebElement chooseMaterialDropdownitem = driver.findElement(By.xpath("//option[text()='Window AC']"));
wait.until(ExpectedConditions.elementToBeClickable(chooseMaterialDropdownitem));
chooseMaterialDropdownitem.click();
Thread.sleep(1000);

Thread.sleep(1000);

WebElement noItemsInput = driver.findElement(By.xpath("//*[contains(@class, 'inputField')]"));
wait.until(ExpectedConditions.elementToBeClickable (noItemsInput));
noItemsInput.sendKeys("2");

///

WebElement forwardButton = driver.findElement(By.xpath("//html/body/div/div/main/div/div/div[2]/form/div[3]/button"));
wait.until(ExpectedConditions.elementToBeClickable(forwardButton));
forwardButton.click();
//Q) click on next button
WebElement nextButton = driver.findElement(By.xpath("//button[text()='Next']"));
wait.until(ExpectedConditions.elementToBeClickable(nextButton));
nextButton.click();
// perfectly fine till here
Thread.sleep(2000);
// 0) Select a date from Choose pickup date-28 April
WebElement choosePickupDateInput = driver.findElement(By.xpath("//button[text()='›']"));
wait.until(ExpectedConditions.elementToBeClickable(choosePickupDateInput));
choosePickupDateInput.click();
choosePickupDateInput.click();
choosePickupDateInput.click();

WebElement choosePickupDate = driver.findElement(By.xpath("//abbr[text()='28']"));
wait.until(ExpectedConditions.elementToBeClickable (choosePickupDate));
choosePickupDate.click();


WebElement nextButtonAfterDate = driver.findElement(By.xpath("//button[text()='Next']"));
wait.until(ExpectedConditions.elementToBeClickable (nextButtonAfterDate));
nextButtonAfterDate.click();


//Q) Enter mobile number for OTP 
Thread.sleep(2000);
WebElement phoneNumberInput = driver.findElement(By.xpath("//*[contains(@class, 'inputField')]"));
wait.until(ExpectedConditions.elementToBeClickable (phoneNumberInput));
phoneNumberInput.sendKeys("9999939333");
//Q) Click on get Price Button
WebElement getPriceButton = driver.findElement(By.xpath("//button[text()='Get price']"));
wait.until(ExpectedConditions.elementToBeClickable(getPriceButton));
getPriceButton.click();
}
}
//2nd page done