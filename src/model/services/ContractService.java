package model.services;

import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract contract ,int months) {
		contract.getInstalment().add(new Installment(LocalDate.of(2018, 7,25),206.04));
		contract.getInstalment().add(new Installment(LocalDate.of(2018, 8,25),208.08));
	}
	
}
