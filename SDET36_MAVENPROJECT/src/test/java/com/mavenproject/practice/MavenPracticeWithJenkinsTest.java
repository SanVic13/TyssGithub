package com.mavenproject.practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MavenPracticeWithJenkinsTest {

	@Test
	public void mavenPracticeWithJenkins1() {
		Reporter.log("mavenPracticeWithJenkins1", true);
	}

	@Test
	public void mavenPracticeWithJenkins2() {
		Reporter.log("mavenPracticeWithJenkins2", true);
		System.out.println("jenkins practice 01");
		System.out.println("jenkins practice 02");
	}

}
