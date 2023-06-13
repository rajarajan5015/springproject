package com.onesoft;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {
	@Autowired 
	CarDao cd;

	public String addcars(List<Car> a) {
		return cd.addcars(a);
	}

	public String updatecar(Car a) {
		return cd.updatecar(a);
	}

	public String updatepatch(Car a) {
		return cd. updatepatch(a);
	}

	public List<Car> getall() {
		return cd.getall();
	}

	public Car getcar(int a) {
		return cd.getcar(a);
	}

	public Car max() {
		return cd.max();
	}

	public Car min() {
		return cd.min();
	}


	

}
