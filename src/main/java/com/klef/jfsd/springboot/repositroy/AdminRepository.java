package com.klef.jfsd.springboot.repositroy;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.springboot.model.Admin;

@Repository
public interface AdminRepository extends CrudRepository<Admin,String>
{
	@Query("select a from Admin a where username=?1 and password=?2")
	public Admin checkadnminlogin(String uname,String pwd);
	
	@Query(" select count(*) from Customer")
	public int countcustomers();
	
	@Query(" select count(*) from BranchManager")
	public int countbms();
}
