('${#TestCase#property}') // property of case
("id") //property
["Name TestCase"] // test case or step name

log.info "Hello world" // výpis do konzole

context //context varible is used to access and modify the properties of your test case. Avaliable only in test case only.

context.expand('${#TestCase#property}') //přístip k properties na úrovni daného casu

testRunner.testCase.testSuite.testCases["getEmployeeDetails TestCase"].getPropertyValue("id") // přístup k properties jiného test casu

testRunner.testCase.testSuite.testCases["getEmployeeDetails TestCase"].setPropertyValue("id","666") // setting property value in test case

testRunner.testCase.getPropertyValue("department") // přístup k properties test casu

testRunner.testCase.testSuite.testCases["getEmployeeDetails TestCase"].testSteps["get_test_step"].getPropertyValue("Request")  // přístup k properties jinéhu test stepu u jiného test casu
testRunner.testCase.testSuite.project.getPropertyValue("value") // přístup k properties na úrovni projektu

def project=testRunner.testCase.testSuite.project

project.getPropertyValue("value") // get property from project levevl