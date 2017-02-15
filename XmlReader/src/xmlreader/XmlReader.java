/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmlreader;

import java.util.ArrayList;

/**
 *
 * @author NCHU-Hsin
 */
public class XmlReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<question> questionSet = new ArrayList<question>();
        String fileName = "J:\\data\\qald-5.xml";
        readXml rx = new readXml( fileName);
        questionSet = rx.getQuestionSet() ;
        System.out.println("共有"+questionSet.size()+"句") ;
        for(question q: questionSet){
             System.out.println("編號 : " + q.getQustionId());
             System.out.println("問句 : " + q.getQustionSentences()+"\n");
        }
    }
    
}
