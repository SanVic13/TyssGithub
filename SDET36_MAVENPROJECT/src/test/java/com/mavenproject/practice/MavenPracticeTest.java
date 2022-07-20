package com.mavenproject.practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MavenPracticeTest {

	@Test
	public void practiceTest1() {
		Reporter.log("practiceTest1", true);
	}
	
	@Test
	public void practiceTest2() {
		Reporter.log("practiceTest2", true);
	}
	
	@Test
	public void practiceTest3() {
		Reporter.log("practiceTest3", true);	
		System.out.println("PR raising practice");
<<<<<<< HEAD
		System.out.println("PR raising practice2");
		System.out.println("PR raising practice3");
		
=======
		System.out.println("PR raising practice1");
>>>>>>> branch 'master' of https://github.com/SanVic13/TyssGithub.git
	}
}
