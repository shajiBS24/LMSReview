//package com.lms;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.junit.Assert;
//import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
//import org.junit.jupiter.api.Order;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestMethodOrder;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import com.lms.bean.Laptop;
//import com.lms.controller.LMSController;
//
//@TestMethodOrder(OrderAnnotation.class)
//@SpringBootTest
//class SbLmsApplicationTests {
//	@Autowired
//	private LMSController lmscontroller;
//
//	String insert;
//	String update;
//	String delete;
//	String result;
//	String result1;
//
//	List<Laptop> list = new ArrayList<Laptop>();
//	List<Laptop> list1 = new ArrayList<Laptop>();
//	Laptop lms1;
//	Laptop lms2;
//
//	@Test
//	@Order(1)
//	void contextLoads() {
//
//	}
//
//	@Test
//	@Order(2)
//	void testPerformInsert() {
//		Laptop lms = new Laptop();
//		lms.setLaptopId(13);
//		lms.setLaptopBrandname("DELL");
//		lms.setLaptopModelname("Dell11");
//		lms.setLaptopPrice(100000);
//		insert = "Inserted";
//		result = lmscontroller.performInsert(lms);
//		Assert.assertEquals(insert, result);
//	}
//
//	@Test
//	@Order(3)
//	void testPerformUpdate() {
//		Laptop lms = new Laptop();
//		lms.setLaptopId(11);
//		lms.setLaptopBrandname("ACER");
//		lms.setLaptopModelname("Acer13");
//		lms.setLaptopPrice(100000);
//		update = "Updated";
//		result = lmscontroller.performUpdate(lms);
//		assertEquals(update, result);
//	}
//
//	@Test
//	@Order(4)
//	void testPerformDelete() {
//		delete = "Deleted";
//		result = lmscontroller.performDelete(13);
//		result1 = lmscontroller.performDelete(11);
//		assertEquals(delete, result);
//	}
//
//	@Test
//	@Order(5)
//	void testGetAllLaptops() {
//		list = lmscontroller.getAllLaptops();
//		lms1 = new Laptop(10, "HP", "HP13", 100000);
//		lms2 = new Laptop(11, "Acer", "Acer24", 100000);
//		list1.add(lms1);
//		list1.add(lms2);
//		list.equals(list1);
//	}
//
//}
