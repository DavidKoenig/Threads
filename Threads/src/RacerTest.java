import java.util.ArrayList;

public class RacerTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		long threadID = Thread.currentThread().getId();
		System.out.println( "Main Thread ID: " + threadID );
		
		ArrayList<Thread> tArray = new ArrayList<Thread>();
		
		for(int i = 0; i <= 10; i++){
			tArray.add(new Thread(new Racers()));
			
			if(tArray.get(i).getId() % 2 == 0){
					tArray.get(i).setPriority(Thread.MIN_PRIORITY);
			}
			else{
				tArray.get(i).setPriority(Thread.MAX_PRIORITY);
			}
			
		}
		
		for(int i = 0; i <= 10; i++){
			tArray.get(i).start();
		}
		for(int i = 0; i <= 10; i++){
			tArray.get(i).join();
		}
		
		
	}

}
