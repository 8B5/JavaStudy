package stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {

	public static void main(String[] args) {
		int[] arr =  {1,2,3,4,5};
		
		for(int num : arr) {
			System.out.println(num);
		}
		
	//	Arrays.stream(arr); //int Stream 반환
		System.out.println();
		//람다식 사용
		Arrays.stream(arr).forEach(n->System.out.println(n)); //하나씩 꺼내면서 어떤 일을 할 것인지
		
		/* 위와 같은 결과가 나오지만 is는 연산 후 소모가 되기 때문에 재사용이 불가능함. 다시 생성해줘야함
		IntStream is = Arrays.stream(arr);
		is.forEach(n->System.out.println(n));
		*/

	}

}
