package com.capgemini.icici.domain;

public class President extends Employee {

		private double kilometresTravelled;
		private double tourAllowance;
		private static double telephoneAllowance = 2000;

		public President() {
			super();
			
		}

		public President(int employeeID, String employeeName, double basicSalary, double medical) {
			super(employeeID, employeeName, basicSalary, medical);
			
		}

		public double getKilometresTravelled() {
			return kilometresTravelled;
		}

		public void setKilometresTravelled(double kilometresTravelled) {
			this.kilometresTravelled = kilometresTravelled;
		}

		public double getTourAllowance() {
			tourAllowance = 8 * kilometresTravelled;
			return tourAllowance;
		}

		public double getTelephoneAllowance() {
			return telephoneAllowance;
		}

	}