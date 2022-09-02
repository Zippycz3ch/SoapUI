def myVar = context.expand('${#Env#HOST}');                // nastavuju host podle prostredi
def pillar = context.expand('${#Env#PILLAR}');             // zjistim na jakem prostredi jsem jestli DEV nebo ACC

def user = "1111165368814"  //dev KateId   Patricie Seredna         // definuju DEV usera
if (myVar=="") myVar="http://localhost:8089/user-management"        // pokud host neexistuje tak tam dam local (pro localni testovani)

if (pillar=="acc") user="1111171509962"   //acc KateId    Han Lee.    // pokud je pillar ACC tak nastavim jineho uzivatele

log.info("var: " + myVar)
log.info("pillar: " + pillar)
log.info("user: " + user)
testRunner.testCase.testSuite.project.setPropertyValue( "EndPoint", myVar )
testRunner.testCase.testSuite.project.setPropertyValue( "User", user )