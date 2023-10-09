package nodeLine;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class NodeUntils {
	public static List<String> printPath(Node node) {
		if (node != null) {
			List<String> result = new ArrayList<String>();
			result.add(node.getLabel());
			Node temp;
			while ((temp = node.getParent()) != null) {
				result.add(temp.getLabel());
				node = temp;
			}
			Collections.reverse(result);
			return result;
		} else 
			return new ArrayList<String>();
	}
}
