PImage face;

void setup() {
     face = loadImage("face.jpeg");
     size(800,600);
    face.resize(800,600);
}

void draw() {
background(face);
  ellipse(199,268, 175,120);
  ellipse(82,80, 90,90);
  ellipse(mouseX,mouseY, 15,15);
  ellipse(mouseX,mouseY, 15,15);
  
}
