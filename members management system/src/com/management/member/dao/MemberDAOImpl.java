package com.management.member.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.management.member.entity.Member;

@Repository
public class MemberDAOImpl implements MemberDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	@Transactional
	public List<Member> getMembers() {
		
		Session session = sessionFactory.getCurrentSession();
		
		List<Member> members = session.
				createQuery("from Member",Member.class)
				.getResultList();
				
		return members;
	}

}
 