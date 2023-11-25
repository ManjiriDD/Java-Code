
public class Task2 implements Runnable {
	private Table t;
	private int n;
	public Task2(Table t,int n) {
		this.n=n;
		this.t=t;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			t.print(n);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
