// ��Ӱ� ����

class Point {
	int x;
	int y;
}

//class Circle extends Point {		// ���
//	int r;
//}

class Circle {		// ����
	Point p = new Point(); 		// ���������� �ʱ�ȭ
	int r;
}


public class InheritaceTest {

	public static void main(String[] args) { 	// ������ �̿��ϱ�
		Circle c = new Circle();
		c.p.x = 1;		// c.p.x -> c�� ����Ű�� ��ü p�� x�� 1
		c.p.y = 2;
		c.r = 3;
		System.out.println("c.p.x = " + c.p.x); 		
		System.out.println("c.p.y = " + c.p.y);
		System.out.println("c.r = " + c.r);
	}
}
