package studentManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class studenManager {

	ArrayList<student> studentsList = new ArrayList<student>();
    ArrayList<student> hocbongList=new ArrayList<student>();
	Scanner sc = new Scanner(System.in);

	public void nhap() {
		System.out.print("nhap so luong sinh vien: ");
		int n =sc.nextInt();
		student student = new student();
		for (int i = 0; i < n; i++) {
			System.out.println("sinh vien thu "+(i+1)+":");
			student.inputInfo();
			studentsList.add(student);
		}
	}

	public void xuat() {
		for (student student : studentsList) {
			student.showInfo();
		}
	}

	// chon sinh vien co diem so trung binh cao nhat va thap nhat
	public void sortMark() {
		Collections.sort(studentsList, new Comparator<student>() {
			public int compare(student o1, student o2) {
				return o1.getMark() > o2.getMark() ? 1 : -1;
			}
		});
		System.out.print("sinh vien co diem so cao nhat: ");
		studentsList.get(0).showInfo();
		System.out.print("sinh vien co diem thap nhat: ");
		studentsList.get(studentsList.size() - 1).showInfo();
		;
	}

	// tim kiem sinh vien
	public void seachRollNo() {
        int count=0;
		System.out.print("nhap ma sinh vien: ");
		String maSinhVien = sc.next();
		for (student student : studentsList) {
			if (student.getRollNo().equals(maSinhVien.trim())) {
				student.showInfo();
				count++;
			} 
		}
		if(count==0) {
			System.out.print("ko tim thay sinh vien do:");
		}
		
	}

	// hien thi sinh vien theo bang chu cai
	public void sortNameStudent() {
		Collections.sort(studentsList, new Comparator<student>() {
			public int compare(student o1, student o2) {
				return o1.getName().compareToIgnoreCase(o2.getName());
			}
		});
		xuat();
	}

	// hien thi tat ca sinh vien duoc hoc bong xep tu cao xuong thap
	public void sortHocBong() {
		for(student student: studentsList) {
			if(student.getMark()>8.0) {
				hocbongList.add(student);
			}
		}
		Collections.sort(hocbongList,new Comparator<student>() {
			public int compare(student o1,student o2) {
				return o1.getMark()>o2.getMark()?1:-1;
			}
		});
		xuat();
	
	}
}
