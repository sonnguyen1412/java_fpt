package studentManager;

import java.util.Scanner;

public class studentTest {

	public studentTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		studenManager studenManager = new studenManager();
		student student = new student();
		Scanner sc = new Scanner(System.in);
		boolean choose = true;

		show();
	  do {
			System.out.println("nhap lua chon: ");
			int key = sc.nextInt();
			switch (key) {
			case 1:
				studenManager.nhap();
				break;
			case 2:
				studenManager.xuat();
				break;
			case 3:
				studenManager.sortMark();
				break;
			case 4:
				studenManager.seachRollNo();
				break;
			case 5:
				studenManager.sortNameStudent();
				break;
			case 6:
				studenManager.sortHocBong();
				break;
			case 7:
				System.out.println("thoat");
				choose=false;
				break;
			default:
				System.err.println("loi ");
				break;
			}
	  }
	  while(choose);
	

	}

	static void show() {
		System.out.println("1. nhap n sinh vien");
		System.out.println("2. hien thi tat ca sinh vien ra man hinh");
		System.out.println("3. hien thi sinh vien gioi va kem nhat");
		System.out.println("4. nhap ma sinh vien can tim kiem");
		System.out.println("5. hien thi sinh vien theo bang chu cai abc");
		System.out.println("6. hien thi tat ca sinh vien hoc bong theo diem");
		System.out.println("7. thoat");
	}
}
