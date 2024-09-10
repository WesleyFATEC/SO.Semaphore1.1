package control;

import java.util.concurrent.Semaphore;

public class ProcessoBd {
	private static final Semaphore semaphore = new Semaphore(1);
	
	public static void BdTrasaction(int threadId, int timeTransaction) {
		try {
			semaphore.acquire();
			System.out.println("A thread" + threadId + " está realizando uma transação no Bd");
			Thread.sleep(timeTransaction);
			System.out.println("A Thread" + threadId + "finalizou o processo no BD");
		}catch (InterruptedException e){
			e.printStackTrace();
		}finally {
			semaphore.release();
		}
	}


}
