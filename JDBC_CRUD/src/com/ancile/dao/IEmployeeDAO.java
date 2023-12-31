package com.ancile.dao;

import java.sql.SQLException;

import com.ancile.bean.*;
public interface IEmployeeDAO {
	
	public boolean insertEmployee(Employee e) throws ClassNotFoundException, SQLException;
	
	public boolean readEmployee(Employee e) throws ClassNotFoundException, SQLException;
	
	public boolean updateEmployee(Employee e, int colVal)throws ClassNotFoundException, SQLException;
	
	public void deleteEmployee(Employee e) throws ClassNotFoundException, SQLException;


}
