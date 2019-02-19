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

WebUI.navigateToUrl('https://staging.uangteman.com/admin')

WebUI.setText(findTestObject('Web/wb/Page_Uang Teman Administration - Lo (2)/input_bu_name'), 'marista_staff')

WebUI.setText(findTestObject('Web/wb/Page_Uang Teman Administration - Lo (2)/input_bu_passwd'), 'testing')

WebUI.sendKeys(findTestObject('Web/wb/Page_Uang Teman Administration - Lo (2)/input_bu_passwd'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Web/wb/Page_Uang Teman Administration - (2)/a_Application Workbench'))

WebUI.click(findTestObject('Web/wb/Page_Uang Teman Administration - Wo (2)/i_fa fa-pencil-square-o'))

WebUI.click(findTestObject('Web/wb/Page_Uang Teman Administration - Wo (2)/i_fa fa-calendar'))

WebUI.click(findTestObject('Web/wb/Page_Uang Teman Administration - Wo (2)/i_fa fa-calendar'))

WebUI.uploadFile(findTestObject('Web/wb/Page_Uang Teman Administration - Wo (2)/span_Upload File'), '/Users/pandu.buana/Desktop/aaaa.png')

WebUI.sendKeys(findTestObject('Web/wb/Page_Uang Teman Administration - Wo/span_Upload File'), Keys.chord(Keys.ENTER))

WebUI.closeBrowser()

