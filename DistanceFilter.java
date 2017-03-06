
/**
 * Write a description of DistanceFilter here.
 * 
 * @author Tom Courtney 
 * @version March 5 2017
 */

public class DistanceFilter implements Filter
{
    private Location loc; 
    private double distMax;
    
    public DistanceFilter(Location theLoc, double max) { 
        loc = theLoc;
        distMax = max;
    } 

    public boolean satisfies(QuakeEntry qe) { 
        return (qe.getLocation().distanceTo(loc)<=distMax); 
    } 
    
    public String getName(){
        return "Distance";
    }
}
