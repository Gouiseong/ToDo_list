package com.example.demo;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/todo")
public class ToDoController {
	private final ToDoService service;

	public ToDoController(ToDoService service) {
		this.service = service;
	}

	@PostMapping 		// 데이터를 생성하기 위한 매핑
	public void ToDoAdd(String ToDo) {
		service.add(ToDo);
	}

	@DeleteMapping		// 데이터를 삭제하기 위한 매핑
	public void ToDoDelete(int ToDoNumber) {
		service.delete(ToDoNumber);
	}

	@PutMapping			// 데이터를 수정하기 위한 매핑
	public void ToDoUpdate(int ToDoNumber, String ToDo) {
		service.update(ToDoNumber, ToDo);
	}

	@GetMapping			// 데이터를 조회하기 위한 매핑
	public ArrayList<String> ToDoList() {
		return service.getAll();
	}
//	boolean isRunning = true;
//	String command = ""; // 명령어
//	String ToDo; // 일정 이름
//	String updateToDo; // 수정할 일정 이름
//	int ToDoIndexToUpdate; // 수정할 일정의 인덱스
//	int ToDoIndexToDelete; // 삭제할 일정의 인덱스
//	while(isRunning)
//	{ // 앱 실행
//		// 무한루프로 실행 시키고 종료 명령어를 입력하면 종료할 수 있도록
//		command = sc.nextLine();
//
//		if (command.equals("추가")) {
//			System.out.print("추가할 일정 : ");
//			ToDo_list.add(ToDo);
//			System.out.println("일정이 추가되었습니다.");
//		} else if (command.equals("수정")) {
//			System.out.println("수정할 일정의 번호를 적어주세요.");
//			ToDoIndexToUpdate = sc.nextInt();
//			sc.nextLine();
//			System.out.println("수정할 문구를 적어주세요.");
//			updateToDo = sc.nextLine();
//			ToDo_list.set(ToDoIndexToUpdate - 1, updateToDo);
//			System.out.println("수정이 완료되었습니다.");
//		} else if (command.equals("삭제")) {
//			System.out.println("삭제할 일정의 번호를 적어주세요.");
//			ToDoIndexToDelete = sc.nextInt(); // nextInt()는 숫자만 읽고, 사용자가 친 엔터(\n)는 버퍼에 남아있기 때문에 버퍼를 비워주기 위해
//												// nextLine()함수를 넣어준다.
//			sc.nextLine(); // 버퍼 비우기
//			ToDo_list.remove(ToDoIndexToDelete - 1);
//			System.out.println(ToDoIndexToDelete + "번 일정이 삭제되었습니다.");
//		} else if (command.equals("목록")) {
//			if (ToDo_list.isEmpty()) {
//				System.out.println("목록이 비어있습니다.");
//			} else if (ToDo_list.isEmpty() != true) {
//				int ToDoNumber = 1;
//				System.out.println("해야할 일");
//				for (String ToDo1 : ToDo_list) {
//					System.out.println(ToDoNumber + ". " + ToDo1);
//					ToDoNumber++;
//				}
//			}
//		} else if (command.equals("종료")) {
//			System.out.println("프로그램을 종료합니다.");
//			isRunning = false;
//		} else {
//			System.out.println("잘못된 명령어입니다. 다시 입력해주세요.");
//		}

}
