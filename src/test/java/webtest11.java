import net.sourceforge.htmlunit.corejs.javascript.tools.shell.Global;
import org.junit.After;
//import org.junit.Assert;
//import org.junit.Test;
import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * Created by VAIO on 17-Nov-16.
 */

/*

MAIN TESTS FROM THE POSSITION OF CUSTOMER

1. Homepage = https://www.babyandfamilystore.co.uk/ - tested

2. Search Results Page = search for string "monitor" - tested

3. Login my account - tested

4. Create my account - tested

5. Order Form Page without account as Guest - partially tested

6. Product Details Page

4.Order Confirmation Page

*/


public class webtest11 {



    @Test
    //Homepage and search **************************************************************
    public void homepageAndSearch(){

        System.out.println("homepageAndSearch() start");
        final String searchingWord = "monitor";


//        WebDriver driver;
//        System.setProperty("webdriver.gecko.driver", "C:\\WebDrivers\\geckodriver.exe");
//        driver =new FirefoxDriver();

//        WebDriver driver;
//        System.setProperty("webdriver.gecko.driver", "//home//kamilb//aps//webdriver//firefox//geckodriver");
//        driver =new FirefoxDriver();

        //System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");


        //WebDriver driver = new ChromeDriver();
//        WebDriverWait wait = new WebDriverWait(driver,30);


        System.out.println("homepageAndSearch() finish");


//        driver.get("https://www.babyandfamilystore.co.uk/");

        //Search Results Page and find string = searchingWord **************************************************************
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search")));
//        WebElement searchTextBox = driver.findElement(By.id("search"));
//        searchTextBox.clear();
//        searchTextBox.sendKeys(searchingWord);
//
//        WebElement searchTextButton = driver.findElement(By.cssSelector("[title='Search']"));
//        searchTextButton.click();

//        driver.quit();


    }

//    @Test
    //Create my account **************************************************************
    //- variations
    //- no filled textboxes
    //- filled with forbidden characters
    //- wrong type of email adress
    //- first name is correct?
    //- last name is correct?
    //- change pasword
    //- billing adress
    //- newsletter
    // ...

    public void createMyAccount(){

        final String emailAccount = "kamilburansky@gmail.com";
        final String firstName = "Kamil";
        final String lastName = "Buransky";
        final String passwordString = "_123passworD123";


//        WebDriver driver;
//        System.setProperty("webdriver.gecko.driver", "C:\\WebDrivers\\geckodriver.exe");
//        driver =new FirefoxDriver();

        WebDriver driver;
        System.setProperty("webdriver.gecko.driver", "//home//kamilb//aps//webdriver//firefox//geckodriver");
        driver =new FirefoxDriver();

        WebDriverWait wait = new WebDriverWait(driver,30);

        driver.get("https://www.babyandfamilystore.co.uk/");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[title='My Account']")));
        WebElement myAccountButton = driver.findElement(By.cssSelector("[title='My Account']"));
        myAccountButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[title='Create an Account']")));
        WebElement createAccountButton = driver.findElement(By.cssSelector("[title='Create an Account']"));
        createAccountButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstname")));
        WebElement firstNameTextBox = driver.findElement(By.id("firstname"));
        firstNameTextBox.clear();
        firstNameTextBox.sendKeys(firstName);

        WebElement lastNameTextBox = driver.findElement(By.id("lastname"));
        lastNameTextBox.clear();
        lastNameTextBox.sendKeys(lastName);

        WebElement emailTextBox = driver.findElement(By.id("email_address"));
        emailTextBox.clear();
        emailTextBox.sendKeys(emailAccount);

        WebElement pswTextBox = driver.findElement(By.id("password"));
        pswTextBox.clear();
        pswTextBox.sendKeys(passwordString);

        WebElement confirmPswTextBox = driver.findElement(By.id("confirmation"));
        confirmPswTextBox.clear();
        confirmPswTextBox.sendKeys(passwordString);

        WebElement anyChildrenButton = driver.findElement(By.id("haveOtherChildren"));
        anyChildrenButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[name='have-other-children'] [value='1']")));
        WebElement yesChildrenButton = driver.findElement(By.cssSelector("[name='have-other-children'] [value='1']"));
        yesChildrenButton.click();

        WebElement isSubscribedCheckBox = driver.findElement(By.id("is_subscribed"));
        isSubscribedCheckBox.click();

        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='form-validate']/div[3]/button")));
        //WebElement submitButton = driver.findElement(By.cssSelector("[class='button'][title='Submit']"));
        //submitButton.click();

        WebElement submitButton2 = driver.findElement(By.xpath(".//*[@id='form-validate']/div[3]/button"));
        submitButton2.click();

        driver.quit();
    }

    //    @Test
    //Login my account **************************************************************
    public void loginMyAccount(){
        //- variations
        //- wrong email adress, correct password
        //- correct email adress, wrong password
        //- forgotten password - reset password
        //- login with new password
        // ...

        final String emailAccount = "kamilburansky@gmail.com";
        final String passwordString = "_123passworD123";


        WebDriver driver;
        System.setProperty("webdriver.gecko.driver", "//home//kamilb//aps//webdriver//firefox//geckodriver");
        driver =new FirefoxDriver();

        WebDriverWait wait = new WebDriverWait(driver,30);

        driver.get("https://www.babyandfamilystore.co.uk/");


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[title='My Account']")));
        WebElement myAccountButton = driver.findElement(By.cssSelector("[title='My Account']"));
        myAccountButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
        WebElement emailTextBox = driver.findElement(By.id("email"));
        emailTextBox.clear();
        emailTextBox.sendKeys(emailAccount);

        WebElement pswTextBox = driver.findElement(By.id("pass"));
        pswTextBox.clear();
        pswTextBox.sendKeys(passwordString);

        WebElement loginButton = driver.findElement(By.id("send2"));
        loginButton.click();

        //Assert.assertTrue("Email string should be visible in textBox", driver.findElements(By.partialLinkText("Inbox")).size() > 0);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='page-title']")));
        Assert.assertTrue(driver.findElements(By.cssSelector("div[class='page-title']")).size() > 0, "Email string should be visible in textBox");


        driver.quit();

    }

    //5.Order Form Page without account as Guest item Tomy Baby Digital Monitor TF525
//    @Test
    public void OrderFormPageWithoutAccount() {
        //- variations
        //- no filled text boxes in checkout
        //- text boxes filled with forbidden characters (Zip) in checkout
        //- add another product (added to cart?)
        //- Add the same item multiple times = (added same product to cart?)
        //- Add multiple items of different types = (added products to cart?)
        //- Remove some items from the cart = (removed from cart?)
        //- Remove all items from the cart = (is cart empty?)
        //- Click on an item in the cart = (will show info about product?)
        //- Add item to the cart, than close the browser, open borwer and the same site = (will be the item in the cart?)



        //-at the end (no script)
        //FILL ALL BILLING INFORMATION
        //FILL ALL DELIVERY METHOD
        //FILL ALL PAYMENT INFORMATION
        //OTHER INFORMATION


        final String searchingSpecificWord = "Tomy Baby Digital Monitor TF525";

//        WebDriver driver;
//        System.setProperty("webdriver.gecko.driver", "C:\\WebDrivers\\geckodriver.exe");
//        driver =new FirefoxDriver();

        WebDriver driver;
        System.setProperty("webdriver.gecko.driver", "//home//kamilb//aps//webdriver//firefox//geckodriver");
        driver =new FirefoxDriver();

        WebDriverWait wait = new WebDriverWait(driver,30);

        driver.get("https://www.babyandfamilystore.co.uk/");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search")));
        WebElement searchTextBox = driver.findElement(By.id("search"));
        searchTextBox.clear();
        searchTextBox.sendKeys(searchingSpecificWord);

        WebElement searchTextButton = driver.findElement(By.cssSelector("[title='Search']"));
        searchTextButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='item-addcart']")));
        WebElement addToCartButton = driver.findElement(By.cssSelector("[class='item-addcart']"));
        addToCartButton.click();


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='product_addtocart_form']/div[2]/div[6]/div[3]/div/button")));
        WebElement goToCartButton = driver.findElement(By.xpath(".//*[@id='product_addtocart_form']/div[2]/div[6]/div[3]/div/button"));
        goToCartButton.click();


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='product_addtocart_form']/div[2]/div[6]/div[3]/div/button")));
        WebElement proceedToCheckOutButton = driver.findElement(By.xpath(".//*[@id='product_addtocart_form']/div[2]/div[6]/div[3]/div/button"));
        proceedToCheckOutButton.click();

        driver.quit();

    }

}



