Feature: Fitpeo-RevenueCalculator
Scenario: Calculate the revenue

    Given Login into the fitpeo web based application
    And click on RevnueCalculator
    When I click on RevnueCalculator it should navigate to the correct page
    And Scroll down to the slider section
    When enter the defined value
    Then slider should move accordingly
    And click on CTP codes whichever mentioned
    And validate the total recurring reimbursement
