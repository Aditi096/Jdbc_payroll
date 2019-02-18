package com.cg.payroll.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.payroll.beans.Associate;
import com.cg.payroll.beans.BankDetails;
import com.cg.payroll.beans.Salary;
import com.cg.payroll.exceptions.AssociateDetailNotFoundException;
import com.cg.payroll.services.PayrollServices;
import com.cg.payroll.services.PayrollServicesImpl;
import com.cg.payroll.util.PayrollDBUtil;



public class PayrollServicesTest {
	private static PayrollServices payrollServices;
	
	/*@BeforeClass
	public static void setUpTestEnv() {
		payrollServices = new PayrollServicesImpl();
	}
	
	@Before
	public void setUpTestData() {
		Associate associate1=new Associate(101, 78000, "Kirito", "Saki", "Training", "Manager", "KJH355", "kitito@gmail.com", new Salary(50000, 200, 500), new BankDetails(23652, "Citi", "54626"));
		Associate associate2=new Associate(102, 78000, "Yui", "BBb", "Training", "Manager", "YDY354", "yui@gmail.com", new Salary(40000,210,190), new BankDetails(99952, "Citi", "jg545"));

		PayrollDBUtil.associates.put(associate1.getAssociateId(), associate1);
		PayrollDBUtil.associates.put(associate2.getAssociateId(), associate2);
		PayrollDBUtil.ASSOCIATE_ID_COUNTER=102;
	}
	
	@Test(expected=AssociateDetailNotFoundException.class)
		public void testGetAcceptAssociateDetailsForInvlaidAssociateId() {
		payrollServices.getAssociateDetails(1111);
	}
	
	@Test
	public void testGetAssociateDetailsForValidAssociateId() throws AssociateDetailNotFoundException{
		Associate expectedAssociate=new Associate(102, 78000, "Yui", "BBb", "Training", "Manager", "YDY354", "yui@gmail.com", new Salary(40000,210,190), new BankDetails(99952, "Citi", "jg545"));
		Associate actualAssociate = payrollServices.getAssociateDetails(102);
		Assert.assertEquals(expectedAssociate, actualAssociate);
	}
	
	@Test
	public void testAcceptAssociateDetailsForValidData() {
		int expectedId= 103;
		int actualId = payrollServices.acceptAssociateDetails("ABC", "pqr", "sandeep@sinha.com", "ytp", "CON", "abcd1234", 12345, 45678, 1234, 1234, 12345678, "citi", "citi1234");
		Assert.assertEquals(expectedId, actualId);
	}
	
	@Test(expected=AssociateDetailNotFoundException.class)
	public void testCalculateNetSalaryForInvalidAssociateId() throws AssociateDetailNotFoundException{
		payrollServices.calculateNetSalary(1234);
	}
	
	@Test
	public void testCalculateNetSalaryForValidAssociateId() throws AssociateDetailNotFoundException{
		int expectedNetSalary = 97240;
		int actualNetSalary = payrollServices.calculateNetSalary(102);
		Assert.assertEquals(expectedNetSalary, actualNetSalary);
	}
	
	
	@After
	public void tearDownTestData() {
		PayrollDBUtil.associates.clear();
		PayrollDBUtil.ASSOCIATE_ID_COUNTER=100;
	}
	
	@AfterClass
	public static void tearDownTestEnv() {
		payrollServices=null;
	}*/
}

