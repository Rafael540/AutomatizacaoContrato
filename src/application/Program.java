package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		
		System.out.println("Entre os dados do contrato:");
		System.out.print("Numero: ");
		int number = sc.nextInt();
		System.out.print("Data (dd/MM/yy): ");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		System.out.print("Valor do contrato: ");
		double totalValue = sc.nextDouble();
		
		Contract obj = new Contract(number, date, totalValue);
		
		System.out.print("Entre com os números de parcelas: ");
		int n = sc.nextInt();
		
		
		ContractService contractService = new ContractService(null);
		
		contractService.processContract(obj,n);
		
		System.out.println("Parcelas:");
		for(Installment installment : obj.getInstalment()) {
			System.out.println(installment);
		}
		
		
		
		sc.close();
	
	}

}
