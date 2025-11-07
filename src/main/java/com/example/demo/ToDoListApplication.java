package com.example.demo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ToDoListApplication {
	// ToDo리스트
	public static void main(String[] args) {
		// SpringApplication.run(ToDoListApplication.class, args);
		Scanner sc = new Scanner(System.in);
		System.out.println("오늘 할 일을 적어주세요");
		String ToDo = sc.nextLine();
		
		String[] ToDo_list = new String[10];
		for(int i=0;i<10;i++) {
			ToDo_list[i]=ToDo;
		}
		System.out.print("오늘 할 일 : ");
		System.out.println(ToDo);
		
	}

}
