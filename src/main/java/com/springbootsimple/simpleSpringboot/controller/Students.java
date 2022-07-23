package com.springbootsimple.simpleSpringboot.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.springbootsimple.simpleSpringboot.controller.Repository.studentRepository;
import com.springbootsimple.simpleSpringboot.entity.studentEntity;
import com.springbootsimple.simpleSpringboot.service.implemantion.StudentInterImp;
@RestController
public class Students {
	@Autowired
	StudentInterImp studentService;
	@GetMapping("/student")
	public List<studentEntity>getallStudent(){
	  return studentService.getallStudent();
}
	@PostMapping(path="/addStudent")
	public void addNewStudent(@RequestBody studentEntity studentenitity)
	{
		 studentService.saveallstudent(studentenitity);
	}
}
