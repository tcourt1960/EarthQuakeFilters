
/**
 * Write a description of DepthFilter here.
 * 
 * @author Tom Courtney
 * @version March 5 2017
 */

public class DepthFilter implements Filter
{
    private double depthMin; 
    private double depthMax;
    
    public DepthFilter(double min, double max) { 
        depthMin = min;
        depthMax = max;
    } 

    public boolean satisfies(QuakeEntry qe) { 
        return ((qe.getDepth() >= depthMin) && (qe.getDepth() <= depthMax)); 
    } 
    
    public String getName(){
        return "Depth";
    }
}
