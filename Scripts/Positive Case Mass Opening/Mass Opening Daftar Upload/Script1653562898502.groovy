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

WebUI.setText(findTestObject('Object Repository/Daftar Upload/Page_Login/input_DEV_txtUserName'), username)

WebUI.setText(findTestObject('Object Repository/Daftar Upload/Page_Login/input_DEV_txtPassword'), password)

WebUI.click(findTestObject('Object Repository/Daftar Upload/Page_Login/input_DEV_btnLogin'))

WebUI.setText(findTestObject('Object Repository/Daftar Upload/Page_Login/input_DEV_txtUserName'), '0020014')

WebUI.setEncryptedText(findTestObject('Object Repository/Daftar Upload/Page_Login/input_DEV_txtPassword'), 'VeI8NZyU+J+552F+WD0EDQ==')

WebUI.click(findTestObject('Object Repository/Daftar Upload/Page_Login/input_DEV_btnLogin'))

WebUI.click(findTestObject('Object Repository/Daftar Upload/Page_DEV Agro Banking System/a_Demand Deposit'))

WebUI.click(findTestObject('Object Repository/Daftar Upload/Page_DEV Agro Banking System/a_Pembukaan Rekening Massal'))

WebUI.click(findTestObject('Object Repository/Daftar Upload/Page_DEV Agro Banking System/a_Daftar Upload'))

switch (cases.toString()) {
	
    case 'positive':
	
        WebUI.setText(findTestObject('Object Repository/Daftar Upload/Page_DEV Agro Banking System/input__txtTanggal'), 
            tanggal)

        WebUI.click(findTestObject('Object Repository/Daftar Upload/Page_DEV Agro Banking System/input__btnView'))

        WebUI.click(findTestObject('Object Repository/Daftar Upload/Page_DEV Agro Banking System/a_1'))

        WebUI.delay(5)

        WebUI.click(findTestObject('Object Repository/Daftar Upload/Page_DEV Agro Banking System/a_2'))

        WebUI.delay(5)

        WebUI.click(findTestObject('Object Repository/Daftar Upload/Page_DEV Agro Banking System/a_3'))

        WebUI.delay(5)

        WebUI.click(findTestObject('Object Repository/Daftar Upload/Page_DEV Agro Banking System/a_4'))

        WebUI.delay(5)

        WebUI.click(findTestObject('Object Repository/Daftar Upload/Page_DEV Agro Banking System/a_5'))

        WebUI.delay(5)

        WebUI.click(findTestObject('Object Repository/Daftar Upload/Page_DEV Agro Banking System/input_Nomor Handphone belum terdaftar_btnBack3'))

        break
		
    case 'negative1':
	
		WebUI.clearText(findTestObject('Daftar Upload/Page_DEV Agro Banking System/input__txtTanggal'))
		
		WebUI.setText(findTestObject('Object Repository/Daftar Upload/Page_DEV Agro Banking System/input__txtTanggal'),
			tanggal)
		
		
		
		
	
        break
        
}

WebUI.click(findTestObject('Object Repository/Daftar Upload/Page_DEV Agro Banking System/a_Logout'))

WebUI.closeBrowser()

