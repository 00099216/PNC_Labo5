package com.uca.capas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.dao.StudentDAO;
import com.uca.capas.domain.Student;

@Controller
public class MainController {

	@Autowired
	private StudentDAO studentDao;
	
	@RequestMapping("/")
	public ModelAndView initMain() {
		ModelAndView mav =new ModelAndView();
		Student students = new Student();
		mav.addObject("students", students);
		mav.setViewName("main");
		return mav;
	}
	
	@RequestMapping("/formData")
	public ModelAndView formData(@RequestParam(value="cStudent") Integer code, @ModelAttribute Student student) {
		ModelAndView mav = new ModelAndView();
		Student studente = null;
		try {
			if (code == null) {
				mav.addObject("message", "No hay ningun estudiante registrado con ese codigo");
			}else {
				studente = studentDao.findOne(code);
				mav.addObject("students", studente);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		mav.setViewName("form");
		return mav;
	}
	
}
