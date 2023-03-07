package com.flexpag.paymentscheduler.controller;

import java.util.List;

import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flexpag.paymentscheduler.model.PaymentModel;
import com.flexpag.paymentscheduler.model.PaymentStatus;
import com.flexpag.paymentscheduler.repository.PaymentRepository;
import com.flexpag.paymentscheduler.service.PaymentService;

@RestController
@RequestMapping (value = "/payment")
public class PaymentController {
	
	@Autowired
	private PaymentService paymentService;
		
	@GetMapping
	public ResponseEntity<List<PaymentModel>> listAll() {
		List<PaymentModel> payments = paymentService.getAll();
		return ResponseEntity.ok().body(payments);
	}
	
	
	@PostMapping
	public ResponseEntity<Long> savePayment(@RequestBody PaymentModel payment) {
		payment = paymentService.create(payment);
		return ResponseEntity.ok().body(payment.getId());
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<PaymentModel> updateByStatus(@PathVariable Long id, @RequestBody PaymentModel payment) {

		PaymentModel pay = paymentService.update(id, payment);
		return ResponseEntity.ok().body(pay);
	}
	@DeleteMapping
	public ResponseEntity<PaymentModel> delete (@PathVariable long id){
		PaymentService.delete(id);
		return new ResponseEntity<> (HttpStatus.NO_CONTENT);
	}

}
