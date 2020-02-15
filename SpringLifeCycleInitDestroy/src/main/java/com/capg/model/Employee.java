package com.capg.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {
	private String empId;
	private String empName;

	public void hello() {
		System.out.println("init method called");
	}

	public void bye() {
		System.out.println("destroy method called");
	}
}
