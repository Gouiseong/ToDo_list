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
		String[] ToDo_list = new String[10];

		for (int i = 0; i < ToDo_list.length; i++) { // 문자열을 적으면 자동으로 ToDo_list에 추가되도록 만들었다. 문제는 배열의 길이만큼 반복되어서 해야할 일이
														// 없어도 다 적을 때까지 반복문이 끝나지 않는다. 해결해야됨
			System.out.println("오늘 할 일을 적어주세요");
			ToDo_list[i] = sc.nextLine();
		}

		System.out.print("오늘 할 일 : ");
		for (int ToDo_List_Index = 0; ToDo_List_Index < ToDo_list.length; ToDo_List_Index++) { // ToDo_List 배열을 호출할 때 값에
																								// null이나 공백이면 반복문 종료.
																								// list 중간에 값이 없을 시 뒤의
																								// 값을 불러오지 못한다. 해결해야됨
			if (ToDo_list[ToDo_List_Index] == null) {
				break;
			} else if (ToDo_list[ToDo_List_Index] == "") {
				break;
			} else {
				System.out.println(ToDo_list[ToDo_List_Index]);
			}
		}

	}

}
