Feature: Facebook login

Scenario Outline: Hook Test
Given user navigates to facebook
When I enter Username as "<Username>" and Password as "<Password>"
Then login should be unsuccessful
Examples:
| Username  | Password  | 
| username1 | password1 |
