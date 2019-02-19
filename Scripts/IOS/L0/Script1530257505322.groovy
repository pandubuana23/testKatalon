import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
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
import net.bytebuddy.utility.RandomString as RandomString

Mobile.startApplication('/Users/pandu.buana/Downloads/testing/uangteman.app', true)

Mobile.tap(findTestObject('IOS/XCUIElementTypeButton - Allow'), 0)

Mobile.tap(findTestObject('IOS/XCUIElementTypeButton - Selanjutnya'), 0)

Mobile.tap(findTestObject('IOS/XCUIElementTypeButton - Selanjutnya'), 0)

Mobile.tap(findTestObject('IOS/XCUIElementTypeButton - Selanjutnya'), 0)

Mobile.tap(findTestObject('IOS/XCUIElementTypeButton - Masuk ke Home'), 0)

Mobile.tap(findTestObject('IOS/XCUIElementTypeButton - Lain Kali'), 0)

Mobile.tap(findTestObject('IOS/XCUIElementTypeButton - Ajukan Pinjaman'), 0)

Mobile.setSliderValue(findTestObject('IOS/XCUIElementTypeSlider - 40'), 20, 2)

Mobile.tap(findTestObject('IOS/XCUIElementTypeButton - PINJAM SEKARANG'), 0)

Mobile.tap(findTestObject('IOS/XCUIElementTypeTextView'), 2)

Mobile.setText(findTestObject('IOS/XCUIElementTypeTextView (1)'), CustomKeywords.'package1.Asdqwe.getEmailForRegistration'(), 
    3)

Mobile.tap(findTestObject('IOS/XCUIElementTypeButton - Lanjutkan'), 0)

Mobile.tap(findTestObject('IOS/XCUIElementTypeTextView'), 0)

Mobile.setText(findTestObject('IOS/XCUIElementTypeTextView (1)'), '08225567', 0)

Mobile.tap(findTestObject('IOS/XCUIElementTypeButton - Lanjutkan'), 2)

Mobile.tap(findTestObject('IOS/XCUIElementTypeButton'), 2)

Mobile.tap(findTestObject('IOS/XCUIElementTypeButton - Lanjutkan (1)'), 0)

Mobile.tap(findTestObject('IOS/XCUIElementTypeTextView (2)'), 0)

Mobile.setText(findTestObject('IOS/XCUIElementTypeTextView (3)'), CustomKeywords.'package1.Asdqwe.randomInt'(16), 0)

Mobile.tap(findTestObject('IOS/XCUIElementTypeButton - Lanjutkan (2)'), 0)

Mobile.tap(findTestObject('IOS/XCUIElementTypeTextView (2)'), 0)

Mobile.setText(findTestObject('IOS/XCUIElementTypeTextView (3)'), 'pandu buana', 0)

Mobile.tap(findTestObject('IOS/XCUIElementTypeButton - Lanjutkan (2)'), 0)

Mobile.tap(findTestObject('IOS/XCUIElementTypeTextView (2)'), 0)

Mobile.setText(findTestObject('IOS/XCUIElementTypeTextView (3)'), 'jakarta', 0)

Mobile.tap(findTestObject('IOS/XCUIElementTypeButton - Lanjutkan (2)'), 0)

Mobile.tap(findTestObject('IOS/XCUIElementTypeButton - Lanjutkan (3)'), 0)

Mobile.tap(findTestObject('IOS/XCUIElementTypeStaticText - Lanjutkan'), 0)

Mobile.tap(findTestObject('IOS/XCUIElementTypeStaticText - Lanjutkan'), 0)

Mobile.tap(findTestObject('IOS/XCUIElementTypeStaticText - Lanjutkan (1)'), 0)

Mobile.tap(findTestObject('IOS/XCUIElementTypeButton - Lanjutkan (4)'), 0)

Mobile.tap(findTestObject('IOS/XCUIElementTypeButton - Saya mengerti'), 0)

Mobile.tap(findTestObject('IOS/XCUIElementTypeOther - UangTeman'), 0)

Mobile.closeApplication()

