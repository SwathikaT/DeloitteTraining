package com.deloitte.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmplyeeMain {

	public EmplyeeMain() {

	}

	public static void main(String[] args) {
		EmplyeeBo b = new EmplyeeBo();
		EmplyeeSort s = new EmplyeeSort();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of Employees: ");
		int number = sc.nextInt();

		ArrayList<EmplyeeVo> list = new ArrayList<EmplyeeVo>();

		try {
			for (int i = 0; i < number; i++) {
				System.out.println("Enter The ID: "+(i+1));
				int id = sc.nextInt();
				System.out.println("Enter The EmpName: "+(i+1));
				String EmpName = sc.next();
				System.out.println("Enter The AnnualIncome: "+(i+1));
				double annual = sc.nextDouble();
				list.add(new EmplyeeVo(id, EmpName, annual, 0));
				b.CalincomeTax(list.get(i));
			}
		} catch (Exception e) {
			
			System.out.println("Enter valid values");
		}
		
		for (EmplyeeVo emplyeeVo : list) {
			System.out.println(emplyeeVo);
		}
		Collections.sort(list, s);
		
		System.out.println("\n\nSORTED LIST : ");
		for (EmplyeeVo emplyeeVo : list) {
			System.out.println(emplyeeVo);
		}
		sc.close();

	}

}

