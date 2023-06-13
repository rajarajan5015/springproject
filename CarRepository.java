package com.onesoft;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CarRepository  extends JpaRepository<Car, Integer>{
@Query(value="select * from test_db.cardetails where price=(select max(price)from test_db.cardetails) ",nativeQuery = true)
public Car max();
@Query(value = "select * from test_db.cardetails where price=(select min(price) from test_db.cardetails)",nativeQuery = true)
public Car min();

}
