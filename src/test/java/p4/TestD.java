package p4;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TestD {
  @Test
  public void f()
  {
	  System.out.println("Run Completed");
  }
  
  @Test
  public void f1()
  {
	  System.out.println("f1 Run Completed");
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

}
