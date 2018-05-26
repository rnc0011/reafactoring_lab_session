/**
 * 
 */
package lanSimulation.internals;

/**
 * @author Mario
 *
 */
public class WorkStation extends Node {

	/**
	 * @param type
	 * @param name
	 */
	public WorkStation(String name) {
		super(Node.WORKSTATION, name);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param type
	 * @param name
	 * @param nextNode
	 */
	public WorkStation(String name, Node nextNode) {
		super(Node.WORKSTATION, name, nextNode);
		// TODO Auto-generated constructor stub
	}

}
