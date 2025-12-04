package com.jspiders.ems.data;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDAO {
    private final String dbUrl= "jdbc:mysql://localhost:3306/ems";
    private final String user = "root";
    private final String password = "lakshmi36635";

    public void save(EmployeeDTO empDto)
    {
        String insertSql = "Insert into ems.empl values(0,?,?,?,?,?,?,null);";
        try
        {
            Connection con = DriverManager.getConnection(dbUrl,user,password);
            PreparedStatement psm1 = con.prepareStatement(insertSql);

            //set data
            String name = empDto.getName();
            psm1.setString(1,name);
            psm1.setString(2, empDto.getJob());
            psm1.setInt(3, empDto.getMgr());
            psm1.setString(4, empDto.getHireDate());
            psm1.setInt(5, empDto.getSal());
            psm1.setInt(6, empDto.getComm());

            psm1.executeUpdate();//insert data to emp-table

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
//    public void view(EmployeeDTO empDto) {
//    }
//        public void v1() {
//
//            String viewsql = "select * from empl where empid=?;";
//        }



}
