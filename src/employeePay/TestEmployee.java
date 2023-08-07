package employeePay;

import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("입력 자료 수 : ");
		int n = in.nextInt();
		Employee[] emp = new Employee[n];
		for (int i = 0; i < n; i++) {
			System.out.print("사원번호, 이름 ...");
			String a = in.next();
			String b = in.next();
			Employee e = new Employee(a, b);
			System.out.print("사원의 근무 유형(1.CEO,2.정규직,3.임시직): ");
			int z = in.nextInt();
			switch (z) {
			case 1:
				System.out.print("직책 , 월임금 :");
				String c = in.next();
				long d = in.nextLong();
				Staff st = new Staff(a, b, c, d);
				emp[i] = st;
				break;
			case 2:
				System.out.print("부서, 업무, 월임금...");
				String f = in.next();
				String g = in.next();
				long y = in.nextLong();
				RegEmployee re = new RegEmployee(a, b, f, g, y);
				emp[i] = re;
				break;
			case 3:
				System.out.print("부서, 월 근무시간 수...");
				String h = in.next();
				long u = in.nextLong();
				TempEmployee te = new TempEmployee(a, b, h, u);
				emp[i] = te;
				break;
			case 4:
				System.out.println("근무유형 오류 재입력...");
				i--;
				break;
			}
		}
		System.out.println("급여보고서");
		for (Employee e : emp) {
			System.out.println(e + " 급여액 : " + e.earning() + "만원");
		}
	}

}
