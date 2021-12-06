package org.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.test.path.PathClass;
import org.testng.annotations.AfterClass;

public class PathTest {
	
	PathClass obj= new PathClass();
	
	 @BeforeClass
	  public void beforeClass() {
		 
		obj.laucnh();
	  }
  @Test
  public void f() {
	 
	  obj.pathFind();
  }
 

  @AfterClass
  public void afterClass() {
  }

}
