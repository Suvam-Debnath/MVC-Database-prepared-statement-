package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class RegisterBean {
	private int empno;
	private String ename;
	private String job;
	private double sal;
	
	public RegisterBean() {
		super();
	}

	public RegisterBean(int empno, String ename, String job, double sal) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.sal = sal;
	}
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
	public int insert(int empno,String ename,String job,double sal)
	{
		int rn=0;
		
		Connection con=null;
		PreparedStatement psmt=null;
		try
		{
			String driver="oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			
			String url="jdbc:oracle:thin:@localhost:1521:XE";
			String userid="system";
			String password="suvam";
			
			con=DriverManager.getConnection(url,userid,password);
			
			String query = "INSERT INTO emp1(empno,ename,job,sal)VALUES(?,?,?,?)";
			psmt = con.prepareStatement(query);
			
			psmt.setInt(1, empno);
			psmt.setString(2, ename);
			psmt.setString(3, job);
			psmt.setDouble(4, sal);
			
			
			rn = psmt.executeUpdate();
			
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return rn;
	}
	
	

}
