package org.yicou.service;

import java.util.ArrayList;

import org.yicou.beans.UserBean;

public interface UserService {
	public boolean insert(UserBean user);
	public boolean insertUsers(ArrayList<UserBean> users);
	public boolean update(UserBean user);
	public boolean deleteByUid(int uid);
	public boolean deleteAll();
	public boolean isExistByUid(int uid);
	public boolean isExistByUserName(String username);
	public boolean isExistByEmail(String email);
	public ArrayList<UserBean> queryUsersBySql(String sqlstr);
	public UserBean queryUserBySql(String sqlstr);
}
