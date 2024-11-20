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
Mobile.startApplication('C:\\Users\\ASUS_X441M\\Katalon Studio\\Final Project\\APK\\Todo_2.0_APKPure.apk', true)

'step 2'
Mobile.tap(findTestObject('Object Repository/Mobile/TC-01- Create Task/android.widget.Button - Oke'), 0)

'step 3'
Mobile.tap(findTestObject('Object Repository/Mobile/TC-01- Create Task/android.widget.TextView - Skip'), 0)

'step 4'
Mobile.tap(findTestObject('Object Repository/Mobile/TC-01- Create Task/android.widget.ImageButton'), 0)

'step 5'
Mobile.setText(findTestObject('Object Repository/Mobile/TC-01- Create Task/android.widget.EditText - Enter task title'), 
    TaskTitle, 0)

'step 6'
Mobile.setText(findTestObject('Object Repository/Mobile/TC-01- Create Task/android.widget.EditText - Enter your task'), 
    EnterYourTask, 0)

'step 7'
Mobile.tap(findTestObject('Object Repository/Mobile/TC-01- Create Task/android.widget.EditText - Set Date'), 0)

'step 8'
Mobile.tap(findTestObject('Object Repository/Mobile/TC-01- Create Task/android.view.View - 14'), 0)

'step 9'
Mobile.tap(findTestObject('Object Repository/Mobile/TC-01- Create Task/android.widget.Button - OKE Date'), 0)

'step 10'
Mobile.tap(findTestObject('Object Repository/Mobile/TC-01- Create Task/android.widget.EditText - Set Time'), 0)

'step 11'
Mobile.tap(findTestObject('Object Repository/Mobile/TC-01- Create Task/android.widget.RadialTimePickerViewRadialPickerTouchHelper'), 
    0)

'step 12'
Mobile.tap(findTestObject('Object Repository/Mobile/TC-01- Create Task/android.widget.RadioButton - PM'), 0)

'step 13'
Mobile.tap(findTestObject('Object Repository/Mobile/TC-01- Create Task/android.widget.Button - OKE Time'), 0)

'step 14'
Mobile.tap(findTestObject('Object Repository/Mobile/TC-01- Create Task/android.widget.Spinner'), 0)

//Mobile.tap(findTestObject('Object Repository/Mobile/TC-01- Create Task/android.widget.CheckedTextView - Banking'), 0)
'step 15'
def spinner = category

switch (spinner) {
    case spinner = 'Banking':
        println(spinner)

        Mobile.tap(findTestObject('Object Repository/Mobile/TC-01- Create Task/android.widget.CheckedTextView - Banking'), 
            0)

        break
    case spinner = 'Business':
        println(spinner)

        Mobile.tap(findTestObject('Object Repository/Mobile/TC-01- Create Task/android.widget.CheckedTextView - Business'), 
            0)

        break
    case spinner = 'Insurance':
        println(spinner)

        Mobile.tap(findTestObject('Object Repository/Mobile/TC-01- Create Task/android.widget.CheckedTextView - Insurance'), 
            0)

        break
    case spinner = 'Personal':
        println(spinner)

        Mobile.tap(findTestObject('Object Repository/Mobile/TC-01- Create Task/android.widget.CheckedTextView - Personal'), 
            0)

        break
    case spinner = 'Shopping':
        println(spinner)

        Mobile.tap(findTestObject('Object Repository/Mobile/TC-01- Create Task/android.widget.CheckedTextView - Shopping'), 
            0)

        break
    default:
        println(spinner)

        Mobile.tap(findTestObject('Object Repository/Mobile/TC-01- Create Task/android.widget.CheckedTextView - Banking'), 
            0)

        break
}

'step 16'
Mobile.tap(findTestObject('Mobile/TC-01- Create Task/android.widget.TextView - Checklist'), 0)

'step 17'
Mobile.verifyElementVisible(findTestObject('Mobile/TC-01- Create Task/android.widget.TextView - Todo'), 0)

'step 18'
Mobile.closeApplication()

