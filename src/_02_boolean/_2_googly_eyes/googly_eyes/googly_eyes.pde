PImage face;

void setup() {
     face = loadImage("face.jpeg");
     size(800,600);
    face.resize(800,600);
}
int x = 435;
int y = 282;
// x = 431 y = 199
// x = 734 y = 357

void draw() {
background(face);
  ellipse(210,278, 344,190);
  ellipse(582,278, 341,194);
  fill(#080606);
  
  ellipse(x ,Y, 45,45);
  ellipse(x ,Y, 45, 45);
  fill(#FFFFFF);
  if(mouseX > 431 & mouseX < 734)
  
 if(mousePressed){
   println("mouseX "+ mouseX + " mouseY " + mouseY);
 }
  
   
}
