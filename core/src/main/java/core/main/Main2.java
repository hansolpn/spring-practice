package core.main;

import org.springframework.context.support.GenericXmlApplicationContext;

import core.chap3.Hotel;

public class Main2 {

	public static void main(String[] args) {

		GenericXmlApplicationContext ct = 
				new GenericXmlApplicationContext("classpath:auto-config.xml");
		
		// getBean은 기본적으로 싱글톤 객체로 생성됨
		Hotel hotel1 = ct.getBean("hotel1", Hotel.class);
		hotel1.info();
		
		System.out.println("---------------------------------");		
		
		Hotel hotel2 = ct.getBean("hotel2", Hotel.class);
		hotel2.info();
		
		ct.close();

	}

}
