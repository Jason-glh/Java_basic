package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FunctionDemoTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌,15", "周芷若,14", "赵敏,13", "张强,20", "张三丰,35", "张良,35", "萧正,18");

        Student[] arr = list.stream().map(Student::new).toArray(Student[]::new);
        System.out.println(Arrays.toString(arr));
    }
}
