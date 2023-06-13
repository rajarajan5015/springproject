package com.onesoft;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("car")
public class CarController {
	@Autowired
	CarService cs;

	@PostMapping("/addcars")
	public String addcars(@RequestBody List<Car> a) {
		return cs.addcars(a);

	}

	@PutMapping("update")
	public String updatecar(@RequestBody Car a) {
		return cs.updatecar(a);
	}

	@PatchMapping("brandupdate")
	public String updatepatch(@RequestBody Car a) {
		return cs.updatepatch(a);
	}

	@GetMapping("/getall")
	public List<Car> getall() {
		return cs.getall();
	}

	@GetMapping("/getcar/{a}")
	public Car getcar(@PathVariable int a) {
		return cs.getcar(a);
	}

	@GetMapping("/max")
	public Car max() {
		return cs.max();
	}

	@GetMapping("/min")
	public Car min() {
		return cs.min();
	}

}
