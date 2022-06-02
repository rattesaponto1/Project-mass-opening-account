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


	WebUI.setText(findTestObject('Object Repository/Login/Page_Login/UserName'),username)

	WebUI.setText(findTestObject('Object Repository/Login/Page_Login/Password'),password)
	
	WebUI.click(findTestObject('Object Repository/Mass Opening Upload/Page_Login/btnLogin'))


if (WebUI.verifyElementPresent(findTestObject('Object Repository/Mass Opening Upload/Page_DEV Agro Banking System/Menu Demand Deposit'),
	0, FailureHandling.OPTIONAL)) {

	WebUI.click(findTestObject('Object Repository/Mass Opening Upload/Page_DEV Agro Banking System/Menu Demand Deposit'))

} else {
   
	WebUI.setText(findTestObject('Object Repository/Mass Opening Upload/Page_Login/UserName'), usernameSYS)
	
	WebUI.setText(findTestObject('Object Repository/Mass Opening Upload/Page_Login/Password'), passwordSYS)
	
	WebUI.click(findTestObject('Object Repository/Mass Opening Upload/Page_Login/btnLogin'))
	
	WebUI.click(findTestObject('Object Repository/Mass Opening Upload/SYS/Menu Administration'))
	
	WebUI.click(findTestObject('Object Repository/Mass Opening Upload/SYS/Sub Pemeliharaan Pengguna v2'))
	
	WebUI.selectOptionByValue(findTestObject('Object Repository/Mass Opening Upload/SYS/Branch ID'),
		'0020', true)
	
	WebUI.click(findTestObject('Object Repository/Mass Opening Upload/SYS/btnSubmit'))
	
	WebUI.click(findTestObject('Object Repository/Mass Opening Upload/SYS/Pilih 8'))
	
	
	WebUI.click(findTestObject('Object Repository/Mass Opening Upload/SYS/btnRelease'))
	
	WebUI.click(findTestObject('Object Repository/Mass Opening Upload/SYS/btnOK'))
	
	WebUI.acceptAlert()
	
	WebUI.switchToDefaultContent()
	
	WebUI.click(findTestObject('Object Repository/Mass Opening Upload/Page_DEV Agro Banking System/Logout'))
	
	WebUI.setText(findTestObject('Object Repository/Mass Opening Upload/Page_Login/UserName'), username)
	
	WebUI.setText(findTestObject('Object Repository/Mass Opening Upload/Page_Login/Password'), password)
	
	WebUI.click(findTestObject('Object Repository/Mass Opening Upload/Page_Login/btnLogin'))
	
	WebUI.click(findTestObject('Object Repository/Mass Opening Upload/Page_DEV Agro Banking System/Menu Demand Deposit'))
	
}

