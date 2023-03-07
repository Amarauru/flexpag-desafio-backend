package com.flexpag.paymentscheduler.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flexpag.paymentscheduler.model.PaymentModel;

@Repository
public interface PaymentRepository extends JpaRepository <PaymentModel, Long> {
	
	

}
