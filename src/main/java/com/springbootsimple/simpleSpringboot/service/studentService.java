package com.springbootsimple.simpleSpringboot.service;
import java.util.List;
import org.springframework.stereotype.Service;
import com.springbootsimple.simpleSpringboot.entity.studentEntity;
@Service
public interface studentService {
	public List<studentEntity> getallStudent();
	public void saveallstudent(studentEntity studententity);
	
}

