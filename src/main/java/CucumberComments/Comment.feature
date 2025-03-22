Feature: annotation 

#This is how background can be used to eliminate duplicate steps 
Background: 
User navigates to Facebook 
Given I am on Facebook login page 

#Scenario with AND 
Scenario: 
When I enter username as "TOM" 
And I enter password as "JERRY" 
Then Login should fail 

#Scenario with BUT 
Scenario: 
When I enter username as "TOM" 
And I enter password as "JERRY" 
Then Login should fail 
But Relogin option should be available


#Step definition file − If you are using Java as a platform then mark your comments with “//”.

#Feature File − In case of feature file, we just need to put # before beginning your comment.


#Comment is basically a piece of code meant for documentation purpose and not for execution. Be it a step definition file or a feature file,
#to make it more readable and understandable.