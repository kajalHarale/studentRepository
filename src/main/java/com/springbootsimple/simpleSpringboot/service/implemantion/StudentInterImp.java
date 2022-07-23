package com.springbootsimple.simpleSpringboot.service.implemantion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springbootsimple.simpleSpringboot.controller.Repository.studentRepository;
import com.springbootsimple.simpleSpringboot.entity.studentEntity;
import com.springbootsimple.simpleSpringboot.service.studentService;
@Service
public class StudentInterImp implements studentService {
	@Autowired
	studentRepository studentrepo;
	@Override
	public List<studentEntity> getallStudent(){
		 return(List<studentEntity>)studentrepo.findAll();
	}
	@Override
	public void saveallstudent(studentEntity studententity) {
		studentrepo.save(studententity);
		
	}

}
