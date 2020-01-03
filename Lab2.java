public class Lab2
{
  public static void cleanSquare()
  {
    Robot.load("square.txt");
    Robot.setDelay(0.1);
    
    //INSERT CODE HERE
    cleanRow();
    cleanRow();
    cleanRow();
    cleanRow();
    
    
  }
   //before: robot faces a dark row, ready to clean 
    //after: robot faces another dark row, standing on a formerly dark row
  public static void cleanRow()
  {
    Robot.move();
    Robot.makeLight();
    Robot.move();
    Robot.makeLight();
    Robot.move();
    Robot.makeLight();
    Robot.move();
    Robot.makeLight();
    Robot.move();
    Robot.makeLight();
    Robot.move();
    Robot.turnLeft();
      }
  public static void darkenComb()
  {
    Robot.load("comb.txt");
    Robot.setDelay(0.05);
    
    //INSERT CODE HERE
    darkenTooth();
    moveAndDark();
    Robot.move();
    darkenTooth();
    moveAndDark();
    Robot.move();
    darkenTooth();
    moveAndDark();
    Robot.move();
    darkenTooth();
    moveAndDark();
    Robot.move();
    darkenTooth();
  }
  //before: robot facing any direction
  //after: robot turns right 90 degrees
  public static void turnRight()
  {
      Robot.turnLeft();
      Robot.turnLeft();
      Robot.turnLeft();
    }
  //before: robot stands on any square
  //after: robot moves forward one onto a formerly light square
    public static void moveAndDark()
  {
      Robot.move();
      Robot.makeDark();
    }
  //before: robot facing any direction
  //after: robot turns around 180 degrees
    public static void turnAround()
  {
      Robot.turnLeft();
      Robot.turnLeft();
    }
  //before: robot facing north on light square
  //after: robot turned tooth of comb dark, sits in same position as start
  
  public static void darkenTooth()
  {
    Robot.makeDark();
    turnRight();
    moveAndDark();
    moveAndDark();
    moveAndDark();
    moveAndDark();
    moveAndDark();
    moveAndDark();
    turnAround();
    Robot.move();
    Robot.move();
    Robot.move();
    Robot.move();
    Robot.move();
    Robot.move();
    turnRight();
}
  
  public static void makeCheckered()
  {
    Robot.load("blank.txt");
    Robot.setDelay(0.05);
    
    //INSERT CODE HERE
    checker2Rows();
    Robot.move();
    checker2Rows();
    Robot.move();
    checker2Rows();
    Robot.move();
    checker2Rows();
  }
  //before: robot facing 2 light squares 
  //after: robot stands 2 squares from start, the first square is dark, the second is light
  public static void checker()
  {
      Robot.makeDark();
      Robot.move();
      Robot.move();
    }
  //before: robot faces a light row
  //after: robot stands at the end of a checkered row, facing north
    public static void checkerRow()
   {
       checker();
       checker();
       checker();
       Robot.makeDark();
       Robot.move();
       
}
    public static void checker2Rows()
   {turnRight();
    checkerRow();
    Robot.turnLeft();
    Robot.move();
    Robot.turnLeft();
    checkerRow();
    turnRight();
}
        
}
