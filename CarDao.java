package com.onesoft;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CarDao {
	@Autowired
	CarRepository cr;

	public String addcars(List<Car> a) {
		cr.saveAll(a);
		return "saved";
	}

	public String updatecar(Car a) {
		cr.save(a);
		return "update";
	}

	public String updatepatch(Car a) {
		Car w=cr.findById(a.getId()).get();
		w.setBrand(a.getBrand());
		cr.save(a);
		return "update part";

	}

	public List<Car> getall() {
		return cr.findAll();
	}

	public Car getcar(int a) {
		return cr.findById(a).get();
	}

	public Car max() {
		return cr.max();
	}

	public Car min() {
		return cr.min();
	}


}
