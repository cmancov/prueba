#Autor: Crihstian manco

  @HistoriaDeUsuario

  Feature: verify login session for XTTTxxx platform

    Me as a user WANT to enter the XTTTxxx page TO verify if I can access it correctly

@CasoAutenticacionCorrecta
Scenario: Verify correct entry
  Given I enter with my credentials
  When I proceed with the authentication
  Then go to the main view of the page