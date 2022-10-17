package com.gl.caseStudy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gl.caseStudy.bean.Bill;

public interface BillRepository extends JpaRepository<Bill, Long> {
	@Query("select max(id) from Bill")
	public Long findMaxBillId();
}
