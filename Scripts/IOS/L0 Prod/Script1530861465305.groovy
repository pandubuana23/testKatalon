import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.lang.ProcessEnvironment.Value

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
import io.appium.java_client.MobileElement as MobileElement

Mobile.startApplication('/Users/pandu.buana/Downloads/Archive (1)/uangteman Dev.app', true)

Mobile.tap(findTestObject('IOS2/XCUIElementTypeButton - Allow'), 0)

Mobile.tap(findTestObject('IOS2/XCUIElementTypeButton - Selanjutnya'), 0)

Mobile.tap(findTestObject('IOS2/XCUIElementTypeButton - Selanjutnya'), 0)

Mobile.tap(findTestObject('IOS2/XCUIElementTypeButton - Selanjutnya'), 0)

Mobile.tap(findTestObject('IOS2/XCUIElementTypeButton - Masuk ke Home'), 0)

Mobile.tap(findTestObject('IOS2/XCUIElementTypeButton - Lain Kali'), 0)

Mobile.tap(findTestObject('IOS2/XCUIElementTypeButton - Ajukan Pinjaman'), 0)

Mobile.tap(findTestObject('IOS2/XCUIElementTypeButton - PINJAM SEKARANG'), 0)

Mobile.tap(findTestObject('IOS2/XCUIElementTypeButton - SAYA SETUJU'), 0)

Mobile.tap(findTestObject('IOS2/XCUIElementTypeTextField - Alamat email'), 0)

Mobile.setText(findTestObject('IOS2/XCUIElementTypeTextField - Alamat email'), CustomKeywords.'package1.Asdqwe.getEmailForRegistration'(), 
    0)

Mobile.tap(findTestObject('IOS2/XCUIElementTypeButton - Toolbar Done Button'), 0)

Mobile.tap(findTestObject('IOS2/XCUIElementTypeTextField - Nomor telepon'), 0)

Mobile.setText(findTestObject('IOS2/XCUIElementTypeTextField - Nomor telepon'), '08226677', 0)

Mobile.tap(findTestObject('IOS2/XCUIElementTypeButton - Toolbar Done Button (1)'), 0)

Mobile.tap(findTestObject('IOS2/XCUIElementTypeTextField - Gunakan format KTP'), 0)

Mobile.setText(findTestObject('IOS2/XCUIElementTypeTextField - Gunakan format KTP'), CustomKeywords.'package1.Asdqwe.randomInt'(
        16), 0)

Mobile.tap(findTestObject('IOS2/XCUIElementTypeButton - Toolbar Done Button (1)'), 0)

Mobile.tap(findTestObject('IOS2/XCUIElementTypeButton - SELANJUTNYA (1)'), 0)

Mobile.tap(findTestObject('IOS2/XCUIElementTypeStaticText - Pembelian Konsumen'), 0)

Mobile.tap(findTestObject('IOS2/XCUIElementTypeButton - SELANJUTNYA (2)'), 0)

Mobile.tap(findTestObject('IOS2/XCUIElementTypeStaticText - Referensi TemanKerabat'), 0)

Mobile.tap(findTestObject('IOS2/XCUIElementTypeButton - SELANJUTNYA (2)'), 0)

Mobile.tap(findTestObject('IOS2/XCUIElementTypeTextField - Nama lahir'), 0)

Mobile.setText(findTestObject('IOS2/XCUIElementTypeTextField - Nama lahir (1)'), 'test automation', 0)

Mobile.tap(findTestObject('IOS2/XCUIElementTypeButton - Toolbar Done Button'), 0)

Mobile.tap(findTestObject('IOS2/XCUIElementTypeStaticText - Pilih jenis kelamin'), 2)

//Mobile.dragAndDrop(findTestObject('IOS2/XCUIElementTypePickerWheel - Laki-laki'), findTestObject('IOS2/XCUIElementTypePickerWheel - Perempuan'), 
//    1)
//CustomKeywords.'package1.Asdqwe.getLabelFromPicker'(//*[@type = 'XCUIElementTypePickerWheel')

Mobile.tap(findTestObject('IOS2/XCUIElementTypeButton - Done'), 0)

Mobile.tap(findTestObject('IOS2/XCUIElementTypeTextField - Tempat lahir'), 0)

Mobile.setText(findTestObject('IOS2/XCUIElementTypeTextField - Tempat lahir (1)'), 'Kota Bekasi', 0)

Mobile.tap(findTestObject('IOS2/XCUIElementTypeButton - Toolbar Done Button (1)'), 0)

Mobile.tap(findTestObject('IOS2/XCUIElementTypeTextField - Tanggal lahir'), 0)

Mobile.tap(findTestObject('IOS2/XCUIElementTypeButton - Done'), 0)

Mobile.tap(findTestObject('IOS2/XCUIElementTypeStaticText - Pilih Agama'), 0)

Mobile.tap(findTestObject('IOS2/XCUIElementTypeButton - Done'), 1)

Mobile.tap(findTestObject('IOS2/XCUIElementTypeButton - SELANJUTNYA (1)'), 0)

//WebUI.scrollToElement(findTestObject('IOS2/XCUIElementTypeStaticText - Pilih'), 0)
Mobile.scrollToText('Status pernikahan belum dipilih')

Mobile.tap(findTestObject('IOS2/XCUIElementTypeStaticText - Pilih'), 1)

Mobile.tap(findTestObject('IOS2/XCUIElementTypeButton - Done'), 0)

Mobile.tap(findTestObject('IOS2/XCUIElementTypeButton - SELANJUTNYA (1)'), 0)

Mobile.tap(findTestObject('IOS2/XCUIElementTypeStaticText - DIPLOMA III'), 0)

Mobile.tap(findTestObject('IOS2/XCUIElementTypeButton - SELANJUTNYA (1)'), 0)

Mobile.tap(findTestObject('IOS2/XCUIElementTypeStaticText - Pilih salah satu'), 0)

Mobile.tap(findTestObject('IOS2/XCUIElementTypeButton - Done'), 0)

Mobile.tap(findTestObject('IOS2/XCUIElementTypeTextField - Jumlah Tanggungan'), 0)

Mobile.setText(findTestObject('IOS2/XCUIElementTypeTextField - Jumlah Tanggungan'), '1', 0)

Mobile.tap(findTestObject('IOS2/XCUIElementTypeButton - Toolbar Done Button (1)'), 0)

Mobile.tap(findTestObject('IOS2/XCUIElementTypeButton - SELANJUTNYA (1)'), 0)

Mobile.tap(findTestObject('IOS2/XCUIElementTypeTextField - Nomor telepon (1)'), 0)

Mobile.sendKeys(findTestObject('IOS2/XCUIElementTypeTextField - Nomor telepon (1)'), '021')

Mobile.tap(findTestObject('IOS2/XCUIElementTypeButton - Toolbar Done Button (1)'), 0)

Mobile.tap(findTestObject('IOS2/XCUIElementTypeTextField - Nomor telepon (2)'), 0)

Mobile.sendKeys(findTestObject('IOS2/XCUIElementTypeTextField - Nomor telepon (2)'), CustomKeywords.'package1.Asdqwe.randomInt'(
        6))

Mobile.tap(findTestObject('IOS2/XCUIElementTypeButton - Toolbar Done Button (1)'), 0)

Mobile.tap(findTestObject('IOS2/XCUIElementTypeButton - SELANJUTNYA (1)'), 0)

Mobile.tap(findTestObject('IOS2/XCUIElementTypeTextView'), 0)

Mobile.sendKeys(findTestObject('IOS2/XCUIElementTypeTextView'), 'Jln. Mutiara raya 15 Jakarta ' + CustomKeywords.'package1.Asdqwe.randomInt'(
        5))

Mobile.tap(findTestObject('IOS2/XCUIElementTypeButton - Toolbar Done Button'), 0)

Mobile.tap(findTestObject('IOS2/XCUIElementTypeStaticText - Pilih provinsi'), 0)

//Mobile.setSliderValue(findTestObject('IOS2/XCUIElementTypeStaticText - Pilih provinsi'), 50, 1)
//Mobile.selectListItemByLabel(findTestObject('IOS2/XCUIElementTypePicker'), 'Banten', 1)
Mobile.tap(findTestObject('IOS2/XCUIElementTypeButton - Done'), 0)

Mobile.scrollToText('Kode Pos Tempat Tinggal')

Mobile.tap(findTestObject('IOS2/XCUIElementTypeStaticText - Pilih kota'), 0)

Mobile.tap(findTestObject('IOS2/XCUIElementTypeButton - Done'), 0)

Mobile.tap(findTestObject('IOS2/XCUIElementTypeStaticText - Pilih kecamatan'), 0)

Mobile.tap(findTestObject('IOS2/XCUIElementTypeButton - Done'), 0)

Mobile.tap(findTestObject('IOS2/XCUIElementTypeStaticText - Pilih kelurahan'), 0)

Mobile.tap(findTestObject('IOS2/XCUIElementTypeButton - Done'), 0)

Mobile.tap(findTestObject('IOS2/XCUIElementTypeButton - SELANJUTNYA (1)'), 0)

Mobile.closeApplication()

