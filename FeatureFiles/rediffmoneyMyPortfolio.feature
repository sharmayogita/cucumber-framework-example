@tag
Feature: Add Stocks
  I want to use this template to add stocks
#@OnlyOneTime
  @tag1
  Scenario:  Add Stock1 in my portfolio

    Given i open browser with url "https://money.rediff.com/"
    When I click SignIn button
    Then i should see rediff money Login Page
    When i enter Username as "sharmayogita166@gmail.com"
    And i enter Password as "123@kamlesh"
    And i click submit button
    Then i should see Portfolio page
    Then i click add stock button
    Then i add stock name
    Then i add date of purchase in stock
    And i add quantity
    And i add purchase price
    Then i add exchange type
    Then i click add button
    
   @tag2
  Scenario:  Add Stock2 in my portfolio
    Given click add stock button second time
    And add stock name second time
    Then add date of purchase second time
    And add quantity second time
    And add purchase price second time
    Then add exchange type second time
    Then click add button second time
    
    @tag3
  Scenario:  Add Stock3 in my portfolio
    Given click add stock button third time
    And add stock name third time
    Then add date of purchase third time
    And add quantity third time
    And add purchase price third time
    Then add exchange type third time
    Then click add button third time
    
    @tag4
    Scenario: add mutual fund1 in my portfolio
    Given add MF button
    Then add MF name
    And add initial amount
    Then add date of purchase in MF
    Then add add unit
    And click MF button
    
    @tag5
    Scenario: add mutual fund2 in my portfolio
    Given add MF button second time
    Then add MF name second time
    And add initial amount second time
    Then add date of purchase in MF second time 
    Then add add unit second time
    And click MF button second time
    
    @tag6
    Scenario: add mutual fund3 in my portfolio
    Given add MF button third time
    Then add MF name third time
    And add initial amount third time
    Then add date of purchase in MF third time
    Then add add unit third time
    And click MF button third time
    
    @tag7
    Scenario: delete portfolio stocks
    Given i scroll page till add stock button
    When i click first stock radio button 
    And i click first stock delete button
    Then i second stock click radio button
    And i second stock click dete button
    Then i third stock click radio button
    And i third stock click delete button
     
    @tag8
   Scenario: delete portfolio Mutual Funds
   Given i click first MF radio button
   Then i click first MF delete button
   Then i click second MF radion button  
   And i click second MF delete button
   Then i click third MF radio button
   And i click third MF delte button
   Then i click signout button

  