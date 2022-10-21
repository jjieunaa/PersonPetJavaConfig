package kr.co.kwhangan2;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Pet {
	
	private String name;
	private int age;

}
