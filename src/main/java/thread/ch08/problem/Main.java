package thread.ch08.problem;

public class Main {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + ":BEGIN");
		new MyFrame();
		System.out.println(Thread.currentThread().getName() + ":END");
	}

}
