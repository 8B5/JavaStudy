package stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {

	public static void main(String[] args) {
		int[] arr =  {1,2,3,4,5};
		
		for(int num : arr) {
			System.out.println(num);
		}
		
	//	Arrays.stream(arr); //int Stream ��ȯ
		System.out.println();
		//���ٽ� ���
		Arrays.stream(arr).forEach(n->System.out.println(n)); //�ϳ��� �����鼭 � ���� �� ������
		
		/* ���� ���� ����� �������� is�� ���� �� �Ҹ� �Ǳ� ������ ������ �Ұ�����. �ٽ� �����������
		IntStream is = Arrays.stream(arr);
		is.forEach(n->System.out.println(n));
		*/

	}

}
