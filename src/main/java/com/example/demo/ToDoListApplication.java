package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ToDoListApplication {
	// ToDo리스트
	public static void main(String[] args) {
		// SpringApplication.run(ToDoListApplication.class, args);
		ArrayList<String> ToDo_list = new ArrayList<>(); // 배열에서 크기가 가변적으로 변하는 Arraylist로 바꿈
		Scanner sc = new Scanner(System.in);

		boolean isRunning = true;
		String command = ""; // 명령어
		String ToDo; // 일정 이름
		String updateToDo; // 수정할 일정 이름
		int ToDoIndexToUpdate; // 수정할 일정의 인덱스
		int ToDoIndexToDelete; // 삭제할 일정의 인덱스
		while (isRunning) { // 앱 실행
							// 무한루프로 실행 시키고 종료 명령어를 입력하면 종료할 수 있도록
			command = sc.nextLine();

			if (command.equals("추가")) {
				System.out.print("추가할 일정 : ");
				ToDo = sc.nextLine();
				ToDo_list.add(ToDo);
				System.out.println("일정이 추가되었습니다.");
			} else if (command.equals("수정")) {
				System.out.println("수정할 일정의 번호를 적어주세요.");
				ToDoIndexToUpdate = sc.nextInt();
				sc.nextLine();
				System.out.println("수정할 문구를 적어주세요.");
				updateToDo = sc.nextLine();
				ToDo_list.set(ToDoIndexToUpdate - 1, updateToDo);
				System.out.println("수정이 완료되었습니다.");
			} else if (command.equals("삭제")) {
				System.out.println("삭제할 일정의 번호를 적어주세요.");
				ToDoIndexToDelete = sc.nextInt(); // nextInt()는 숫자만 읽고, 사용자가 친 엔터(\n)는 버퍼에 남아있기 때문에 버퍼를 비워주기 위해
													// nextLine()함수를 넣어준다.
				sc.nextLine(); // 버퍼 비우기
				ToDo_list.remove(ToDoIndexToDelete - 1);
				System.out.println(ToDoIndexToDelete + "번 일정이 삭제되었습니다.");
			} else if (command.equals("목록")) {
				if (ToDo_list.isEmpty()) {
					System.out.println("목록이 비어있습니다.");
				} else if (ToDo_list.isEmpty() != true) {
					int ToDoNumber = 1;
					System.out.println("해야할 일");
					for (String ToDo1 : ToDo_list) {
						System.out.println(ToDoNumber + ". " + ToDo1);
						ToDoNumber++;
					}
				}
			} else if (command.equals("종료")) {
				System.out.println("프로그램을 종료합니다.");
				isRunning = false;
			} else {
				System.out.println("잘못된 명령어입니다. 다시 입력해주세요.");
			}

		}
		/*
		 * for (int i = 0; i < ToDo_list.length; i++) { // 문자열을 적으면 자동으로 ToDo_list에
		 * 추가되도록 만들었다. 문제는 배열의 길이만큼 반복되어서 해야할 일이 // 없어도 다 적을 때까지 반복문이 끝나지 않는다. 해결해야됨
		 * System.out.println("오늘 할 일을 적어주세요"); ToDo_list[i] = sc.nextLine(); }
		 * 
		 * System.out.print("할 일 목록"); for (int ToDo_List_Index = 0; ToDo_List_Index <
		 * ToDo_list.length; ToDo_List_Index++) { // ToDo_List 배열을 호출할 때 값에 // null이나
		 * 공백이면 반복문 종료. // list 중간에 값이 없을 시 뒤의 // 값을 불러오지 못한다. 해결해야됨 if
		 * (ToDo_list[ToDo_List_Index] == null) { break; } else if
		 * (ToDo_list[ToDo_List_Index] == "") { break; } else {
		 * System.out.println(ToDo_list[ToDo_List_Index]); } }
		 */
	}

}
