package student3;

public class HillClimbing_SA {
	
	
	private Node execute(Node initialState) {
		Node current  = initialState;
		Node next = null;
		int T = 1000;
		if (T == 0) {
			return current;
		}
		
		while (current.getH() != 0) {
			next = current.selectNextRandomCandidate();
			int deltaE = next.getH() - current.getH();
			if (deltaE < 0 ) {
				current = next;
			} else  {
				if (Math.exp(deltaE/T) > Math.random()) {
					current = next;
				}
			}
			T -= 1;
		}
		return current;
	}
}
