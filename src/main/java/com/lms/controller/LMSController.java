package com.lms.controller;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lms.bean.Laptop;
import com.lms.dao.LaptopDAO;



@RestController
@CrossOrigin("http://localhost:4200/")
public class LMSController {

	@Autowired
	LaptopDAO dao;
	
	@PostMapping("/PerformInsert")
	public String PerformInsert(@RequestBody Laptop lms) {
		dao.save(lms);
		return "Inserted";
	}
	
	@PutMapping("/PerformUpdate")
	public String PerformUpdate(@RequestBody Laptop lms) {
		dao.save(lms);
		return "Updated";
	}
	
	@DeleteMapping("/PerformDelete/{laptopId}")
	public String PerformDelete(@PathVariable ("laptopId") int laptopId) {
		dao.deleteById(laptopId);
		return "Deleted";
	}
	
	@GetMapping("/ViewAll")
	public List<Laptop> getAllLaptops() {
		System.out.println("Inside View All");
		Iterator<Laptop> it = dao.findAll().iterator();
		List<Laptop> list = new ArrayList<Laptop>();
		while(it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
}
