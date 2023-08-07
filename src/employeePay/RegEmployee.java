package employeePay;

public class RegEmployee extends Employee {
	String dept;
	long regPay;
	String regTitle;

	public RegEmployee(String ename, String esno, String dept, String regTitle, long regPay) {
		super(ename, esno);
		this.dept = dept;
		this.regTitle = regTitle;
		this.regPay = regPay;
	}

	@Override
	public String toString() {
		return super.toString() + ", 부서 : " + regTitle + ", 담당기획 : " + dept;
	}

	@Override
	public long earning() {
		return regPay + 10;
	}

}
