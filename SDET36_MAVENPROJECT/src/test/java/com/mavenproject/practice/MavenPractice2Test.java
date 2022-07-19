package com.mavenproject.practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MavenPractice2Test {

	@Test
	public void mavenPractice2Test1() {
		Reporter.log("mavenPractice2Test1",true);
	}

	@Test
	public void mavenPractice2Test2() {
		Reporter.log("mavenPractice2Test2",true);
	}

	@Test
	public void mavenPractice2Test3() {
		Reporter.log("mavenPractice2Test3",true);
		System.out.println("added statement");
	}
}
