package tales.akiba.seldesian.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tales.akiba.seldesian.dao.UserMapper;

@Service
public class UserService {
	
	@Autowired
	UserMapper userDao;
	
	public String userReturner() {
		return userDao.userCheak();
	}

}
