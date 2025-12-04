package com.jspiders.ems.services;
import com.jspiders.ems.data.EmployeeDTO;
import com.jspiders.ems.data.EmployeeDAO;
import com.jspiders.ems.util.EmployeeDtoValidator;


import java.util.Scanner;


public class EmployeeServiceImpl implements EmployeeService{
    private final Scanner scn1 = new Scanner(System.in);
    @Override
    public void addEmployee() {
        System.out.println("Enter employee Details");

        System.out.println("Enter employee name");
        String name = scn1.next();
        System.out.println("Enter employee job");
        String job = scn1.next();
        System.out.println("Enter employee mgr");
        Integer mgr = scn1.nextInt();
        System.out.println("Enter employee hireDate");
        String hireDate = scn1.next();
        System.out.println("Enter employee sal");
        Integer sal = scn1.nextInt();
        System.out.println("Enter employee comm");
        Integer comm = scn1.nextInt();

        EmployeeDTO empDto = new EmployeeDTO();
        empDto.setName(name);
        empDto.setJob(job);
        empDto.setMgr(mgr);
        empDto.setHireDate(hireDate);
        empDto.setSal(sal);
        empDto.setComm(comm);

        EmployeeDtoValidator.validate(empDto);

        EmployeeDAO empDao = new EmployeeDAO();
        System.out.println("Trying to save Employee Data");
        empDao.save(empDto);//Transfer data from Serv-DAO
        System.out.println("Employee Data Saved !!");
    }


//    public void viewEmployee() {
//
//    }
}
