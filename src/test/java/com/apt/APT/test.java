package com.apt.APT;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class test {
	public static void main(String asd[]) {
		BCryptPasswordEncoder enc =new BCryptPasswordEncoder();
		System.out.println(enc.encode("apr"));

	}
}
