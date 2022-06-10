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

WebUI.setText(findTestObject('Object Repository/Login/Page_Login/UserName'), username)

WebUI.setText(findTestObject('Object Repository/Login/Page_Login/Password'), password)

WebUI.click(findTestObject('Object Repository/Login/Page_Login/btnLogin'))

// Menu General

WebUI.click(findTestObject('Object Repository/Mass Opening SPV/Approve SPV/General'))

WebUI.click(findTestObject('Object Repository/Mass Opening SPV/Approve SPV/ApproveReject Dual Control'))

switch (pilihDetail.toString()) {
	
    case 'detail1':
	
        WebUI.verifyTextPresent('117251', true, FailureHandling.CONTINUE_ON_FAILURE)

        WebUI.click(findTestObject('Object Repository/Mass Opening SPV/Approve SPV/detail'))

        switch (actionSPV.toString()) {
			
            case 'accept':
			
                WebUI.click(findTestObject('Object Repository/Mass Opening SPV/Approve SPV/btnAccept'))
				
				WebUI.acceptAlert()

                break
				
            case 'reject':
			
                WebUI.click(findTestObject('Mass Opening SPV/Approve SPV/btnReject'))
				
				WebUI.acceptAlert()

                break
        }
	        
        break
		
	 case 'detail2':
	 
	 	WebUI.verifyTextPresent('117198', true, FailureHandling.CONTINUE_ON_FAILURE)
		 
		WebUI.click(findTestObject('Object Repository/Mass Opening SPV/Approve SPV/detail')) 
		
		
		switch (actionSPV.toString()) {
			
			case 'accept':
			
				WebUI.click(findTestObject('Object Repository/Mass Opening SPV/Approve SPV/btnAccept'))
				
				WebUI.acceptAlert()

				break
				
			case 'reject':
			
				WebUI.click(findTestObject('Mass Opening SPV/Approve SPV/btnReject'))
				
				WebUI.acceptAlert()

				break
		}
		
		break
}

//WebUI.click(findTestObject('Object Repository/Mass Opening SPV/Approve SPV/input_Approval Comment_btnBack'))

//WebUI.click(findTestObject('Object Repository/Mass Opening SPV/Approve SPV/detail'))

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Object Repository/Mass Opening SPV/Approve SPV/Logout'))

