package eeuab9.weather;

import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/**
 *
 * @author eeuab9
 */
public class ClientWeather {
// Constructing a document builder 
	static DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

	static DocumentBuilder builder;

	public static void main(String[] args)
			throws ParserConfigurationException, SAXException, IOException, XPathExpressionException {
		builder = factory.newDocumentBuilder();

		XPathFactory xpfactory = XPathFactory.newInstance();
		XPath path = xpfactory.newXPath();

		Document d = builder.parse("http://open.live.bbc.co.uk/weather/feeds/en/2656397/observations.rss");
		d.getElementsByTagName("title");

		String output = path.evaluate("rss/channel/item/title", d);

		System.out.println(output);
		System.out.println("hello");

	}
}
