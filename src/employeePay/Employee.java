package employeePay;

public class Employee {
	String name;
	String sno;

	// 생성자
	public Employee(String ename, String esno) {
		this.name = ename;
		this.sno = esno;
	}

	public String toString() {
		String str = "이름 : " + name + " 사원번호 : " + sno;
		return str;

	}

	public long earning() {
		return 0l;
	}

}
