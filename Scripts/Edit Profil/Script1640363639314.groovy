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

Mobile.startApplication('/Users/kb-fmf-kpm/Downloads/ECommerce -SAMPLE-Android.apk', true)

Mobile.tap(findTestObject('Object Repository/Profil 2/android.widget.FrameLayout'), 0)

Mobile.tap(findTestObject('Object Repository/Profil 2/android.widget.TextView - EDIT'), 0)

Mobile.tap(findTestObject('Object Repository/Profil 2/android.widget.RelativeLayout'), 0)

Mobile.setText(findTestObject('Object Repository/Profil 2/android.widget.EditText - Your Name'), 'asura', 0)

Mobile.tap(findTestObject('Object Repository/Profil 2/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/Profil 2/android.widget.RelativeLayout (1)'), 0)

Mobile.setText(findTestObject('Object Repository/Profil 2/android.widget.EditText - your.emailgmail.com'), 'asura@gmail.com', 
    0)

Mobile.tap(findTestObject('Profil 2/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/Profil 2/android.widget.RelativeLayout (2)'), 0)

Mobile.setText(findTestObject('Object Repository/Profil 2/android.widget.EditText - 628123456789'), '0813877777000', 0)

Mobile.tap(findTestObject('Profil 2/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/Profil 2/android.widget.RelativeLayout (3)'), 0)

Mobile.setText(findTestObject('Object Repository/Profil 2/android.widget.EditText - Your Address'), 'jalani bersama dia', 
    0)

Mobile.tap(findTestObject('Profil 2/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/Profil 2/android.widget.ImageButton'), 0)

WebUI.verifyMatch('asura', 'asura', 0 == 0)

WebUI.verifyMatch('asura@gmail.com', 'asura@gmail.com', 0 == 0)

WebUI.verifyMatch('0813877777000', '0813877777000', 0 == 0)

WebUI.verifyMatch('jalani bersama dia', 'jalani bersama dia', 0 == 0)

WebUI.delay(5)

Mobile.closeApplication()

