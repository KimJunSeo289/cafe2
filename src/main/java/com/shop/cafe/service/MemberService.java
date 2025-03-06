package com.shop.cafe.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.shop.cafe.dao.MemberDao;
import com.shop.cafe.dto.Member;

@Service
public class MemberService {
	@Autowired
	MemberDao memberDao;
	
	public void insertMember(Member m) throws Exception {
		memberDao.insertMember(m);
	}

	public Member login(Member m) throws Exception {
		return memberDao.login(m);
		
	}

}
