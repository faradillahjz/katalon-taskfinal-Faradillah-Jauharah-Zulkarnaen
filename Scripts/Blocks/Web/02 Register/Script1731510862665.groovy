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

'step 1'
WebUI.click(findTestObject('Object Repository/Web/TC-01- Web Login/a_Not yet a customer'))

'step 2'
WebUI.setText(findTestObject('Object Repository/Web/TC-01- Web Login/input_User_Email'), email)

'step 3'
WebUI.setEncryptedText(findTestObject('Object Repository/Web/TC-01- Web Login/input_User_Password'), password1)

'step 4'
WebUI.setEncryptedText(findTestObject('Object Repository/Web/TC-01- Web Login/input_User_Password2'), password2)

'step 5'
WebUI.click(findTestObject('Object Repository/Web/TC-01- Web Login/span_Repeat_Password'))

'step 6'
WebUI.click(findTestObject('Object Repository/Web/TC-01- Web Login/span_Password_Advice'))

'step 7'
WebUI.click(findTestObject('Object Repository/Web/TC-01- Web Login/span_Security_Word'))

'step 8'
WebUI.setText(findTestObject('Object Repository/Web/TC-01- Web Login/input_Security_Word'), booktittle)

'step 9'
WebUI.click(findTestObject('Object Repository/Web/TC-01- Web Login/span_Register'))

