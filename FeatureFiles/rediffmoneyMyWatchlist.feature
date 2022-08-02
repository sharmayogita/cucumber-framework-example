@tag
Feature: launch My Watchlist
  I want to use this template to launch My Watch List

  @tag1
  Scenario: Check My Watch list and add stock1
  Given i open browser with url "https://money.rediff.com/"
    When I click SignIn button
    Then i should see rediff money Login Page
    When i enter Username as "sharmayogita166@gmail.com"
    And i enter Password as "123@kamlesh"
    And i click submit button
    Then i should see Portfolio page
  
    When i click on my watchlist icon
    Then i click on watchlist add stock one
    Then i enter add stock name one time
    And i add max rs one time
    And i add min rs one time
    Then click add button one time
    
   @tag2
  Scenario:  My watchlist add stock2
 		Given i click on watchlist add stock second time
    Then i enter add stock name second time
    And i add max rs second time
    And i add min rs second time
    Then click mywatchlist add button second time
    
   @tag3
  Scenario:  My watchlist add stock3
 		Given i click on watchlist add stock third time
    Then i enter add stock name third time
    And i add max rs third time
    And i add min rs third time
    Then click mywatchlist add button third time
    
    @tag4
    Scenario:  My watchlist add MF1
    Given i clik watchlist MF one time
    Then i add MF name one time
    Then i add max price one time
    And i add minprice first time
    Then i click watlict MF button one time
    
     @tag5
    Scenario:  My watchlist add MF2
    Given i clik watchlist MF second time
    Then i add MF name second time
    Then i add max price second time
    And i add minprice second time
    Then i click watlict MF button second time
    
      @tag6
    Scenario:  My watchlist add MF3
    Given i clik watchlist MF third time
    Then i add MF name third time
    Then i add max price third time
    And i add minprice third time
    Then i click watlict MF button third time
    
    @tag7
    Scenario:  My watchlist delete stock1
    Given i click delete stock one link
    Then i click delete yes confirm button one time
    Then i clik delete stock second link
    And i click delete yes confiem button second time
    Then i click delete stock third link
    Then i click delete yes confirm button third time
    
    @tag8
    Scenario:  My watchlist delete MF
    Given i click delete MF one link
    Then i click MF delete yes confirm button one time
    Then i clik MF delete stock second link
    And i click MF delete yes confiem button second time
    Then i click MF delete stock third link
    Then i click MF delete yes confirm button third time
    Then i click signout button
    