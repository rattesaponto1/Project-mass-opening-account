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

WebUI.callTestCase(findTestCase('Login'), [('username') : '0020014', ('password') : '00000000', ('usernameSYS') : 'SYS', ('passwordSYS') : '00000000'], 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Daftar Upload/Page_DEV Agro Banking System/a_Pembukaan Rekening Massal'))

WebUI.click(findTestObject('Object Repository/Daftar Upload/Page_DEV Agro Banking System/a_Daftar Upload'))

WebUI.setText(findTestObject('Object Repository/Daftar Upload/Page_DEV Agro Banking System/input__txtTanggal'), tanggal)

WebUI.click(findTestObject('Object Repository/Daftar Upload/Page_DEV Agro Banking System/input__btnView'))

if (WebUI.verifyElementPresent(findTestObject('Daftar Upload/Page_DEV Agro Banking System/Header/th_No Id'), 0, FailureHandling.OPTIONAL)) {
    WebUI.comment('No Id tersedia')

    if (WebUI.verifyElementPresent(findTestObject('Daftar Upload/Page_DEV Agro Banking System/a_1'), 0, FailureHandling.OPTIONAL)) {
        
		WebUI.click(findTestObject('Object Repository/Daftar Upload/Page_DEV Agro Banking System/a_1'))

        if (WebUI.verifyElementPresent(findTestObject('Daftar Upload/Error message/Tanggal Lahir tidak valid'), 0, FailureHandling.OPTIONAL)) {
           
			WebUI.scrollToElement(findTestObject('Daftar Upload/Page_DEV Agro Banking System/th_Kelurahan'), 0)

            WebUI.comment('test case berhasil')
			
			WebUI.switchToDefaultContent()
			
			WebUI.click(findTestObject('Object Repository/Daftar Upload/Page_DEV Agro Banking System/a_Logout'))
			
        } else {
			
            WebUI.comment('test case tidak terpenuhi failed')
			
        }
		
    } else if (WebUI.verifyElementPresent(findTestObject('Daftar Upload/Page_DEV Agro Banking System/a_2'), 0, FailureHandling.OPTIONAL)) {
        
		WebUI.click(findTestObject('Object Repository/Daftar Upload/Page_DEV Agro Banking System/a_2'))
		
		
		if (WebUI.verifyElementPresent(findTestObject('Daftar Upload/Error message/Tanggal Lahir tidak valid'), 0, FailureHandling.OPTIONAL)) {
			
			 WebUI.scrollToElement(findTestObject('Daftar Upload/Page_DEV Agro Banking System/th_Kelurahan'), 0)
 
			 WebUI.comment('test case berhasil')
			 
			 WebUI.switchToDefaultContent()
			 
			 WebUI.click(findTestObject('Object Repository/Daftar Upload/Page_DEV Agro Banking System/a_Logout'))
			 
		 } else {
			 
			 WebUI.comment('test case tidak terpenuhi failed')
			 
		 }
    
	} else if (WebUI.verifyElementPresent(findTestObject('Daftar Upload/Page_DEV Agro Banking System/a_3'), 0, FailureHandling.OPTIONAL)) {
        
		WebUI.click(findTestObject('Object Repository/Daftar Upload/Page_DEV Agro Banking System/a_3'))
		
		if (WebUI.verifyElementPresent(findTestObject('Daftar Upload/Error message/Tanggal Lahir tidak valid'), 0, FailureHandling.OPTIONAL)) {
			
			 WebUI.scrollToElement(findTestObject('Daftar Upload/Page_DEV Agro Banking System/th_Kelurahan'), 0)
 
			 WebUI.comment('test case berhasil')
			 
			 WebUI.switchToDefaultContent()
			 
			 WebUI.click(findTestObject('Object Repository/Daftar Upload/Page_DEV Agro Banking System/a_Logout'))
			 
		 } else {
			 
			 WebUI.comment('test case tidak terpenuhi failed')
			 
		 }
    
	} else if (WebUI.verifyElementPresent(findTestObject('Daftar Upload/Page_DEV Agro Banking System/a_4'), 0, FailureHandling.OPTIONAL)) {
        
		WebUI.click(findTestObject('Object Repository/Daftar Upload/Page_DEV Agro Banking System/a_4'))
		
		if (WebUI.verifyElementPresent(findTestObject('Daftar Upload/Error message/Tanggal Lahir tidak valid'), 0, FailureHandling.OPTIONAL)) {
			
			 WebUI.scrollToElement(findTestObject('Daftar Upload/Page_DEV Agro Banking System/th_Kelurahan'), 0)
 
			 WebUI.comment('test case berhasil')
			 
			 WebUI.switchToDefaultContent()
			 
			 WebUI.click(findTestObject('Object Repository/Daftar Upload/Page_DEV Agro Banking System/a_Logout'))
			 
		 } else {
			 
			 WebUI.comment('test case tidak terpenuhi failed')
			 
		 }
    
	} else if (WebUI.verifyElementPresent(findTestObject('Daftar Upload/Page_DEV Agro Banking System/a_5'), 0, FailureHandling.OPTIONAL)) {
        
		WebUI.click(findTestObject('Object Repository/Daftar Upload/Page_DEV Agro Banking System/a_5'))
		
		if (WebUI.verifyElementPresent(findTestObject('Daftar Upload/Error message/Tanggal Lahir tidak valid'), 0, FailureHandling.OPTIONAL)) {
			
			 WebUI.scrollToElement(findTestObject('Daftar Upload/Page_DEV Agro Banking System/th_Kelurahan'), 0)
 
			 WebUI.comment('test case berhasil')
			 
			 WebUI.switchToDefaultContent()
			 
			 WebUI.click(findTestObject('Object Repository/Daftar Upload/Page_DEV Agro Banking System/a_Logout'))
			 
		 } else {
			 
			 WebUI.comment('test case tidak terpenuhi failed')
			 
		 }
    
	} else {
		
        WebUI.comment('Halaman tidak tersedia')
    }
} else {
	
    WebUI.switchToDefaultContent()

    WebUI.click(findTestObject('Object Repository/Daftar Upload/Page_DEV Agro Banking System/a_Logout'))
}

WebUI.closeBrowser()

