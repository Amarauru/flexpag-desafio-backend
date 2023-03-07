package com.flexpag.paymentscheduler.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.flexpag.paymentscheduler.model.PaymentModel;
import com.flexpag.paymentscheduler.repository.PaymentRepository;


@Service

public class PaymentService {
	
	@Autowired
	private PaymentRepository paymentRepository;
	
	public List <PaymentModel> getAll(){
		return paymentRepository.findAll();
	}
	
	public PaymentModel create (@RequestBody PaymentModel payment) {
		
	
	PaymentModel object = new PaymentModel(0, payment.getNome(),payment.getValor());
		return paymentRepository.save(object);
	}
	
	public PaymentModel getById(@PathVariable("id") Long id){
        Optional<PaymentModel> foundPayment = paymentRepository.findById(id);
        return foundPayment.get();

	}



	public Object findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public PaymentModel update(Long id, PaymentModel payment) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void delete(long id) {
		// TODO Auto-generated method stub
		
	}
}
