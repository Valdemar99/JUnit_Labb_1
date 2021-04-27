package ics.course.java.test;

import ics.course.java.HourlyEmployee;
import junit.framework.TestCase;

public class HourlyEmployeeTest extends TestCase {

	String expectedName;
	String expectedAddress;
	String expectedPhone;
	int expectedHours;
	double expectedHourlySalary;
	HourlyEmployee e1;
	HourlyEmployee e2;

	public HourlyEmployeeTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		expectedName = "Mats";
		expectedAddress = "Lund";
		expectedPhone = "12345";
		expectedHours = 10;
		expectedHourlySalary = 100;
		e1 = new HourlyEmployee(
				expectedName,
				expectedAddress,
				expectedPhone,
				expectedHours,
				expectedHourlySalary);
	}

	public void testGetHours() {
		assertEquals(expectedHours, e1.getHours());
	}
	public void testSetHours() {
		assertTrue(expectedHours == e1.getHours());
	}
	public void testGetHourlySalary() {
		assertEquals(expectedHourlySalary, e1.getHourlySalary());
	}
	public void testSetHourlySalary() {
		assertTrue(expectedHours == e1.getHours());
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		e1 = null;
	}


}
