package FishProject;


public class Fish{

private int xCord;
private int yCord;

public Fish(int xCord, int yCord){
    this.xCord = xCord;
    this.yCord = yCord;
}

public void printInfo(){
    System.out.println("X Coordinate: " + xCord);
    System.out.println("Y Coordinate: " + yCord);
    
}

}