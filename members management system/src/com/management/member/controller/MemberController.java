package com.management.member.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.management.member.dao.MemberDAO;
import com.management.member.entity.Member;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	// inject the member dao
	@Autowired
	private MemberDAO memberDAO;
	
	
	@RequestMapping("/list")
	public String listMembers(Model model) {
		
		List<Member> members = memberDAO.getMembers();
		
		model.addAttribute("members",members);
		
		return "list-members";
	}

}
