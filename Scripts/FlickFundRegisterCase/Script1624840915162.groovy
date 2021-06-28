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

WebUI.navigateToUrl('https://fund.staging.flick.id/')

WebUI.click(findTestObject('Object Repository/FlickFundRegister_OR/Page_FlickFund/svg_Home_MuiSvgIcon-root MuiSvgIcon-fontSiz_c05ded'))

WebUI.click(findTestObject('Object Repository/FlickFundRegister_OR/Page_FlickFund/strong_Log in'))

WebUI.click(findTestObject('Object Repository/FlickFundRegister_OR/Page_FlickFund/strong_Register'))

WebUI.setText(findTestObject('Object Repository/FlickFundRegister_OR/Page_FlickFund/input_Register asFunder_MuiInputBase-input _4020c5'), 
    'Achmad Fikry')

WebUI.setText(findTestObject('Object Repository/FlickFundRegister_OR/Page_FlickFund/input_Register asFunder_MuiInputBase-input _4020c5_1'), 
    'aff081096@gmail.com')

WebUI.setText(findTestObject('Object Repository/FlickFundRegister_OR/Page_FlickFund/input_Register asFunder_MuiInputBase-input _eb82ed'), 
    '89670755821')

WebUI.setEncryptedText(findTestObject('Object Repository/FlickFundRegister_OR/Page_FlickFund/input_Register asFunder_MuiInputBase-input _4020c5_1_2'), 
    'D4DFqMLFpvXad20HiWwOiA==')

WebUI.setText(findTestObject('Object Repository/FlickFundRegister_OR/Page_FlickFund/input_Register asFunder_MuiInputBase-input _eb82ed'), 
    '123456789')

WebUI.setText(findTestObject('Object Repository/FlickFundRegister_OR/Page_FlickFund/input_Register asFunder_MuiInputBase-input _4020c5'), 
    'Achmad Fikry')

WebUI.click(findTestObject('Object Repository/FlickFundRegister_OR/Page_FlickFund/body_HomeHow It WorksAbout UsFAQLog inFund _f4c226'))

WebUI.click(findTestObject('Object Repository/FlickFundRegister_OR/Page_FlickFund/li_Bank Mandiri'))

WebUI.click(findTestObject('Object Repository/FlickFundRegister_OR/Page_FlickFund/input_Bank Mandiri_jss228'))

WebUI.click(findTestObject('Object Repository/FlickFundRegister_OR/Page_FlickFund/strong_Create Account'))

WebUI.click(findTestObject('Object Repository/FlickFundRegister_OR/Page_FlickFund/span_Close'))

WebUI.closeBrowser()

