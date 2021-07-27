package lambda03;

public class StringConcatTest {
	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "World";
		
		StringConcatimpl strImpl = new StringConcatimpl();
		strImpl.makeString(s1, s2);
		
		//lambda표현 //class만드는 부분이 생략이 됨. 내부적으로 익명 클래스가 만들어짐. 때문에 메서드도 하나만 만들어야함. 
		StringConcat concat = (s,v) -> System.out.println(s+","+v);
		concat.makeString(s1, s2);
	}

}
