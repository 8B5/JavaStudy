package lambda03;

public class StringConcatTest {
	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "World";
		
		StringConcatimpl strImpl = new StringConcatimpl();
		strImpl.makeString(s1, s2);
		
		//lambdaǥ�� //class����� �κ��� ������ ��. ���������� �͸� Ŭ������ �������. ������ �޼��嵵 �ϳ��� ��������. 
		StringConcat concat = (s,v) -> System.out.println(s+","+v);
		concat.makeString(s1, s2);
	}

}
