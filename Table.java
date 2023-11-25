
public class Table {
	public synchronized void print(int n) throws InterruptedException {
		for(int i=1;i<=10;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i*n);
			System.out.println(Thread.currentThread().getName()+Thread.currentThread().getState());
			
			notify();
			this.wait();
			System.out.println(Thread.currentThread().getName()+Thread.currentThread().getState());
			
		}
	}
//	public synchronized  void print1(int n) throws InterruptedException {
//		for(int i=1;i<=10;i++) {
//			System.out.println(Thread.currentThread().getName()+" "+i*n);
//			wait();
//			notify();
//			
//			//System.out.println();
//		}
//	}
}
