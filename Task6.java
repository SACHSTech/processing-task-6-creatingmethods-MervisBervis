import processing.core.PApplet;

public class Task6 extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(1400, 1400);
  }

  /** 
   * Called once at the beginning of execution, put your background all in this method
   */
  public void setup() {
    background(120, 0, 255);
  }
  
  public void draw() {
  
  // Finds the x values for flowers
  for (int intX = 250; intX < 1150; intX += 200) { 

    // Finds the y values for flowers
  for (int intY = 150; intY < 650; intY += 300) {
   
  if (colourSwap(true)) {

  // Generates smiley face colours if mouse pressed
  drawFace(intX, intY, (intX / 30) + (intY / 15), (intX / 7) + (intY / 4), (intX / 2) + (intY / 1));

  //Generates stem colours if mouse pressed
  drawStem(intX, intY, (intX / 20) + (intY / 10), (intX / 50) + (intY / 22), (intX / 5) + (intY / 30));

  // Generates flower colours if mouse pressed
   drawFlower(intX, intY, (intX / 1) + (intY / 2), (intX / 4) + (intY / 8), (intX / 16) + (intY / 32));

   // Generates pistil colours if mouse pressed
   drawPistil(intX, intY, (intX / 5) + (intY / 2), (intX / 4) + (intY / 9), (intX / 10) + (intY / 8));
   
  }

  else {
   
  // Generates smiley face colours if mouse not pressed
  drawFace(intX, intY, (intX / 30) + (intY / 15), (intX / 7) + (intY / 4), (intX / 2) + (intY / 1));

  //Generates stem colours if mouse not pressed
  drawStem (intX, intY, (intX / 1) + (intY / 1), (intX / 50) + (intY / 22), (intX / 37) + (intY / 3));

  // Generates flower colours if mouse not pressed
  drawFlower(intX, intY, (intX / 8) + (intY / 15), (intX / 50) + (intY / 22), (intX / 37) + (intY / 3));
  
  // Generates pistil colours if mouse not pressed
   drawPistil(intX, intY, (intX / 14) + (intY / 1), (intX / 7) + (intY / 7), (intX / 5) + (intY / 3));

      }
    }
  }
}


public void drawFlower(int intFlowerX , int intFlowerY, int intRed, int intGreen, int intBlue) {

// Prints the bottom most flower petal
fill(intRed, intGreen, intBlue);
ellipse(intFlowerX, intFlowerY - 5, 55, 55);
stroke(256);

// Prints the right most flower petal
fill(intRed, intGreen, intBlue);
ellipse(intFlowerX + 30, intFlowerY - 40, 55, 55);
stroke(256);

// Prints the left most flower petal
fill(intRed, intGreen, intBlue);
ellipse(intFlowerX - 30, intFlowerY - 40, 55, 55);
stroke(256);

// Prints the top most flower petal
fill(intRed, intGreen, intBlue);
ellipse(intFlowerX, intFlowerY - 75, 55, 55);
stroke(256);}

public void drawStem(int intFlowerX , int intFlowerY, int intRed, int intGreen, int intBlue) {

// Print flower stem
fill(intRed, intGreen, intBlue);
rect(intFlowerX - 4, intFlowerY, 9, 90);
stroke(256);

// Prints the stem petal
fill(intRed, intGreen, intBlue);
ellipse(intFlowerX + 7, intFlowerY + 45, 20, 15);
stroke(256);}

public void drawPistil(int intFlowerX , int intFlowerY, int intRed, int intGreen, int intBlue) {

// Prints the pistil of the flower
fill(intRed, intGreen, intBlue);
ellipse(intFlowerX, intFlowerY - 40, 35, 35);
stroke(256);}

public void drawFace(int intFlowerX , int intFlowerY, int intRed, int intGreen, int intBlue) {

// Prints the outside of the smiley face
fill(intRed, intGreen, intBlue);
ellipse(intFlowerX, intFlowerY - 150, 100, 35);
stroke(256);}

public boolean colourSwap(boolean MousePressed) {

  // Determine output if a mouse was pressed
  if (mousePressed == true) {
    return true;}
    else {
    return false;}

  }
}

  
