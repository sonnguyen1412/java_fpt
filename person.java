package studentManager;

import java.util.Scanner;

public class person {
	public String name;
	public String birthday;
	public String address;
	public String gender;
	Scanner sc = new Scanner(System.in);

	public person(String name, String birthday, String address, String gender) {
		this.name = name;
		this.birthday = birthday;
		this.address = address;
		this.gender = gender;
	}

	public person() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void inputInfo() {
		System.out.print("nhap name: ");
		name = sc.next();
		System.out.print("nhap ngay sinh: ");
		birthday = sc.next();
		System.out.print("nhap gioi tinh: ");
		gender = sc.next();
		System.out.print("nhap dia chi: ");
		address = sc.next();
	}
	public void showInfo() {
		System.out.println("name: "+name);
		System.out.println("ngay sinh: "+birthday);
		System.out.println("gioi tinh: "+gender);
		System.out.println("dia chi: "+address);
		
	}
	
}
