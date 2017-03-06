
import java.util.Random;

public class Die{
    byte faceValue;
    private final int MAX = 6;
    Random rand = new Random();    
    public Die(){
        this.faceValue = 1;
    }
    
    public Die(byte value){
        this.faceValue = value;
    }
    
    public int roll(){
        return rand.nextInt(MAX) + 1; 
    }
    
    public void setSide(byte value){
        this.faceValue = value;
    }
    
    public byte getSide(){
        return this.faceValue;
    }
    
    public String toString(){
        return ("the face value of this die is " + faceValue);
    }
    
    
}