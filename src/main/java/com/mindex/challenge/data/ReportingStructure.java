package com.mindex.challenge.data;

public class ReportingStructure {
	private String employeeName;
	private long numberOfReports;

	public ReportingStructure(String empName, long numberOfReports) {
		super();
		this.employeeName = empName;
		this.numberOfReports = numberOfReports;
	}

	public String getEmpName() {
		return employeeName;
	}

	public void setEmpName(String empName) {
		this.employeeName = empName;
	}

	public long getNumberOfReports() {
		return numberOfReports;
	}

	public void setNumberOfReports(long numberOfReports) {
		this.numberOfReports = numberOfReports;
	}

}
