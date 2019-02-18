package com.cg.payroll.client;
import java.util.Scanner;

import com.cg.payroll.exceptions.AssociateDetailNotFoundException;
import com.cg.payroll.services.PayrollServices;
import com.cg.payroll.services.PayrollServicesImpl;
public class MainClass {
	public static void main(String[] args) throws AssociateDetailNotFoundException{
		PayrollServices services=new PayrollServicesImpl();
		Scanner sc = new Scanner(System.in); 
        int index = 0;
        System.out.println("-----------------------:PayRoll Service System:-------------------------");
			System.out.println("Choose among the given options: ");
			System.out.println("1.Create Associate Account: ");
			System.out.println("2.Get Associate Detail:");
			System.out.println("3.Get All Associate Details: ");
			System.out.println("4.Calculate Net Salary:");
			
			System.out.println("Enter the function you want to perform: ");
			index =sc.nextInt();
			
			switch(index) {
			case 1: System.out.println("Enter the Associate Details:");
			System.out.println("Enter the first name:"); 
			String firstName=sc.next();
			System.out.println("Enter the last name:"); 
			String lastName=sc.next();
			System.out.println("Enter the emailId:"); 
			String emailId = sc.next();
			System.out.println("Enter the department:");
			String department = sc.next();
			System.out.println("Enter the yearlyInvestmentUnder8oC:"); 
			int yearlyInvestmentUnder80C = sc.nextInt();
			System.out.println("Enter the designation:"); 
			String designation = sc.next();
			System.out.println("Enter the pan card: "); 
			String pancard = sc.next();
			System.out.println("Enter the basic salary: "); 
			int basicSalary=sc.nextInt();
			System.out.println("Enter the company HRA: "); 
			int hra=sc.nextInt();
			System.out.println("Enter the epf: "); 
			int epf=sc.nextInt();
			System.out.println("Enter the company pf: "); 
			int companyPf=sc.nextInt();
			System.out.println("Enter the bank account number: "); 
			int accountNumber=sc.nextInt();
			System.out.println("Enter the bank name: ");
			String bankName=sc.next(); 
			System.out.println("Enter the bank ifsc code: ");
			String ifscCode = sc.next(); 
			
			int associateId=services.acceptAssociateDetails(firstName, lastName, department, designation, pancard, emailId, yearlyInvestmentUnder80C, basicSalary, epf, companyPf, accountNumber, bankName, ifscCode);
			
			System.out.println("-:Associate Account Created:-");
			System.out.println("Your Associate ID is : "+associateId);
			break; 
			case 2:System.out.println("Enter the Associate ID:"); associateId=sc.nextInt();
			System.out.println(services.getAssociateDetails(associateId)); 
			break; 
			case 3:System.out.println("Details of all Accounts:");
			System.out.println(services.getAllAssociatesDetails()); 
			break; 
			case 4:System.out.println("Enter the associate ID:"); 
			associateId = sc.nextInt();
			System.out.println("Net Salary of  "+associateId + " is:"); 
			int salary = services.calculateNetSalary(associateId); 
			System.out.println(salary);
			break;
			default:
				System.out.println("Invalid Option,Please Try Again!!!!!"); 
				}
			System.out.println("---------------------------------------------------------------------------------------"); 
			System.out.println("Do you want to continue?");
			System.out.println("1.Yes"); 
			System.out.println("2.No"); 
			int count =sc.nextInt();
			if(count==2) { 
				System.exit(0);
				}else { 
					main(null);
					}			
}}
