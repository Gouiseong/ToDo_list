package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ToDoService {
	ArrayList<String> ToDo_list = new ArrayList<>();

	public ArrayList<String> getAll() {
		return ToDo_list;
	}

	public void add(String ToDo) {
		ToDo_list.add(ToDo);
	}

	public void delete(int ToDoNumber) {
		ToDo_list.remove(ToDoNumber - 1);
	}

	public void update(int ToDoNumber, String ToDo) {
		ToDo_list.set(ToDoNumber - 1, ToDo);
	}
}
