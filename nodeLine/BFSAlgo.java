package nodeLine;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSAlgo implements ISearchAlgo {

	@Override
	public Node execute(Node root, String goal) {
		Queue<Node> frontier = new LinkedList<Node>();
		List<Node> explored = new ArrayList<Node>();
		frontier.add(root);
		while (!frontier.isEmpty()) {
			Node current = frontier.poll();
			if (current.getLabel().equals(goal)) {
				return current;
			}
			explored.add(current);
			List<Node> childs = current.getChildrenNodes();
			for (Node ch : childs) {
				if (!frontier.contains(ch) && !explored.contains(ch)) {
					frontier.add(ch);
					ch.setParent(current);
				}
			}
		}
		return root;
	}

	@Override
	public Node execute(Node root, String start, String goal) {
		Queue<Node> frontier = new LinkedList<Node>();
		List<Node> explored = new ArrayList<Node>();
		frontier.add(root);
		boolean started = false;
		while (!frontier.isEmpty()) {
			Node current = frontier.poll();
			explored.add(current);
			System.out.print(current.getLabel() + "\t");
			if (current.getLabel().equals(start)) {
				started = true;
				frontier.clear();
				explored.clear();
			} else if (current.getLabel().equals(goal)) {
				return current;
			}
			List<Node> childs = current.getChildrenNodes();
			for (int i = 0; i < childs.size(); i++) {
				Node n = childs.get(i);
				if (!frontier.contains(n) && !explored.contains(n)) {
					frontier.add(n);
					if (started)
						n.setParent(current);
					}
			}

		}
		return root;

	}
}
