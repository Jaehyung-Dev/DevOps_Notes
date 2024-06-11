package chap00_practice;

import java.util.Scanner;

public class Account {
	public int balance;
	public String accountNum;
	public String accountName;
	public int initDeposit;
	
	public void createAccount() {
		Scanner sc = new Scanner(System.in);
		System.out.println("-------------");
		System.out.println("계좌생성");
		System.out.println("-------------");
		
		System.out.println("계좌번호");
		accountNum = sc.nextLine();
		System.out.println("계좌주");
		accountName = sc.nextLine();
		System.out.println("초기 입금액");
		initDeposit = sc.nextInt();
		
		if(accountNum != null && accountName != null && initDeposit > 0)
		System.out.println("결과 : 계좌가 생성되었습니다.");
	}
	
	public void accountList() {
		System.out.println("계좌목록");
		System.out.println("-------------");
		// 계좌 목록 처리 로직
	}
	
	public void deposit() {
		System.out.println("예금");
		System.out.println("-------------");
		// 예금 처리 로직
	}
	
	public void withdraw() {
		System.out.println("출금");
		System.out.println("-------------");
		// 출금 처리 로직
		System.out.println("결과 : 출금이 성공되었습니다.");
	}

}
