package employeePay;

public class Staff extends Employee {

	String title;
	long staffpay;

	public Staff(String ename, String esno, String title, long staffPay) {
		super(ename, esno);
		this.title = title;
		this.staffpay = staffPay;
	}

	@Override
	public String toString() {
		return super.toString() + ", 직책 : " + title;
	}

	@Override
	public long earning() {
		return staffpay + 20;
	}
}
