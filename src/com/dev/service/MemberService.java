package com.dev.service;

public class MemberService {
	private static MemberService service =new MemberService();
	public MemberDAO dao = MemberDAO.getInstance();
	private MemberService() {}

	public static MemberService getInstance()
	{
		return service;
	}
	
	public void memberInsert(MemberVO member)
	
	{
		dao.memberInsert(member);
	}
	
	public MemberVO memberSearch(string id)
	{
		MemberVO member =dao.memberSearch(id);
		return member;
	}
	
	public void memberUpdate(MemberVO member)
	{
		dao.memberUpdate(member);
	}
}
