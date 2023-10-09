package nodeLine;

public class Test {
	public static void main(String[] args) {
		Node nodeS = new Node("S");
		Node nodeA = new Node("A");
		Node nodeB = new Node("B");
		Node nodeC = new Node("C");
		Node nodeD = new Node("D");
		Node nodeE = new Node("E");
		Node nodeF = new Node("F");
		Node nodeG = new Node("G");
		Node nodeH = new Node("H");
		
		nodeS.addEdge(nodeA, 5);
		nodeS.addEdge(nodeB, 2);
		nodeS.addEdge(nodeC, 4);
		nodeA.addEdge(nodeD, 9);
		nodeA.addEdge(nodeE, 4);
		nodeB.addEdge(nodeG, 6);
		nodeC.addEdge(nodeF, 2);
		nodeD.addEdge(nodeH, 7);
		nodeE.addEdge(nodeG, 6);
		nodeF.addEdge(nodeG, 1);
		
		ISearchAlgo search = new BFSAlgo();
		
		
		Node result = search.execute(nodeS, "H");
		for (String temp : NodeUntils.printPath(result)) {
			System.out.print("--" + temp + "--");
		}
		System.out.println();
		System.out.println(result);
		
		Node result2 = search.execute(nodeS, "A", "H");
		for (String temp2 : NodeUntils.printPath(result2)) {
			System.out.print("--" + temp2 + "--");
		}
		
		System.out.println();
		System.out.println(result2);
		
	}
}
