package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("Enter account data:");
		System.out.print("Number:");
		int num = sc.nextInt();
		System.out.print("Holder:");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initial balance:");
		Double balance = sc.nextDouble();
		System.out.print("Withdraw limit:");
		Double limit = sc.nextDouble();
		Account account = new Account(num, holder, balance, limit);
		
		System.out.print("Enter amount for withdraw:");
		Double amount = sc.nextDouble();
		account.withdraw(amount);
		System.out.println(account.toString());
		}
		catch (DomainException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		sc.close();
	}

}
