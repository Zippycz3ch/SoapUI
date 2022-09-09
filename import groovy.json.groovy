import groovy.json.JsonSlurper

def response = messageExchange.response.responseContent
def response_json = new JsonSlurper(response)
def jsonParser = json.parseText(response)

log.ingo jsonParser.place_id