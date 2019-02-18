package com.cg.payroll.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.easymock.EasyMock;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.payroll.beans.Associate;
import com.cg.payroll.beans.BankDetails;
import com.cg.payroll.beans.Salary;
import com.cg.payroll.daoservices.AssociateDAO;
import com.cg.payroll.exceptions.AssociateDetailNotFoundException;
import com.cg.payroll.services.PayrollServices;
import com.cg.payroll.services.PayrollServicesImpl;

public class PayrollServicesTestEasyMock {
	private static PayrollServices payrollServices;
	private static AssociateDAO mockAssociateDAO;
	@BeforeClass
	public static void setUpTestEnv() {
		mockAssociateDAO = EasyMock.mock(AssociateDAO.class);
		payrollServices = new PayrollServicesImpl(mockAssociateDAO);
	}
	@Before
	public static void  setUpTestMockData() {
		Associate associate1=new Associate(101, 78000, "Kirito", "Saki", "Training", "Manager", "KJH355", "kitito@gmail.com", new Salary(35000,1800,1800), new BankDetails(23652, "Citi", "54626"));
		Associate associate2=new Associate(102, 50000, "Yui", "BBb", "Training", "Manager", "YDY354", "yui@gmail.com", new Salary(55900, 500, 900), new BankDetails(99952, "Citi", "jg545"));
		Associate associate3=new Associate(103, 50000, "AAA", "ZZZ", "Training", "Manager", "ZZZ999", "AAA@gmail.com", new Salary(10000, 200, 200), new BankDetails(10002, "Citi", "zz500"));

		ArrayList<Associate> associateList =  new ArrayList<>();
		associateList.add(associate1);
		associateList.add(associate2);
		
		EasyMock.expect(mockAssociateDAO.save(associate3)).andReturn(associate3);
		
		EasyMock.expect(mockAssociateDAO.findOne(101)).andReturn(associate1);
		EasyMock.expect(mockAssociateDAO.findOne(102)).andReturn(associate2);
		EasyMock.expect(mockAssociateDAO.findOne(1234)).andReturn(null);
		EasyMock.expect(mockAssociateDAO.findAll()).andReturn(associateList);
		EasyMock.expect(mockAssociateDAO);	
	}
	
	@Test(expected=AssociateDetailNotFoundException.class)
	public void testGetAssociateDetailsForInvalidAssociateId()throws AssociateDetailNotFoundException{
		payrollServices.getAssociateDetails(1234);
		EasyMock.verify(mockAssociateDAO.findOne(1234));
	}
	@Test
	public void testGetAssociateDetailsForValidAssociateId()throws AssociateDetailNotFoundException{
		Associate exceptedAssociate = new Associate(101, 78000, "Kirito", "Saki", "Training", "Manager", "KJH355", "kitito@gmail.com", new Salary(35000,1800,1800), new BankDetails(23652, "Citi", "54626"));
		Associate actualAssociate = payrollServices.getAssociateDetails(101);
		assertEquals(exceptedAssociate, actualAssociate);
		EasyMock.verify(mockAssociateDAO.findOne(101));
	}
	@After
	public void tearDownTestMockData() {
		EasyMock.resetToDefault(mockAssociateDAO);
	}
	@AfterClass
	public static void tearDownTestEnv() {
		mockAssociateDAO=null;
		payrollServices=null;
	}
}
