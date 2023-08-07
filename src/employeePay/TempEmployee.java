package employeePay;

public class TempEmployee extends Employee {
	String dept;
	long tempHour;

	public TempEmployee(String ename, String esno, String dept, long tempHour) {
		super(ename, esno);
		this.dept = dept;
		this.tempHour = tempHour;
	}

	@Override
	public String toString() {
		return super.toString() + "부서 : " + dept;
	}

	@Override
	public long earning() {
		return tempHour * 3;
	}

}
