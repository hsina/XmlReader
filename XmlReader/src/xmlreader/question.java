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
public class question {
    private String questionId = "";
    private String questionSentences = "";
    
    public question(){}
    //---------------------------------------------------------------------
    public question(String id , String questr ){
        setQustionId( id) ;
        setQustionSentences(questr) ;
    }
    //---------------------------------------------------------------------
    public void setQustionId(String id){
        questionId = id ;
    }
    //---------------------------------------------------------------------
    public void setQustionSentences(String sentences){
        questionSentences = sentences ;
    }
    //---------------------------------------------------------------------
    public String getQustionId(){
        return questionId ;
    }
    //---------------------------------------------------------------------
    public String getQustionSentences(){
        return questionSentences ;
    }
    //---------------------------------------------------------------------
}
