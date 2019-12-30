package studentManager;

import java.util.Scanner;

import com.sun.org.apache.xml.internal.serializer.ElemDesc;

public class student extends person {
	Scanner sc = new Scanner(System.in);
	public String rollNo; // ma sinh vien
	public String email;
	public float mark;

	public student() {

	}

	public student(String name, String birthday, String address, String gender, String rollNo, String email,
			float mark) {
		super(name, birthday, address, gender);
		this.rollNo = rollNo;
		this.email = email;
		this.mark = mark;
	}

	public String getRollNo() {
		return rollNo;
	}

	public boolean setRollNo(String rollNo) {
		if (rollNo.length() == 8) {
			this.rollNo = rollNo;
			return true;
		} else {
			System.err.print("nhap lai ");
			return false;
		}
	}

	public String getEmail() {
		return email;
	}

	@SuppressWarnings("deprecation")
	public boolean setEmail(String email) {
		int count = 0;
		int empty = 0;

		for (int i = 0; i < email.length(); i++) {
			char kiTu = email.charAt(i);
			if (Character.toString(kiTu).equals("@")) {
				count++;
			}
			if (Character.isWhitespace(kiTu)) {
				empty++;
			}
		}
		if (count == 1 && empty == 0) {
			this.email = email;
			return true;
		} else {
			System.err.print("nhap lai");
			return false;
		}
	}

	public float getMark() {
		return mark;
	}

	public boolean setMark(float mark) {
		if (mark >= 0.0 && mark <= 10.0) {
			this.mark = mark;
			return true;
		} else {
			System.err.print("nhap lai: ");
			return false;
		}
	}

	@Override
	public void inputInfo() {
		// TODO Auto-generated method stub
		super.inputInfo();
		System.out.print("nhap ma sinh vien: ");
		while (!setRollNo(sc.next()))
			;

		System.out.print("nhap diem trung binh :");
		while (!setMark(sc.nextFloat()))
			;

		System.out.print("nhap email :");
		while (!setEmail(sc.next()))
			;

	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		super.showInfo();
		System.out.println("ma sinh vien: " + rollNo);
		System.out.println("diem trung binh: " + mark);
		System.out.println("email: " + email);
	}

	public String HocBong() {
		if (mark > 8.0) {
			return "sinh vien co hoc bong";
		} else {
			return "sinh vien ko co hoc bong";
		}
	}

}
