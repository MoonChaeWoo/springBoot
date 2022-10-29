package com.chaewoo.spring_docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDockerApplication.class, args);
	}

}

// @SpringBootApplication

// @Configuration,@EnableAutoConfiguration,@ComponentScan 3가지를 하나의 annotaion으로 합친 것.
// 스프링 부트의 핵심 어노테이션으로 메인클래스에 사용한다.
// @Configuration
//  해당 클래스가 설정 파일임을 스프링프레임워크에서 알려주는 용도. 자바기반의 설정을 선언할 수 있음
// @EnableAutoConfiguration
//  스프링부트의 장점은 자동구성인데 해당 어노테이션을 활성화하면 스프링의 다양한 설정이 자동으로 완료됨
// @ComponentScan
//  자동으로 컴포넌트 클래스를 검색하고 검색된 컴포턴트 및 빈클래스를 스프링 어프링케이션컨텍스트에 등록하는 역할을 함
//  메인 클래스가 위치한 루트패키지부터 이하 모든 클래스를 검색하여 bean으로 등록함