Feature: Google Search Result

  Scenario: Title of searched item from third result page
    Given User is on Google website
    When User enters search term as "best books on tech" and presses Enter
   	And User clicks on the third result page
    Then The title of the second listing on the page should be printed