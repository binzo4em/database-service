package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

//Ctrl + Shift + o 로 Library Import 
// application-*.yml 파일에서 database 부분을 찾아서
// ip, port, username, password에 값을 설정한다.
// 이 기능은 프로젝트 생성 시 추가한 Spring Configuration Processor 에서 지원한다.
@Configuration
@ConfigurationProperties(prefix = "database")
public class Database {
	private String ip;
	private String port;
	private String username;
	private String password;
	
	// 마우스 우클릭 > [Source] > Generate Getters and Setters > [Select All] > [Generate]
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	// 마우스 우클릭 > [Source] > Generate toString()... > [Generate]
	@Override
	public String toString() {
		return "Database [ip=" + ip + ", port=" + port + ", username=" + username + ", password=" + password + "]";
	}
	
	
}