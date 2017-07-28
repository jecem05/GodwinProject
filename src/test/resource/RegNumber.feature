Feature: As a user,
  I want to be able to check 
  various registration plate number

  @sugar
  Scenario Outline: Register number
    Given am on the "Home" page
    And I click "Start" button
    When I Enter any "Car registration" details as "<Number_Plate>"
    And I click "Continue" button
    Then the "Registration number" is displayed as "<Displayed_Number>"

    Examples: 
      | Number_Plate | Displayed_Number |
      | LM08CPY      | LM08 CPY         |
      | EX03PYJ      | EX03 PYJ         |
      | HV12RVO      | HV12 RVO         |
