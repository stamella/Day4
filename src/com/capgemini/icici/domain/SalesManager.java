package com.capgemini.icici.domain;

public class SalesManager extends Employee {
		private double calculatePetrolAllowance;
		private double calculateFoodAllowance;
		private double calculateOtherAllowance;

		public SalesManager() {
			super();
		}

		public SalesManager(int employeeID, String employeeName, double basicSalary, double medical) {
			super(employeeID, employeeName, basicSalary, medical);
		}


		public double getCalculatePetrolAllowance() {
			calculatePetrolAllowance = 0.08 * getBasicSalary();
			return calculatePetrolAllowance;
		}

		public double getCalculateFoodAllowance() {
			calculateFoodAllowance = 0.13 * getBasicSalary();
			return calculateFoodAllowance;
		}

		public double getCalculateOtherAllowance() {
			calculateOtherAllowance = 0.03 * getBasicSalary();
			return calculateOtherAllowance;
		}

}