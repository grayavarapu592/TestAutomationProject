package javapractice;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Employee {

	String name;
	int salary;
	LocalDate hireDate;
	Date duration;

	public Employee(String a, int b, LocalDate c) {
		name = a;
		salary = b;
		hireDate = c;

	}

	public void empDuration(LocalDate date1, LocalDate date2) {
		// Calculate the difference in days
		long daysDifference = ChronoUnit.DAYS.between(date1, date2);

		System.out.println("Date 1: " + date1);
		System.out.println("Date 2: " + date2);
		System.out.println("No of days that employee is associated with the company is : " + daysDifference );
		

	}

	public static void main(String[] args) {
		Employee employee = new Employee("John", 50000, LocalDate.of(2021, 03, 15));
		LocalDate lastDate = LocalDate.of(2023, 10, 26);
		employee.empDuration(employee.hireDate, lastDate);

	}

}
