// 상속과 포함

class Point {
	int x;
	int y;
}

//class Circle extends Point {		// 상속
//	int r;
//}

class Circle {		// 포함
	Point p = new Point(); 		// 참조변수의 초기화
	int r;
}


public class InheritaceTest {

	public static void main(String[] args) { 	// 포함을 이용하기
		Circle c = new Circle();
		c.p.x = 1;		// c.p.x -> c가 가리키는 객체 p의 x는 1
		c.p.y = 2;
		c.r = 3;
		System.out.println("c.p.x = " + c.p.x); 		
		System.out.println("c.p.y = " + c.p.y);
		System.out.println("c.r = " + c.r);
	}
}
