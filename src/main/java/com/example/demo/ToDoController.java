package com.example.demo;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/todo")
public class ToDoController {
	private final ToDoService service;

	public ToDoController(ToDoService service) {
		this.service = service;
	}

	@PostMapping // 데이터를 생성하기 위한 매핑
	public void ToDoAdd(@RequestBody String ToDo) { // RequestBody -> 요청 위치에서 가져온 데이터
		service.add(ToDo);
	}

	@DeleteMapping // 데이터를 삭제하기 위한 매핑
	public void ToDoDelete(@PathVariable int ToDoNumber) { // PathVariable -> 요청 위치에서 가져온 대상이 지정된 데이터
		service.delete(ToDoNumber);
	}

	@PutMapping // 데이터를 수정하기 위한 매핑
	public void ToDoUpdate(@PathVariable int ToDoNumber, @RequestBody String ToDo) {
		service.update(ToDoNumber, ToDo);
	}

	@GetMapping // 데이터를 조회하기 위한 매핑
	public ArrayList<String> ToDoList() {
		return service.getAll();
	}

}
