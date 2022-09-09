import com.eviware.soapui.support.XmlHolder
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestRunContext

('${#TestCase#property}') // property of case
("id") //property
["Name TestCase"] // test case or step name

log.info "Hello world" // console output

context //context varible is used to access and modify the properties of your test case. Avaliable only in current test case .

context.expand('${#TestCase#property}') //přístip k properties na úrovni daného casu

testRunner.testCase.testSuite.testCases["getEmployeeDetails TestCase"].getPropertyValue("id") // accessing property of another case

testRunner.testCase.testSuite.testCases["getEmployeeDetails TestCase"].setPropertyValue("id","666") // setting property value in test case

testRunner.testCase.getPropertyValue("department") // accessing case property

testRunner.testCase.testSuite.testCases["getEmployeeDetails TestCase"].testSteps["get_test_step"].getPropertyValue("Request")  // přístup k properties jinéhu test stepu u jiného test casu
testRunner.testCase.testSuite.project.getPropertyValue("value") // přístup k properties na úrovni projektu

def project=testRunner.testCase.testSuite.project

project.getPropertyValue("value") // get property from project level

// Rest
// Script assertion

import groovy.json.JsonSlurper 

def response = messageExchange.response.responseContent  // pomocí  messageExchange vytáhne obsah reponsu
def json = new JsonSlurper()                             // vytvoří objekt json pro parsování dat
def jsonParser = json.parseText(response)                // vytvoří objekt jsonParser který obsahuje strukturovaná data z response

log.info jsonParser.place_id
assert jsonParser.status == "OK"                         // ověří že hodnota status v jsonparser je OK

context.getTestCase()setPropertyValue("place_id",jsonParser.place_id)           //pastne place_id z jsonParser do test casu do custom property place_id