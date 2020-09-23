package com;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankTransaction {
	
	

	@GetMapping("/greetings")
	public String greetings()
	{
		
		return "Welcome";
	}
	
	
	  @GetMapping("/deposit/{amount}")
	  public int deposit(@PathVariable("amount") int amount) {
	  System.out.print("Successfully Deposited Amount   : Rs "+amount);
	  return 1000;
	  }
	 

}
