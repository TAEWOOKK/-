package com.ezen.biz.ex1;

import org.springframework.stereotype.Service;

@Service("opBean")
public class Operation {
	public void message() {
		System.out.println("message() method ȣ���\n");
		}
		public int m() {
		System.out.println("m() �޼ҵ� ȣ���\n");
		return 2;
		}
		public int k() {
		System.out.println("k() �޼ҵ� ȣ���\n");
		return 3;
		}
//		public void throwException() {
//		throw new RuntimeException("���� �߻�...");
//		}
}
