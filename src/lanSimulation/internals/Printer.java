/**
 * 
 */
package lanSimulation.internals;

import lanSimulation.Network;

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
	
	/**
	 * Write a printable representation of #receiver on the given #buf.
	 * <p>
	 * <strong>Precondition:</strong> isInitialized();
	 * </p>
	 * @param network TODO
	 * @param buf TODO
	 */
	@Override
	public void printOn(Network network, StringBuffer buf) {
		assert network.isInitialized();
		Node currentNode = this;
		do {
			currentNode.printOnAux(buf);
			currentNode = currentNode.getNextNode();
		} while (currentNode != this);
		buf.append(" ... ");
	}

	@Override
	protected void printOnAux(StringBuffer buf) {
		buf.append("Printer ");
		buf.append(this.name_);
		buf.append(" [Printer]");
		buf.append(" -> ");
	}

	/**
	 * Write a HTML representation of #receiver on the given #buf.
	 * <p>
	 * <strong>Precondition:</strong> isInitialized();
	 * </p>
	 * @param network TODO
	 * @param buf TODO
	 */
	@Override
	public void printHTMLOn(Network network, StringBuffer buf) {
		assert network.isInitialized();
	
		buf.append("<HTML>\n<HEAD>\n<TITLE>LAN Simulation</TITLE>\n</HEAD>\n<BODY>\n<H1>LAN SIMULATION</H1>");
		Node currentNode = this;
		buf.append("\n\n<UL>");
		do {
			currentNode.printHTMLOnAux(buf);
			currentNode = currentNode.getNextNode();
		} while (currentNode != this);
		buf.append("\n\t<LI>...</LI>\n</UL>\n\n</BODY>\n</HTML>\n");
	}

	@Override
	protected void printHTMLOnAux(StringBuffer buf) {
		buf.append("\n\t<LI> ");
		buf.append("Printer ");
		buf.append(this.name_);
		buf.append(" [Printer]");
		buf.append(" </LI>");
	}

	/**
	 * Write an XML representation of #receiver on the given #buf.
	 * <p>
	 * <strong>Precondition:</strong> isInitialized();
	 * </p>
	 * @param network TODO
	 * @param buf TODO
	 */
	@Override
	public void printXMLOn(Network network, StringBuffer buf) {
		assert network.isInitialized();
	
		Node currentNode = this;
		buf.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n\n<network>");
		do {
			currentNode.printXMLOnAux(buf);
			currentNode = currentNode.getNextNode();
		} while (currentNode != this);
		buf.append("\n</network>");
	}
	
	@Override
	protected void printXMLOnAux(StringBuffer buf) {
		buf.append("\n\t");
		buf.append("<printer>");
		buf.append(this.name_);
		buf.append("</printer>");
	}

}
