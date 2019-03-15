package demoproject.qatest;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hookstest {
	
	@Before(order=1)
    public void beforeScenario(){
        System.out.println("This will run before the Scenario");
    } 
 
 @After(order=1)
    public void afterScenario(){
        System.out.println("This will run after the Scenario");
    }
 @Before("@First")
 public void beforeFirst(){
     System.out.println("This will run only before the First Scenario");
 } 

@Before("@Second")
 public void beforeSecond(){
     System.out.println("This will run only before the Second Scenario");
 } 

@Before("@Third")
 public void beforeThird(){
     System.out.println("This will run only before the Third Scenario");
 }



@Before(order=0)
public void beforeScenarioStart(){
    System.out.println("-----------------Start of Scenario-----------------");
} 


@After(order=0)
public void afterScenarioFinish(){
    System.out.println("-----------------End of Scenario-----------------");
} 

}
