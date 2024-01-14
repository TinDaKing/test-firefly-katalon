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

WebUI.callTestCase(findTestCase('Log in'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Whats playing  Firefly III/span_pull-right-container'))

WebUI.click(findTestObject('Object Repository/Page_Whats playing  Firefly III/span_Recurring transactions'))

WebUI.click(findTestObject('Object Repository/Page_Recurring transactions  Firefly III/a_Create a recurring transaction'))

WebUI.setText(findTestObject('Page_Create new recurring transaction  Recu_5308fa/input_title'), 'aej24s')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create new recurring transaction  Recu_5308fa/select_Repeat foreverRepeat until dateRepea_4f389d'), 
    'until_date', true)

WebUI.setText(findTestObject('Page_Create new recurring transaction  Recurring transactions  Firefly III/input_Repeat until_repeat_until'), 
    '02/03/2023')

WebUI.setText(findTestObject('Page_Create new recurring transaction  Recu_5308fa/input_transaction_description'), 'abcd7852')

WebUI.setText(findTestObject('Page_Create new recurring transaction  Recu_5308fa/input_amount'), '3')

WebUI.click(findTestObject('Object Repository/Page_Create new recurring transaction  Recu_5308fa/button_Store recurring transaction'))

WebUI.verifyTextPresent('The repeat until must be a date after ', false)

WebUI.closeBrowser()

