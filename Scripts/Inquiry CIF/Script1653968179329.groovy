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

WebUI.navigateToUrl('http://172.31.1.93:9000/')

WebUI.callTestCase(findTestCase('Login'), [:], FailureHandling.OPTIONAL)

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/CIF/Inquiry CIF/Page_Login/input_DEV_btnLogin'))

WebUI.click(findTestObject('Object Repository/CIF/Inquiry CIF/Page_DEV Agro Banking System/Menu CIF'))

WebUI.click(findTestObject('Object Repository/CIF/Inquiry CIF/Page_DEV Agro Banking System/btnSearch'))

// Cari CIF

WebUI.switchToWindowTitle('Pencarian CIF')

WebUI.setText(findTestObject('Object Repository/CIF/Inquiry CIF/Page_Pencarian CIF/input__txtNama'), 'Rattesa')

WebUI.click(findTestObject('Object Repository/CIF/Inquiry CIF/Page_Pencarian CIF/input__btnCari'))

WebUI.click(findTestObject('Object Repository/CIF/Inquiry CIF/Page_Pencarian CIF/a_Pilih'))

WebUI.switchToWindowTitle('[DEV] Agro Banking System')

WebUI.click(findTestObject('Object Repository/CIF/Inquiry CIF/Page_DEV Agro Banking System/input__Button1'))

WebUI.click(findTestObject('Object Repository/CIF/Inquiry CIF/Page_DEV Agro Banking System/a_Personal Info 1'))

WebUI.click(findTestObject('Object Repository/CIF/Inquiry CIF/Page_DEV Agro Banking System/a_Personal Info 2'))

WebUI.click(findTestObject('Object Repository/CIF/Inquiry CIF/Page_DEV Agro Banking System/a_Job Info'))

WebUI.click(findTestObject('Object Repository/CIF/Inquiry CIF/Page_DEV Agro Banking System/a_Finansial Info'))

WebUI.click(findTestObject('Object Repository/CIF/Inquiry CIF/Page_DEV Agro Banking System/a_Fatca  CRS Info'))

WebUI.click(findTestObject('Object Repository/CIF/Inquiry CIF/Page_DEV Agro Banking System/input__btnPrint1'))

WebUI.closeBrowser()

