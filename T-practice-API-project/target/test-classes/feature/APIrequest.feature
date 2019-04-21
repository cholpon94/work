Feature: API testing with bookit

@chopa
Scenario: verify information about logged user

  Given I logged Bookit api using "sbirdbj@fc2.com" and "asenorval"
  When I get the current user information from api 
  Then the information about current user should be returned 
  

    