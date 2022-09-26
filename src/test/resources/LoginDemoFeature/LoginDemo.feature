Feature: Login functionality

  Scenario Outline: Check with valid credentials
    Given users luanch chrome browser
    When users opens url "https://www.saucedemo.com/"
    Then users enters <username> and <password>
    And user clicks on login button
    When page title should be "Swag Labs"
    When user click on react button
    And user click on logout
    And user close browser

    Examples: 
      | username       | password     |
      | problem_user  | secret_sauce |
      | standard_user | Sceret       |
