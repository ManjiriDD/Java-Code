
public class test {
	public static void main(String[] args) throws InterruptedException {
		Table tab = new Table();
		//Task1 tk1 = new Task1(tab, 5);
		Task2 tk2 = new Task2(tab, 5);
		//Thread t1 = new Thread(tk1, "One");
		Thread t2 = new Thread(tk2, "Two");
		System.out.println("main started");

		t2.start();
		//t1.start();
		//System.out.println(t1.getState());
		System.out.println(t2.getState());
		//t1.join();
		t2.join();
		//System.out.println(t1.getState());
		System.out.println(t2.getState());
//	if(t1.isAlive()) {
//		System.out.println("in t1");
//		t1.interrupt();
//	}
//	if(t2.isAlive()) {
//		System.out.println("in t2");
//		t2.interrupt();
//	}
		


		System.out.println("main over");
	}
}
