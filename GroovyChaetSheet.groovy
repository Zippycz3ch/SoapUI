('${#TestCase#name}') // property of case
("id") //property
["getEmployeeDetails TestCase"] // test case or step name

log.info "Hello world" // výpis do konzole

context //context varible is used to access and modify the properties of your test case. Avaliable only in test case only.

log.info context.expand('${#TestCase#name}') //přístip k properties na úrovni daného casu
log.info context.expand('${#TestCase#age}')

log.info testRunner.testCase.testSuite.testCases["getEmployeeDetails TestCase"].getPropertyValue("id") // přístup k properties jiného test casu
log.info testRunner.testCase.testSuite.testCases["addEmployee TestCase"].getPropertyValue("age") 

testRunner.testCase.testSuite.testCases["getEmployeeDetails TestCase"].setPropertyValue("id","666") // setting property value in test case
log.info testRunner.testCase.testSuite.testCases["getEmployeeDetails TestCase"].getPropertyValue("id") // přístup k properties jiného test casu

log.info testRunner.testCase.getPropertyValue("department") // přístup k properties test casu

testRunner.testCase.testSuite.testCases["getEmployeeDetails TestCase"].testSteps["get_test_step"].getPropertyValue("Request")  // přístup k properties jinéhu test stepu u jiného test casu
testRunner.testCase.testSuite.project.getPropertyValue("value") // přístup k properties na úrovni projektu

def project=testRunner.testCase.testSuite.project

log.info project.getPropertyValue("gender")