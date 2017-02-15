/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmlreader;

/**
 *
 * @author NCHU-Hsin
 */
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class readXml {

    private ArrayList<question> questionSet = new ArrayList<question>();

    public readXml() {
    }

    public readXml(String fileName) {
        try {
            File fXmlFile = new File(fileName);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);

            doc.getDocumentElement().normalize();
            
            System.out.println("根節點 :" + doc.getDocumentElement().getNodeName());

            NodeList nList = doc.getElementsByTagName("question");

            System.out.println("----------------------------");

            for (int temp = 0; temp < nList.getLength(); temp++) {

                Node nNode = nList.item(temp);

                //System.out.println("\n當前節點 :" + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element eElement = (Element) nNode;

                    //System.out.println("編號 : " + eElement.getAttribute("id"));
                    //System.out.println("問句 : " + eElement.getElementsByTagName("string").item(0).getTextContent());
                    //System.out.println("解法 : " + eElement.getElementsByTagName("query").item(0).getTextContent());
                    //System.out.println("解答: " + eElement.getElementsByTagName("answer").item(0).getTextContent());
                    question qst = new  question(eElement.getAttribute("id") , eElement.getElementsByTagName("string").item(0).getTextContent() );
                   questionSet.add(qst) ;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //---------------------------------------------------------------------------------------------------------
    public ArrayList<question> getQuestionSet(){
        return questionSet ;
    }
    //---------------------------------------------------------------------------------------------------------
    
    //---------------------------------------------------------------------------------------------------------
    
    
}
