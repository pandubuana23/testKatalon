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

WebUI.navigateToUrl('https://dev.uangteman.com/')

WebUI.scrollToElement(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/a_ajukan pinjaman'), 0)

WebUI.click(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/a_ajukan pinjaman'))

WebUI.click(findTestObject('dev_env/Page_/div_slider-handle min-slider-h'))

WebUI.click(findTestObject('dev_env/Page_/a_PINJAM SEKARANG'))

WebUI.click(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/button_Saya Setuju dengan Syar'))

WebUI.waitForElementVisible(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/input_ap_email_address'), 1)

WebUI.setText(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/input_ap_email_address'), 'testautomation28.3@mailinator.com')

WebUI.setText(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/input_ap_mobile_no'), '82258030300')

WebUI.setText(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/input_ap_personal_id_no'), '3206021404910009')

WebUI.click(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/button_Selanjutnya'))

WebUI.scrollToElement(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/div_Tagihan Medis'), 1)

WebUI.click(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/div_Tagihan Medis'))

WebUI.click(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/button_Selanjutnya'))

WebUI.click(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/div_Twitter'))

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/button_Selanjutnya'))

WebUI.click(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/div_Nama Lengkap'))

WebUI.setText(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/input_ap_full_name'), 'pandu buana')

WebUI.setText(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/input_ap_pob'), 'Jakarta')

WebUI.click(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/a_Jakarta Barat'))

WebUI.click(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/i_icon-arrow-left'))

WebUI.click(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/span_1990'))

WebUI.click(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/span_Feb'))

WebUI.click(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/td_1'))

WebUI.selectOptionByValue(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/select_Pilih jenis kelamin'), 'M', 
    true)

WebUI.selectOptionByValue(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/select_-- Pilih Agama --Buddha'), '1', 
    true)

WebUI.selectOptionByValue(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/select_-- Pilih Status Pernika'), '1', 
    true)

WebUI.click(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/button_Selanjutnya'))

WebUI.click(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/div_S1'))

WebUI.click(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/button_Selanjutnya'))

WebUI.selectOptionByValue(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/select_-- Pilih Suku --BantenB'), '1', 
    true)

WebUI.selectOptionByValue(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/select_Jumlah Tanggungan'), '0', true)

WebUI.click(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/button_Selanjutnya'))

WebUI.setText(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/input_ap_telp_no'), '02189210377')

WebUI.click(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/button_Selanjutnya'))

WebUI.setText(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/textarea_ap_dom_address'), 'Jl. Mutiara Raya No 15 jakarta')

WebUI.selectOptionByValue(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/select_-- Pilih Provinsi --Bal'), '3', 
    true)

WebUI.selectOptionByValue(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/select_-- Pilih Kota --Kab. Le'), '192', 
    true)

WebUI.selectOptionByValue(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/select_-- Pilih Kecamatan --Ba'), '107', 
    true)

WebUI.selectOptionByValue(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/select_-- Pilih Kota --Kab. Le'), '489', 
    true)

WebUI.selectOptionByValue(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/select_-- Pilih Kecamatan --Ba_1'), 
    '249', true)

WebUI.selectOptionByValue(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/select_-- Pilih Kelurahan --Ka'), '2563', 
    true)

WebUI.click(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/button_Selanjutnya'))

WebUI.click(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/div_Rumah Orang Tua'))

WebUI.click(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/button_Selanjutnya'))

WebUI.setText(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/input_ap_fam1_name'), 'Ibu Tester')

WebUI.setText(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/input_ap_telp_fam1'), '02189210388')

WebUI.setText(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/textarea_ap_fam1_address'), 'Jl Mutiara Raya no 19 ')

WebUI.selectOptionByValue(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/select_-- Pilih Provinsi --Bal_1'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/select_-- Pilih Kota --Kab. Ba'), '24', 
    true)

WebUI.selectOptionByValue(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/select_-- Pilih Kecamatan --Ai'), '73', 
    true)

WebUI.selectOptionByValue(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/select_-- Pilih Kelurahan --Ce'), '861', 
    true)

WebUI.sendKeys(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/button_Selanjutnya'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/input_ap_bank_username'), 'pandu buana')

WebUI.selectOptionByValue(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/select_-- Nama Bank --BNI Syar'), '1', 
    true)

WebUI.setText(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/input_ap_bank_number'), '9000016466535')

WebUI.click(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/label_Dengan ini saya menyatak'))

WebUI.click(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/button_Selanjutnya'))

WebUI.setText(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/input_ap_employer_name'), 'PT Tester Automation')

WebUI.setText(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/input_ap_telp_work'), '021892777382')

WebUI.setText(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/textarea_ap_employer_address'), 'Jakarta')

WebUI.selectOptionByValue(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/select_-- Pilih Provinsi --Bal_2'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/select_-- Pilih Kota --Kab. Ba_1'), 
    '27', true)

WebUI.selectOptionByValue(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/select_-- Pilih Kecamatan --Ba_2'), 
    '8', true)

WebUI.selectOptionByValue(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/select_-- Pilih Kelurahan --Ab'), '73', 
    true)

WebUI.click(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/button_Selanjutnya'))

WebUI.selectOptionByValue(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/select_-- Tipe Pekerjaan --Ang'), '10', 
    true)

WebUI.selectOptionByValue(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/select_Tahun bekerja'), '5', true)

WebUI.selectOptionByValue(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/select_Bulan bekerja'), '0', true)

WebUI.setText(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/input_ap_employer_role'), 'Staff')

WebUI.setText(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/input_ap_monthly_income'), '8000000')

WebUI.setText(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/input_mainexpenses'), '3000000')

WebUI.click(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/button_Selanjutnya'))

WebUI.click(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/button_Lewati'))

WebUI.click(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/button_Saya Setuju'))

WebUI.check(findTestObject('dev_env/Page_UangTeman.com Pinjaman online/p_Berkas Permohonan Pinjaman D'))

WebUI.closeBrowser()

