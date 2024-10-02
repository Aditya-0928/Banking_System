package com.project.banking_app.dto;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AccountDto {
	private Long id;
	private String accountholdername;
	private double balance;
	public AccountDto(Long id2, String accountholdername2, double balance2) {
		this.id=id2;
		this.accountholdername=accountholdername2;
		this.balance=balance2;
		// TODO Auto-generated constructor stub
	}
	public AccountDto(String accountholdername2, double balance2) {
		this.accountholdername=accountholdername2;
		this.balance=balance2;
		// TODO Auto-generated constructor stub
	}
	public AccountDto() {};
	
	public Long getId() {
		return this.id;
	}
	public String getAccountholdername() {
		// TODO Auto-generated method stub
		return this.accountholdername;
	}
	public double getBalance() {
		// TODO Auto-generated method stub
		return this.balance;
	}
}
