babyandfamilytest

MAIN TESTS FROM THE POSSITION OF CUSTOMER for webpage https://www.babyandfamilystore.co.uk/

THE USER CAN USE SELENIUM IDE: http://www.seleniumhq.org/projects/ide/

Tests wrote in JAVA for web browser Firefox with these tools java jdk - http://www.oracle.com/technetwork/java/javase/ downloads/index.html IntelliJ - https://www.jetbrains.com/idea/download/ maven - https://maven.apache.org Selenium - http://www.seleniumhq.org/download/maven.jsp Git

Visual errors: http://www.emmasdiary.co.uk/sales Summer Infant Xpath: .//[@id='form1']/div[3]/div[3]/div/div/div/div[2]/div/div[1]/div[1]/span[1] Summer Infant Xpath: .//[@id='form1']/div[3]/div[3]/div/div/div/div[7]/div/div[1]/div[1]/span[1]

    not same high of the "offer-item-box"

MAIN TESTS FROM THE POSSITION OF CUSTOMER Homepage = https://www.babyandfamilystore.co.uk/ - tested Search Results Page = search for string "monitor" - tested Login my account - tested //- variations //- wrong email adress, correct password //- correct email adress, wrong password //- forgotten password - reset password //- login with new password // ...

Create my account - tested //- variations //- no filled textboxes //- filled with forbidden characters //- wrong type of email adress //- first name is correct? //- last name is correct? //- change pasword //- billing adress //- newsletter // ...

Order Form Page without account as Guest - partially tested //- variations //- no filled text boxes in checkout //- text boxes filled with forbidden characters (Zip) in checkout //- add another product (added to cart?) //- Add the same item multiple times = (added same product to cart?) //- Add multiple items of different types = (added products to cart?) //- Remove some items from the cart = (removed from cart?) //- Remove all items from the cart = (is cart empty?) //- Click on an item in the cart = (will show info about product?) //- Add item to the cart, than close the browser, open borwer and the same site = (will be the item in the cart?) //FILL ALL BILLING INFORMATION //FILL ALL DELIVERY METHOD //FILL ALL PAYMENT INFORMATION //OTHER INFORMATION

Options to config in test: -searching final String searchingWord = "monitor"; - word, that is usually used in this webpage, can be changed final String searchingSpecificWord = "Tomy Baby Digital Monitor TF525"; - try to find a specific item with this name, can be changed -creating/logging user final String emailAccount = "kamilburansky@gmail.com"; //- creating account using this email, can be changed final String firstName = "Kamil"; //- creating account using this firstName, can be changed final String lastName = "Buransky"; //- creating account using this lastName, can be changed final String passwordString = "_123passworD123"; //- creating/logging account using this password, can be changed`
