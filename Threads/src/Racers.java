import java.math.*;

public class Racers implements Runnable{
	//wenn man eine Variable als static definiert, gilt diese f�r die gesamte Klasse und nicht nur f�r ein Element --> Anwendung f�r Z�hlvariablen
	
	public void run()
	{
		
		//Thread.currentThread().setPriority(4);
		long threadID = Thread.currentThread().getId();
		System.out.println("Thread ID: " + threadID + " gestartet");
		
		for(double i = 0; i <= 100; i = i + 0.001){
			Math.pow(i, i);
		}
		
		System.out.println("Thread mit der ID: " + threadID + " fertig");
	}
	
}

