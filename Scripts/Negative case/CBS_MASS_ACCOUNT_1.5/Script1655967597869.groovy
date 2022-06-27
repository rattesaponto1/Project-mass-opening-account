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

WebUI.navigateToUrl(url)

WebUI.maximizeWindow(FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('Login'), [('username') : '0020014', ('password') : '00000000', ('usernameSYS') : 'SYS', ('passwordSYS') : '00000000'], 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Mass Opening Upload/Page_DEV Agro Banking System/Sub Menu_Pembukaan Rekening Massal'))

WebUI.click(findTestObject('Object Repository/Mass Opening Upload/Page_DEV Agro Banking System/Upload Baru'))

WebUI.uploadFile(findTestObject('Mass Opening Upload/Page_DEV Agro Banking System/Choose File'), 'C:\\Users\\Owner\\Downloads\\Format.xlsx')

// Product Type 00069,00070,00071
WebUI.selectOptionByValue(findTestObject('Mass Opening Upload/Page_DEV Agro Banking System/product Type'), productType, 
    true)

if (WebUI.verifyOptionSelectedByValue(findTestObject('Mass Opening Upload/Page_DEV Agro Banking System/product Type'), '00005', 
    false, 0, FailureHandling.OPTIONAL)) {
    WebUI.comment('Product Type 00005')

    WebUI.comment('Negative case success')
} else {
    WebUI.comment('Product Type bukan 00005')
}

//Kode Officer
WebUI.selectOptionByValue(findTestObject('Object Repository/Mass Opening Upload/Page_DEV Agro Banking System/Kode Officer'), 
    officer, true)

WebUI.click(findTestObject('Object Repository/Mass Opening Upload/Page_DEV Agro Banking System/btn_cari Referral'))

WebUI.switchToWindowTitle('Cari NIK Karyawan')

switch (referral.toString()) {
    case 'USERNAME':
        WebUI.selectOptionByValue(findTestObject('Object Repository/Mass Opening Upload/Page_Cari NIK Karyawan_Referral/select_NAMAKODE'), 
            'USERNAME', true)

        WebUI.setText(findTestObject('Object Repository/Mass Opening Upload/Page_Cari NIK Karyawan_Referral/kata kunci'), 
            'Agus')

        WebUI.click(findTestObject('Object Repository/Mass Opening Upload/Page_Cari NIK Karyawan_Referral/btnCari'))

        WebUI.click(findTestObject('Object Repository/Mass Opening Upload/Page_Cari NIK Karyawan_Referral/Pilih'))

        break
    case 'USERID':
        WebUI.selectOptionByValue(findTestObject('Object Repository/Mass Opening Upload/Page_Cari NIK Karyawan_Referral/select_NAMAKODE'), 
            'USERID', true)

        WebUI.setText(findTestObject('Object Repository/Mass Opening Upload/Page_Cari NIK Karyawan_Referral/kata kunci'), 
            'Agus')

        WebUI.click(findTestObject('Object Repository/Mass Opening Upload/Page_Cari NIK Karyawan_Referral/btnCari'))

        switch (pilihan.toString()) {
            case 'pilih1':
                WebUI.click(findTestObject('Object Repository/Mass Opening Upload/Page_Cari NIK Karyawan_Referral/Pilih'))

                break
            case 'pilih2':
                WebUI.click(findTestObject('Object Repository/Mass Opening Upload/Page_Cari NIK Karyawan_Referral/Pilih 2'))

                break
        }
        
        WebUI.click(findTestObject('Object Repository/Mass Opening Upload/Page_Cari NIK Karyawan_Referral/Pilih'))

        break
}

WebUI.switchToWindowTitle('[DEV] Agro Banking System')

// SPV
WebUI.selectOptionByValue(findTestObject('Object Repository/Mass Opening Upload/Page_DEV Agro Banking System/SPV'), spv, 
    true)

WebUI.click(findTestObject('Object Repository/Mass Opening Upload/Page_DEV Agro Banking System/btnUpload'))

WebUI.acceptAlert()

//WebUI.click(findTestObject('Object Repository/Mass Opening Upload/Page_DEV Agro Banking System/btnPrint'))
//WebUI.switchToWindowTitle('172.31.1.93:9000//NONMONETARY/DataStatis.aspx')
//WebUI.acceptAlert()
//WebUI.switchToWindowTitle('[DEV] Agro Banking System')
//WebUI.click(findTestObject('Object Repository/Mass Opening Upload/Page_DEV Agro Banking System/input__btnBack2'))
WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Object Repository/Mass Opening Upload/Page_DEV Agro Banking System/Logout'))

WebUI.closeBrowser()

