package Thrd;

public class MyThread extends Thread {
	public MyThread(String name) {
	
		super(name);//state:New
		start();//RUNNABLE
		
	}
	@Override
	public void run()
	{ System.out.println(getName()+"Started");//Running
	try
	{
		for(int i=0;i<10;i++) {
			System.out.println(getName()+"exec #"+i);
		//Business Logic (B.L)for loop
		Thread.sleep(500);//Blocking API(BLOCKED on sleep)
		}
	}  catch(Exception e) {
		
			System.out.println(getName()+"Err"+e);
		}
	System.out.println(getName()+"Over");
		}
		
	}


