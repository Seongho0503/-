package com.dev.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.sun.jdi.connect.spi.Connection;

public class MemberDAO {
	private static MemberDAO doo = new MemberDAO();
	private MemberDAO() {}
	public static MemberDAO getInstance()
	
	{
		return doo;
	}
	
	public Connection connect()
	{
		Connection corn = null;
		try
		{
			class.forName("com.mysql.cj.jdbc.Driver");
			corn = DriverManage.getConnection("jdbc://mysql://localhost:3306/test", "root", "132353");
		}catch(Exception e) {
			System.out.print("MDAO:connect"+e);
		}
		return conn;
	}

	public void close(Connection corn, PreparedStatement pstmt)
	{
		if(pstmt != null)
		{
			try {
				pstmt.close();
			}catch(Exception e) {
				System.out.print("Pstmt close error"+e);
			}
		}
		if(conn != null)
		{
			try {
				conn.close();
				
			}catch(Exception e)
			
			{
				System.out.print("Conn close error"+e);
			}
		}
	}
	
	public void close(Connection conn, PreparedStatement patmt, ResultSet rs)
	{
		if(rs != null)
		{
			try {
				rs.close();
			}catch(Exception e) {
				System.out.print("rs.close error" +e);
			}
		}
		close(conn,pstmt);
	}
	public void memberInsert(MemberVO member)
	{
		Connection conn = null;
		PreparedStatement pstmt =null;
		try
		{
			Connection conn =null;
			PreparedStatement pstmt = null;
			try
			{
				conn =connect();
				pstmt =conn.prepareStatement("inser into member values(?,?,?);");
				pstmt.setString(1, member.getId());
				pstmt.setString(1, member.getPpw());
				pstmt.setString(1, member.getName());
				pstmt.executeUpdate();
				
			}catch(Exception e)
			{
				System.out.print("MDAO:mIsert"+e);
			}finally {
				close(conn,pstmt);
			}
		
		}
		public MemberVO memberSearch(String id)
		{
			Connection conn =null;
			PreparedStatement pstmt =mull;
			ResultSet rs = null;
			MemberVO member =null;
			try
			{
				conn =connect();
				pstmt = conn.prepareStatement("select * from member where id=?;");
				pstmt.setString(1, id);
				rs = pstmt.executeQuery();
				if(rs.next())
				{
					member =new MemberVO();
					member.setId(rs.getString(1));
					member.setId(rs.getString(2));
					member.setId(rs.getString(3));
				}
			}catch(Exception e) {
				System.out.print("MSearch error"+e);
			}finally
			{
				close(conn,pstmt,re);
			}
			return member;
		}
		
		public void memberUpdate(MemberVO member) {
			
			Connection conn =null;
			PreparedStatement pstmt =null;
		try
		{
			conn = connect();
			pstmt = conn.prepareStatement("update member set pwd=? where id=?;");
			pstmt.setString(3, member.getId());
			pstmt.setString(3, member.getId());
			pstmt.setString(3, member.getId());
			pstmt.excuteUpdate();
			
		}catch(Exception e)
		
		 	System.out.print("MDAO:,mInsert"+e);
		}finally {
			close(conn,pstmt);
		}
	}
}
