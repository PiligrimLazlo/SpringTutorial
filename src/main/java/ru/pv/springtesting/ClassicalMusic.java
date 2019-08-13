package ru.pv.springtesting;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class ClassicalMusic implements Music {
	
	@PostConstruct
	public void doMyInit() {
		System.out.println("Doing my init");
	}
	
	@PreDestroy
	public void doMyDestroy() {
		System.out.println("Doing my destroy");
	}
	
	public String getSong() {
		return "Hungarian Rhapsody";
	}

}
