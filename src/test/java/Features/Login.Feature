Feature: Application Login

Scenario: Home page default login
Given User is on NetBanking landing page
When User login in to application with username and password
Then Home page is populated
And Cards are displayed
