package com.cg.payroll.client;

import java.util.Scanner;

import com.cg.payroll.services.PayrollServices;
import com.cg.payroll.services.PayrollServicesImpl;

public class MainClass {

	public static void main(String[] args){
		PayrollServices services=new PayrollServicesImpl();
		Scanner sc = new Scanner(System.in);


//		int associateId=services.acceptAssociateDetails("Tobi", "bbbbb", "testing",
//				"tester", "56433", "tgtfd@gmail.com", 1000, 40000,210, 190, 12345, "citi bank",
//				"245445");
//
//		System.out.println("Associate id : "+ associateId);
		System.out.println("Enter id:");
		int id = sc.nextInt();
		 System.out.println(services.getAssociateDetails(id));
		 /* Scanner(System.in); System.out.println("Enter id: "); int id = sc.nextInt();
		 * int netSalary = services.calculateNetSalary(id);
		 * System.out.println(netSalary);
		 */


	}

}
