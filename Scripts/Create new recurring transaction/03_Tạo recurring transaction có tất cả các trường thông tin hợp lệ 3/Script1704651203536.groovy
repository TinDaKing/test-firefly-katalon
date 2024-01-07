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

WebUI.click(findTestObject('Object Repository/Page_Whats playing  Firefly III/a_Automation'))

WebUI.click(findTestObject('Object Repository/Page_Whats playing  Firefly III/span_Recurring transactions'))

WebUI.click(findTestObject('Object Repository/Page_Recurring transactions  Firefly III/a_Create a recurring transaction'))

WebUI.setText(findTestObject('Object Repository/Page_Create new recurring transaction  Recu_5308fa/input_title'), Name)

WebUI.setText(findTestObject('Object Repository/Page_Create new recurring transaction  Recu_5308fa/input_skip'), Skip)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create new recurring transaction  Recu_5308fa/select_Repeat foreverRepeat until dateRepea_4f389d'), 
    'times', true)

WebUI.setText(findTestObject('Object Repository/Page_Create new recurring transaction  Recu_5308fa/input_repetitions'), 
    Repetitions)

WebUI.click(findTestObject('Object Repository/Page_Create new recurring transaction  Recu_5308fa/a_Transfer'))

WebUI.setText(findTestObject('Object Repository/Page_Create new recurring transaction  Recu_5308fa/input_transaction_description'), 
    Transaction_description)

WebUI.setText(findTestObject('Object Repository/Page_Create new recurring transaction  Recu_5308fa/input_amount'), Amount)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create new recurring transaction  Recu_5308fa/select_Cash walletChecking AccountChecking _ec45d6'), 
    '4', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create new recurring transaction  Recu_5308fa/select_(none)Fusce porta arcu sit amet ex t_bd1977'), 
    Piggy_bank, true)

WebUI.click(findTestObject('Object Repository/Page_Create new recurring transaction  Recu_5308fa/button_Store recurring transaction'))

WebUI.verifyElementVisible(findTestObject('Page_Recurring transactions  Firefly III/div_CloseSuccessRecurring transaction sdgag stored successfully'))

WebUI.closeBrowser()

