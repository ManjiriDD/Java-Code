package Thrd;
import static java.lang.Thread.*;
public class Tester {

	public static void main(String[] args) throws InterruptedException{
		 System.out.println("main thrd's details"+Thread.currentThread());//Thread [main,5,main]
		 //parent thrd: main will be used to created child thrds
		 //1.non dameon
		 MyThread t1=new MyThread("One");
		// t1.start();//you can not start alredy started thrd(started in MyThread)
		 MyThread t2=new MyThread("Two");		
		 MyThread t3=new MyThread("Three");
		 MyThread t4=new MyThread("Four");//1+4 Child thrds

			for(int i=0;i<10;i++) {
				System.out.println(currentThread().getName()+"exec #"+i);	 
			Thread.sleep(1000);//Blocking API(BLOCKED on sleep)
			}
			//t1.start();//main thrd gets exc:IllgalThreadStateExc(dead thrds can't be restarted)
			System.out.println(t1.isAlive()+""+t4.isAlive());

			System.out.println("main over...!!!");
	}

}
