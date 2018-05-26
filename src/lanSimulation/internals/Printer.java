/**
 * 
 */
package lanSimulation.internals;

/**
 * @author Mario
 *
 */
public class Printer extends Node {

	/**
	 * @param type
	 * @param name
	 */
	public Printer(String name) {
		super(Node.PRINTER, name);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param type
	 * @param name
	 * @param nextNode
	 */
	public Printer(String name, Node nextNode) {
		super(Node.PRINTER, name, nextNode);
		// TODO Auto-generated constructor stub
	}

}
