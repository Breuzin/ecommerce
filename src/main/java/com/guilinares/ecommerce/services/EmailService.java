package com.guilinares.ecommerce.services;

import org.springframework.mail.SimpleMailMessage;

import com.guilinares.ecommerce.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
