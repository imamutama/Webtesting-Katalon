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


int row = 2

for (int loop = 1; loop <= row; loop++) {
	if (loop == 1) {
		WebUI.delay(2)
		WebUI.click(findTestObject('LoginObject/span_English'))
		WebUI.click(findTestObject('LoginObject/selectIndonesia'))
		WebUI.setText(findTestObject('LoginObject/masukanNama'), GlobalVariable.FirstName)
		WebUI.setText(findTestObject('LoginObject/masukanEmail'), GlobalVariable.Email)
		WebUI.setText(findTestObject('LoginObject/masukanNomer'), GlobalVariable.Phone)
		WebUI.setText(findTestObject('LoginObject/masukanPerusahaan'), GlobalVariable.Company)
		WebUI.click(findTestObject('LoginObject/buttonAjukan'))
		WebUI.delay(10)
		WebUI.click(findTestObject('LoginObject/kembaliAjukan'))
	}

	if (loop == 2) {
		WebUI.delay(2)
		WebUI.click(findTestObject('LoginObject/span_Indonesia'))
		WebUI.click(findTestObject('LoginObject/li_English'))
		WebUI.setText(findTestObject('LoginObject/inputUsername'), GlobalVariable.FirstName)
		WebUI.setText(findTestObject('LoginObject/inputEmail'), GlobalVariable.Email)
		WebUI.setText(findTestObject('LoginObject/inputPhone'), GlobalVariable.Phone)
		WebUI.setText(findTestObject('LoginObject/inputCompany'), GlobalVariable.Company)
		WebUI.click(findTestObject('LoginObject/buttonRequest'))
		WebUI.delay(10)
		WebUI.verifyElementPresent(findTestObject('LoginObject/EnglishElement'), 10)
	}
}

