package Annotation;

public class Annotation {
	/*
	 * Annotation is a predefined text, which holds a specific meaning. It lets the
	 * compiler/interpreter know, what should be done upon execution. Cucumber has
	 * got the following few annotations −
	 */
	
	/*
	 * Given −
	 * 
	 * It describes the pre-requisite for the test to be executed.
	 * 
	 * Example − GIVEN I am a Facebook user
	 */

	/*
	 * When −
	 * 
	 * It defines the trigger point for any test scenario execution.
	 * 
	 * Example − WHEN I enter "<username>"
	 */

	/*
	 * Then −
	 * 
	 * Then holds the expected result for the test to be executed.
	 * 
	 * Example − THEN login should be successful.
	 */

	/*
	 * And −
	 * 
	 * It provides the logical AND condition between any two statements. AND can be
	 * used in conjunction with GIVEN, WHEN and THEN statement.
	 * 
	 * Example − WHEN I enter my "<username>" AND I enter my "<password>"
	 */

	/*
	 * But −
	 * 
	 * It signifies logical OR condition between any two statements. OR can be used
	 * in conjunction with GIVEN, WHEN and THEN statement.
	 * 
	 * Example − THEN login should be successful. BUT home page should not be
	 * missing.
	 */

	/*
	 * Scenario −
	 * 
	 * Details about the scenario under the test needs to be captured after the
	 * keyword “Scenario:”
	 * 
	 * Example −
	 * 
	 * Scenario:
	 * 
	 * GIVEN I am a Facebook user
	 * 
	 * WHEN I enter my
	 * 
	 * AND I enter my
	 * 
	 * THEN login should be successful.
	 * 
	 * BUT home page should not be missing.
	 */

	/* Scenario Outline − (To be covered later) */

	/* Examples − (To be covered later) */

	/*
	 * Background −
	 * 
	 * Background generally has the instruction on what to setup before each
	 * scenario runs. However, it gets executed after “Before” hook (to be covered
	 * later). So this is ideal to be used for code when we want to set up the
	 * web-browser or we want to establish the database connectivity.
	 * 
	 * Example −
	 * 
	 * Background:
	 * 
	 * Go to Facebook home page.
	 */


}



