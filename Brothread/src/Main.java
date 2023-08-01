
public class Main {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * System.out.println(Thread.activeCount());
		 * Thread.currentThread().setName("Thread is fun");
		 * Thread.currentThread().setPriority(10);
		 * System.out.println(Thread.currentThread().isAlive());
		 * System.out.println(Thread.currentThread().getPriority());
		 * System.out.println(Thread.currentThread().getName());
		 * 
		 * for (int i = 3; i > 0; i--) { System.out.println(i); Thread.sleep(1000); }
		 * System.out.print("Your are done!");
		 */
		Mythread thread = new Mythread();
		thread.start();
		System.out.println(thread.isAlive());
		thread.setName("Thread Name:another one");
		System.out.println(thread.getName());
		thread.setPriority(10);
		System.out.println(thread.getPriority());
		System.out.println(Thread.activeCount());
	}

}
