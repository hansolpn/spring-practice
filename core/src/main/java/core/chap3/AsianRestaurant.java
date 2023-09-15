package core.chap3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Setter;

@Setter
public class AsianRestaurant implements IRestaurant {

	private IChef chef;
	
	// 요리 코스
	private ICourse course;

	@Autowired
	public AsianRestaurant(@Qualifier("asianChef") IChef chef,@Qualifier("sushi") ICourse course) {
		super();
		this.chef = chef;
		this.course = course;
	}
	
	// 요리를 주문하는 기능
	public void order() {
		System.out.println("아시안 요리를 주문합니다.");
		course.combineMenu();
		chef.cook();

	}



	
}
