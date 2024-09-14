package Test_Demo;

import org.testng.annotations.Test;

public class GG {
  @Test(groups= {"Sanity","Smoke"})
  public void f1() {
	  System.out.println("group 1"); 
	  
  }
  @Test(groups= {"Smoke"})
  public void f2() {
	  System.out.println("group2");
  }
  @Test(groups= {"Smoke","Regression"})
  public void f3() {
	  System.out.println("group 3"); 
  }
  @Test(groups= {"Smoke","Sanity","Regression"})
  public void f4() {
	  System.out.println("group 4"); 
  }
  @Test(groups= {"Sanity","Regression"})
  public void f5() {
	  System.out.println("group 5"); 
  }
  @Test(groups= {"Smoke","Unit"})
  public void f6() {
	  System.out.println("group 6"); 
  }
  @Test(groups= {"Unit"})
  public void f7() {
	  System.out.println("group 7"); 
  }
}
