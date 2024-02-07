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

//WebUI.click(findTestObject('Object Repository/TC_Amazon_Home_005_OR/Page_Amazon.com. Spend less. Smile more/span_Hello, sign in'))

//WebUI.setText(findTestObject('Object Repository/TC_Amazon_Home_005_OR/Page_Amazon Sign-In/input_email'), 'gummallajahnavi2002@gmail.com')

//WebUI.click(findTestObject('Object Repository/TC_Amazon_Home_005_OR/Page_Amazon Sign-In/inputcontinue'))

//WebUI.setEncryptedText(findTestObject('Object Repository/TC_Amazon_Home_005_OR/Page_Amazon Sign-In/input_password'), 'RY21l9ks7eId//V36v5VDA==')

//WebUI.click(findTestObject('Object Repository/TC_Amazon_Home_005_OR/Page_Amazon Sign-In/inputsignInSubmit'))

WebUI.click(findTestObject('Object Repository/TC_Amazon_Home_005_OR/Page_Amazon.com. Spend less. Smile more/input_field-keywords'))

WebUI.click(findTestObject('Object Repository/TC_Amazon_Home_005_OR/Page_Amazon.com. Spend less. Smile more/span_valentines day gifts for her'))

WebUI.click(findTestObject('Object Repository/TC_Amazon_Home_005_OR/Page_Amazon.com  valentines day gifts for her/span_ASELFAD Preserved Real Red Rose with I_147d3e'))

WebUI.click(findTestObject('Object Repository/TC_Amazon_Home_005_OR/Page_Amazon.com ASELFAD Preserved Real Red _9e0ee3/span_5,687 ratings'))

WebUI.verifyElementText(findTestObject('Object Repository/TC_Amazon_Home_005_OR/Page_Amazon.com ASELFAD Preserved Real Red _9e0ee3/h3_Top reviews from the United States'), 
    'Top reviews from the United States')

//WebUI.closeBrowser()

