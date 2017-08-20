package com.jetprogramming.efficiency;

import java.util.Arrays;
import java.util.List;

class Employee {
	private String name;
	private Integer age;

	public Employee(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "Employee Name:" + this.name + "  Age:" + this.age;
	}

	public Integer getAge() {
		return age;
	}
}

// MatchingWithStreams.java
public class MatchersSample {
	static List<Employee> employeeList = Arrays.asList(new Employee("Tom Jones", 45), new Employee("Harry Major", 25),
			new Employee("Ethan Hardy", 65), new Employee("Nancy Smith", 22), new Employee("Deborah Sprightly", 29));

	public static void main(String[] args) {
		boolean allEmpAbove21 = employeeList.stream().allMatch(emp -> emp.getAge() > 21);
		boolean empAbove40 = employeeList.stream().anyMatch(emp -> emp.getAge() > 40);
		boolean noEmpBelow30 = employeeList.stream().noneMatch(emp -> emp.getAge() < 30);

		System.out.println("All employees are above 21:" + allEmpAbove21);
		System.out.println("there are employees above 40:" + empAbove40);
		System.out.println("All employees are below 30:" + noEmpBelow30);
	}
}