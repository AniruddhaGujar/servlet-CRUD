package com.jsp.service;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class StudentService {
	
	StudentDao studentDao = new StudentDao();
	
	public Student saveStudent (Student student) {
		

		return studentDao.saveStudent(student);
	}

}
