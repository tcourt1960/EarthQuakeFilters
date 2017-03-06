
/**
 * Write a description of PhraseFilter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class PhraseFilter implements Filter
{
    private String where; //start end any 
    private String phrase;
    
    public PhraseFilter(String theType, String thePhrase) { 
        where = theType;
        phrase = thePhrase;
    } 

    public boolean satisfies(QuakeEntry qe) { 
        boolean answer=false;
        String info=qe.getInfo();
        if ((where =="start") && (info.startsWith(phrase))) {
            answer=true;
        }
        if ((where =="end") && (info.endsWith(phrase))) {
            answer=true;
        }
        if ((where =="any") && (info.indexOf(phrase)!=-1)) {
            answer=true;
        }
        return answer;
    } 
    
    public String getName(){
        return "Phrase";
    }
}
