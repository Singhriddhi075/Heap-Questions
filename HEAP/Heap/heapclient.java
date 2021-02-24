package Heap;

public class heapclient {

	public static void main(String[] args) {
		addorremove heap=new addorremove();
		heap.add(10);
		heap.display();
		heap.add(20);
		heap.display();
		heap.add(30);
		heap.display();
		heap.add(40);
		heap.display();
		heap.add(5);
		heap.display();
		heap.add(3);
		heap.display();
		heap.remove();
		heap.display();
		System.out.println(heap.remove());
		heap.display();
		System.out.println(heap.remove());
		heap.display();
		System.out.println(heap.remove());
		heap.display();




	}

}
