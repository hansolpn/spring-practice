package core.main;

import org.springframework.context.support.GenericXmlApplicationContext;

import core.chap2.Hotel;

public class Main {

	public static void main(String[] args) {

		// 빈 등록에 사영된 xml의 설정을 가져오는 객체를 생성 (classpasth = /src/main/resource
		GenericXmlApplicationContext ct = 
				new GenericXmlApplicationContext("classpath:hotel-config.xml");
		
		// getBean은 기본적으로 싱글톤 객체로 생성됨
		Hotel hotel1 = ct.getBean("hotel1", Hotel.class);
		hotel1.info();
		
		System.out.println("---------------------------------");		
		
		Hotel hotel2 = ct.getBean("hotel2", Hotel.class);
		hotel2.info();
		
		ct.close();
	}

}
