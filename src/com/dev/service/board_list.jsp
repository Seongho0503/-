<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<title>게시판 목록</title>
</head>

<table  border=1>
	<tr>
		<td width=50><p align=center>번호</p></td>
		<td width=100><p align=center>이름</p></td>
		<td width=320><p align=center>제목</p></td>
		<td width=100><p align=center>등록일</p></td>
		<td width=100><p align=center>조회수</p></td>
	</tr>
</table>

<table >
	<tr>
		<td><input type=button value="글쓰기" OnClick="window.location='board_write.jsp'"></td>
	</tr>
</table>