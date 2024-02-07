import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//WebUI.openBrowser('')

//WebUI.navigateToUrl('https://www.amazon.com/')

//WebUI.click(findTestObject('Object Repository/TC_Amazon_Home_003_OR/Page_Amazon.com. Spend less. Smile more/span_Hello, sign in'))

//WebUI.setText(findTestObject('Object Repository/TC_Amazon_Home_003_OR/Page_Amazon Sign-In/input_email'), 'gummallajahnavi2002@gmail.com')

//WebUI.click(findTestObject('Object Repository/TC_Amazon_Home_003_OR/Page_Amazon Sign-In/inputcontinue'))

//WebUI.setEncryptedText(findTestObject('Object Repository/TC_Amazon_Home_003_OR/Page_Amazon Sign-In/input_password'), 'RY21l9ks7eId//V36v5VDA==')

//WebUI.click(findTestObject('Object Repository/TC_Amazon_Home_003_OR/Page_Amazon Sign-In/inputsignInSubmit'))

WebUI.selectOptionByValue(findTestObject('Object Repository/TC_Amazon_Home_003_OR/Page_Amazon.com. Spend less. Smile more/select_All Departments        Arts  Crafts _135c92'), 
    'search-alias=fashion-girls-intl-ship', true)

WebUI.setText(findTestObject('Object Repository/TC_Amazon_Home_003_OR/Page_Amazon.com. Spend less. Smile more/input_field-keywords'), 
    'lipstick')

WebUI.click(findTestObject('Object Repository/TC_Amazon_Home_003_OR/Page_Amazon.com. Spend less. Smile more/inputnav-search-submit-button'))

WebUI.click(findTestObject('Object Repository/TC_Amazon_Home_003_OR/Page_Amazon.com  lipstick/img_s-image'))

WebUI.click(findTestObject('Object Repository/TC_Amazon_Home_003_OR/Page_Amazon.com  LOreal Paris Makeup Colour_cd333f/input_submit.add-to-registry.wishlist'))

WebUI.click(findTestObject('Object Repository/TC_Amazon_Home_003_OR/Page_Amazon.com  LOreal Paris Makeup Colour_cd333f/a_View Your List'))

//WebUI.closeBrowser()

