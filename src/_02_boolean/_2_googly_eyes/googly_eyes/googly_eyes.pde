PImage face;

void setup() {
     face = loadImage("face.jpeg");
     size(800,600);
    face.resize(800,600);
}

void draw() {
background(face);
  ellipse(210,278, 344,190);
  ellipse(582,278, 341,194);
  fill(#080606);
  
  ellipse(mouseX ,mouseY, 30,30);
  ellipse(176 ,mouseY, 30,30);
  fill(#FFFFFF);
  
}
