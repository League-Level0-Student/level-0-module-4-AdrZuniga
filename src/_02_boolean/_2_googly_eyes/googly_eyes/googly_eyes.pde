PImage face;

void setup() {
     face = loadImage("face.jpeg");
     size(800,600);
    face.resize(800,600);
}
int x = 435;
int y = 282;
//
void draw() {
background(face);
  ellipse(210,278, 344,190);
  ellipse(582,278, 341,194);
  fill(#080606);
  
  ellipse(mouseX ,mouseY, 45,45);
  ellipse(176 ,mouseY, 45, 45);
  fill(#FFFFFF);
  
  
 if(mousePressed){
   println("mouseX "+ mouseX + " mouseY " + mouseY);
 }
  
   
}
