package thread.ch07;

import java.util.concurrent.Executor;

public class HostExecutor {
	private final Helper helper = new Helper();
	private final Executor executor;
	
	public HostExecutor(Executor executor) {
		this.executor = executor;
	}
	
	public void request(final int count, final char c) {
		System.out.println(" request(" + count + ", " + c + " ) BEGIN");
		executor.execute(
			new Runnable() {
				public void run() {
					helper.handle(count,  c);;
				}
			}
		);
		System.out.println(" request(" + count + ", " + c+ ") END");
	}

}
