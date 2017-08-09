Meta:

Narrative:
As a user
I should be able to enter any keyword
So that I can get the search results related to the search keyword

Scenario: Search using keyword
Given a user opens the healthdirect application
When I search using <keyword>
Then I should get the results related to search <keyword>

Examples:
keyword |
asthma  |