package com.jspiders.ems.util;
import com.jspiders.ems.data.EmployeeDTO;

public class EmployeeDtoValidator {
    public static void validate(EmployeeDTO empDto)
    {
        String name = empDto.getName();
        validateName(name);

        String job = empDto.getJob();
        validateJob(job);

        Integer mgr = empDto.getMgr();
        validateMgr(mgr);

        String hiredate = empDto.getHireDate();
        validatehireDate(hiredate);

        Integer sal = empDto.getSal();
        validateSal(sal);

        Integer comm = empDto.getComm();
        validateComm(comm);



    }

    public static void validateName(String name)
    {
        if(name.length() < 3 || name.length() > 45 || name==null||name.trim().isEmpty())
        {
            System.err.println("VALIDATION FOR NAME FAILED");
            throw new IllegalArgumentException("Name should be min-3 or max-45 chars");
        }
    }
    public static void validateJob(String job) {
        if(job.length() < 3 || job.length() > 45 || job==null||job.trim().isEmpty())
        {
            System.err.println("VALIDATION FOR JOB FAILED");
            throw new IllegalArgumentException("Job should be min-3 or max-45 chars");
        }

    }
    public static void validatehireDate(String hiredate) {
        String today="07-11-2025";
        if(hiredate==null||hiredate.trim().isEmpty()||hiredate.compareTo(today)>0)
        {
            System.err.println("VALIDATION FOR HIREDATE FAILED");
            throw new IllegalArgumentException("hiredate should not be null or blank and also hiredate should not be future dates");
        }

    }

    public static void validateMgr(Integer mgr) {
        if( mgr==null|| mgr<=0)
        {
            System.err.println("VALIDATION FOR MGR FAILED");
            throw new IllegalArgumentException("mgr number should not be negative or zero");
        }

    }

    public static void validateSal(Integer sal) {
        if(sal<0 || sal==null)
        {
            System.err.println("VALIDATION FOR SAL FAILED");
            throw new IllegalArgumentException("sal should not be negative or zero");
        }

    }
    public static void validateComm(Integer comm) {
        if (comm == null || comm < 0) {
            System.err.println("VALIDATION FOR COMM FAILED");
            throw new IllegalArgumentException("comm should not be negative number ");
        }

    }
}
