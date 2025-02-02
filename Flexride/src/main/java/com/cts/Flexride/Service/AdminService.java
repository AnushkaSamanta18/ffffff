package com.cts.Flexride.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.Flexride.Entity.AdminEntity;
import com.cts.Flexride.Repo.AdminRepo;

@Service
public class AdminService {
	
	@Autowired
	private AdminRepo adminrepo;
	
	public AdminEntity addAdminEntity(AdminEntity admin) {
		AdminEntity  a = this.adminrepo.save(admin);
		return a ; 

}
}
