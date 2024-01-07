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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demo.firefly-iii.org/login')

WebUI.click(findTestObject('Object Repository/Page_Login to Firefly III/label_Remember me'))

WebUI.click(findTestObject('Object Repository/Page_Login to Firefly III/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_Whats playing  Firefly III/a_Automation'))

WebUI.click(findTestObject('Object Repository/Page_Whats playing  Firefly III/span_Recurring transactions'))

WebUI.click(findTestObject('Object Repository/Page_Recurring transactions  Firefly III/a_Create a recurring transaction'))

WebUI.setText(findTestObject('Object Repository/Page_Create new recurring transaction  Recu_5308fa/input_title'), 'abdsr')

WebUI.setText(findTestObject('Object Repository/Page_Create new recurring transaction  Recu_5308fa/input_transaction_description'), 
    'asffwa2')

WebUI.setText(findTestObject('Object Repository/Page_Create new recurring transaction  Recu_5308fa/input_amount'), '5.98')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create new recurring transaction  Recu_5308fa/select_(no currency)Euro ()Hungarian forint_850ea1'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create new recurring transaction  Recu_5308fa/select_(no currency)Euro ()Hungarian forint_850ea1'), 
    '2', true)

WebUI.setText(findTestObject('Object Repository/Page_Create new recurring transaction  Recu_5308fa/input_foreign_amount'), 
    '1023.4')

WebUI.click(findTestObject('Object Repository/Page_Create new recurring transaction  Recu_5308fa/button_Store recurring transaction'))

