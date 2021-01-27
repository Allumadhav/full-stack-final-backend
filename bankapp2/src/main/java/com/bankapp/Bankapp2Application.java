package com.bankapp;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bankapp.dto.AddressChangeRequest;
import com.bankapp.entities.Account;
import com.bankapp.entities.AppUser;
import com.bankapp.entities.TransactionLog;
import com.bankapp.repo.TransactionLogRepo;
import com.bankapp.service.AccountService;
import com.bankapp.service.AppUserService;

@SpringBootApplication
public class Bankapp2Application implements CommandLineRunner {
	@Autowired
	private AccountService accountService;

	@Autowired
	private TransactionLogRepo logRepo;

	@Autowired
	private AppUserService appUserService;

	public static void main(String[] args) {
		SpringApplication.run(Bankapp2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		/*
		 * Account account = new Account("ani", 1000, "saving", "AP", "CTR",
		 * "9876543210", "allu@gmail.com", LocalDate.of(2020, Month.APRIL, 26)); Account
		 * account1 = new Account("ram", 1000, "saving", "TN", "Chennai", "9876543223",
		 * "allu@gmail.com", LocalDate.of(2021, Month.JANUARY, 22));
		 * accountService.Save(account); accountService.Save(account1);
		 * 
		 * accountService.transfer(1, 2, 50);
		 * 
		 * accountService.deposit(1, 100); 
		 * accountService.withdraw(2, 100);
		 * 
		 * AddressChangeRequest addressChangeRequest = new
		 * AddressChangeRequest("gandhi road", " hyderabad", "9856467890",
		 * "a@gmail.com"); accountService.changeAddress(1, addressChangeRequest);
		 * List<TransactionLog> list = logRepo.findByFromAccount(2); for (TransactionLog
		 * log : list) System.out.println(log);
		 * 
		 * AppUser appUser1 = new AppUser("ani", "ani123", "admin", "AP", "Vizag",
		 * "9876531098", "ani@gmail.com", LocalDate.of(2001, Month.AUGUST, 13)); AppUser
		 * appUser2 = new AppUser("ram", "ram123", "admin", "KN", "Bangalore",
		 * "9876531093", "ram@gmail.com", LocalDate.of(2003, Month.AUGUST, 11));
		 * 
		 * appUserService.addAppUser(appUser1); appUserService.addAppUser(appUser2);
		 */}

}
