import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dev.uangteman.com')

WebUI.maximizeWindow()

WebUI.scrollToElement(findTestObject('Web/Page_UangTeman.com Pinjaman online/a_Pinjaman Online'), 1)

WebUI.click(findTestObject('Web/Page_UangTeman.com Pinjaman online/a_Pinjaman Online'))

WebUI.click(findTestObject('Web/Page_UangTeman.com Pinjaman online/a_Status Pinjaman'))

WebUI.click(findTestObject('Web/Page_UangTeman.com Pinjaman online/a_Pinjaman Online'))

WebUI.click(findTestObject('Web/Page_UangTeman.com Pinjaman online/a_ajukan pinjaman'))

WebUI.scrollToElement(findTestObject('Web/Page_/a_PINJAM SEKARANG'), 0)

WebUI.click(findTestObject('Web/Page_/a_PINJAM SEKARANG'))

WebUI.click(findTestObject('Web/Page_UangTeman.com Pinjaman online (1)/p_Syarat dan KetentuanPengguna'))

WebUI.click(findTestObject('Web/Page_UangTeman.com Pinjaman online (1)/button_Saya Setuju dengan Syar'))

WebUI.waitForElementVisible(findTestObject('Web/Page_UangTeman.com Pinjaman online (1)/input_ap_email_address'), 1)

WebUI.sendKeys(findTestObject('Web/Page_UangTeman.com Pinjaman online (1)/input_ap_email_address'), 'testerautomation2@mailinator.com')

WebUI.setText(findTestObject('Web/Page_UangTeman.com Pinjaman online (1)/input_ap_mobile_no'), '82258030300')

WebUI.setText(findTestObject('Web/Page_UangTeman.com Pinjaman online (1)/input_ap_personal_id_no'), '3209021123930009')

WebUI.scrollToElement(findTestObject('Web/Page_UangTeman.com Pinjaman online (1)/button_Selanjutnya1'), 0)

WebUI.click(findTestObject('Web/Page_UangTeman.com Pinjaman online (1)/button_Selanjutnya1'))

WebUI.waitForElementVisible(findTestObject('Web/Page_UangTeman.com Pinjaman online (1)/label'), 1)

WebUI.click(findTestObject('Web/Page_UangTeman.com Pinjaman online (1)/label'))

WebUI.scrollToElement(findTestObject('Web/Page_UangTeman.com Pinjaman online (1)/button_Selanjutnya2'), 0)

WebUI.click(findTestObject('Web/Page_UangTeman.com Pinjaman online (1)/button_Selanjutnya2'))

WebUI.click(findTestObject('Web/Page_UangTeman.com Pinjaman online (1)/div_Google'))

Mobile.closeApplication()

WebUI.scrollToElement(findTestObject('Web/Page_UangTeman.com Pinjaman online (1)/button_Selanjutnya3'), 0)

WebUI.click(findTestObject('Web/Page_UangTeman.com Pinjaman online (1)/button_Selanjutnya3'))

WebUI.closeBrowser()

