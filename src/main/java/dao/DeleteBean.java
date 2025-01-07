package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteBean {
	private int empno;
	
	public DeleteBean() {
		super();
	}
	public DeleteBean(int empno) {
		super();
		this.empno=empno;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}
	
	public int delete(int empno)
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
			
			String query = "DELETE FROM emp1 WHERE empno = ?";
			psmt = con.prepareStatement(query);
			
			psmt.setInt(1, empno);
			
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
