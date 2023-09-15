package core.chap2;

public class Hotel {
	
	// 제어의 역전(IoC): 객체 생성의 제어권을 외부로 넘긴다.
	// 의존성 주입(DI): 외부에서 생성된 객체를 주입받는 개념
	
	// 호텔은 레스토랑 객체에 의존적
	private IRestaurant restaurant;
	
	// 헤드 쉐프
	private IChef headShef;

	public Hotel() {}
	
	// 생성자 주입
	public Hotel(IRestaurant restaurant, IChef headShef) {
		super();
		this.restaurant = restaurant;
		this.headShef = headShef;
	}
	
	// setter 주입
	public void setRestaurant(IRestaurant restaurant) {
		this.restaurant = restaurant;
	}

	// setter 주입
	public void setHeadShef(IChef headShef) {
		this.headShef = headShef;
	}

	// 호텔의 정보를 알려주는 기능
	public void info() {
		System.out.printf("우리 호텔의 레스토랑은 %s입니다. 헤드쉐프는 %s입니다.\n"
				, restaurant.getClass().getSimpleName()
				, headShef.getClass().getSimpleName());
		restaurant.order();
	}
}
