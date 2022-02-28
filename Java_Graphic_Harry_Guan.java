//This file is created by Haoran(harry) Guan
package Unit2_submission;


import java.awt.geom.*;
import java.awt.*;
import javax.swing.*;

import javax.swing.JFrame;

public class Java_Graphic_Harry_Guan extends JFrame{
	public void paint(Graphics g){
		// Values used to adjust position of picture
		
		Graphics2D ga = (Graphics2D)g;		
		ga.setColor(new Color (1,1,1));
		ga.fill(rec(0,0,640,480));
		
	// Circle Background 
		// Right Semi-circle 
		ga.setColor(new Color (239,232,239));
		ga.fill (circ(170, 90, 300, 300));
					
		// Left Semi-circle
		Arc2D.Double arc1 = new Arc2D.Double (170, 90, 300, 300, 90,180,Arc2D.OPEN);
		ga.setColor(new Color (117,158,242));
		ga.fill(arc1);
				

		// Title
		ga.setFont(new Font ("Consolas", Font.BOLD, 50));
		ga.setPaint(Color.white);
		ga.drawString("Ironman", 15, 85);
		
		// By:
		ga.setFont(new Font ("Lucida Sans", Font.BOLD, 10));
		ga.drawString("By: Harry Guan, 2020/02", 260, 435);
		
		//head
		GeneralPath head = new GeneralPath();
		ga.setColor(Color.black);
		head.moveTo(320,113);
	    head.curveTo(260,120,265,170,265,170);
	    head.curveTo(260,220,310,230,310,230);
	    head.curveTo(350,230,370,190,370,190);
	    head.curveTo(380,140,340,118,340,118);
	    head.curveTo(330,114,320,113,320,113);
	    ga.draw(head);
	    ga.setColor(Color.red);
	    ga.fill(head);
		
	    //face
	    GeneralPath face = new GeneralPath();
		ga.setColor(Color.black);
		face.moveTo(273,140);
	    face.lineTo(285,134);
	    face.lineTo(287,152);
	    face.lineTo(300,152);
	    face.lineTo(306,132);
	    face.lineTo(330,140);
	    face.lineTo(340,210);
	    face.lineTo(310,220);
	    face.lineTo(307,215);
	    face.lineTo(282,215);
	    face.curveTo(262,200,265,170,265,170);
	    face.curveTo(262,154,273,140,273,140);
	    ga.draw(face);
	    ga.setColor(Color.yellow);
	    ga.fill(face);
	    
	    //chin
	    GeneralPath chin = new GeneralPath();
		ga.setColor(Color.black);
		chin.moveTo(282,215);
	    chin.curveTo(286,223,310,230,310,230);
	    chin.curveTo(328,230,330,226,330,226);
		chin.lineTo(323,216);
		chin.lineTo(310,220);
		chin.lineTo(307,215);
		chin.lineTo(282,215);
	    ga.draw(chin);
	    ga.setColor(Color.yellow);
	    ga.fill(chin);
		
	    //lines
	    GeneralPath line = new GeneralPath();
	    ga.setColor(Color.black);
	    line.moveTo(265,171);
	    line.curveTo(275,182,320,169,320,169);
	    ga.draw(line);
	    
		//left eyes
	    GeneralPath eye = new GeneralPath();
		ga.setColor(Color.black);
		eye.moveTo(265,171);
	    eye.curveTo(272,176,280,176,280,176);
		eye.lineTo(280,186);
		eye.lineTo(266,183);
	    ga.draw(eye);
	    ga.setColor(Color.white);
	    ga.fill(eye);
	    
	    //right eyes
	    GeneralPath eye1 = new GeneralPath();
		ga.setColor(Color.black);
		eye1.moveTo(300,174);
	    eye1.curveTo(310,173,320,169,320,169);
		eye1.lineTo(320,182);
		eye1.lineTo(298,185);
		eye1.lineTo(296,175);
	    ga.draw(eye1);
	    ga.setColor(Color.white);
	    ga.fill(eye1);

	    //inner ear
	    ga.setColor(Color.black);
	    int width = 20;
	    int height = 40;
	    circ(345,160,width,height);
	    ga.rotate(Math.toRadians(23), 345 + width / 2, 160 + height / 2);
	    ga.draw(circ(345,160,width,height));
	    
	    //outer ear
	    ga.setColor(Color.black);
	    ga.draw( new Arc2D.Double(342, 160, width, height , -90, -180, Arc2D.OPEN));
	    
	    //gap on the head
	    GeneralPath gap = new GeneralPath();
		ga.setColor(Color.black);
		gap.moveTo(316,152);
	    gap.curveTo(320,136,330,132,330,132);
	    ga.draw(gap);
	    
	    //body
	    GeneralPath body = new GeneralPath();
		ga.setColor(Color.black);
		body.moveTo(318,245);
		body.lineTo(317,255);
		body.lineTo(340,265);
		body.lineTo(360,255);
	    body.lineTo(370,235);
	    body.lineTo(360,222);
	    body.curveTo(340,245,318,245,318,245);
	    ga.draw(body);
	    ga.setColor(Color.red);
	    ga.fill(body);
	    ga.setColor(Color.black);
	    body.moveTo(322,246);
	    body.lineTo(322,257);
	    ga.draw(body);
	    body.moveTo(370,235);
	    
	    //arm
	    GeneralPath arm = new GeneralPath();
	    ga.setColor(Color.black);
	    arm.moveTo(365, 211);
	    arm.curveTo(384,225,382,230,382,230);
	    arm.lineTo(370, 235);
	    arm.lineTo(360,222);
	    arm.curveTo(370,206,365,211,365,211);
	    arm.moveTo(325,265);
	    arm.lineTo(320,265);
	    arm.lineTo(330,285);
	    arm.lineTo(332,285);
	    arm.moveTo(380,240);
	    arm.lineTo(387,240);
	    arm.lineTo(395,257);
	    arm.curveTo(385,290,360,261,360,261);
	    ga.draw(arm);
	    ga.setColor(Color.red);
	    ga.fill(arm);
	    
	    //shoulder
	    GeneralPath rs = new GeneralPath();
	    ga.setColor(Color.black);
	    rs.moveTo(370, 235);
	    rs.lineTo(376, 245);
	    rs.lineTo(387, 240);
	    rs.lineTo(381, 231);
	    rs.moveTo(322,257);
	    rs.lineTo(317,255);
	    rs.lineTo(320,265);
	    rs.lineTo(325,265);
	    rs.closePath();
	    ga.draw(rs);
	    ga.setColor(Color.yellow);
	    ga.fill(rs);
	    
	    //main body
	    GeneralPath mb = new GeneralPath();
	    ga.setColor(Color.black);
	    mb.moveTo(322,257);
	    mb.lineTo(340,265);
		mb.lineTo(360,255);
	    mb.lineTo(370,235);
	    mb.lineTo(386,260);
	    mb.lineTo(375,290);
	    mb.lineTo(365,295);
	    mb.lineTo(332,285);
	    mb.lineTo(322,257);
	    ga.draw(mb);
	    ga.setColor(Color.red);
	    ga.fill(mb);
	    
	    //legs
	    GeneralPath l = new GeneralPath();
	    ga.setColor(Color.black);
	    l.moveTo(332,285);
	    l.lineTo(365,295);
	  	l.lineTo(364,310);
	  	l.lineTo(355,314);
	  	l.lineTo(350,310);
	  	l.lineTo(346,311);
	  	l.closePath();
	  	l.moveTo(386,260);
	  	l.lineTo(375,290);
	  	l.lineTo(385,298);
	  	l.lineTo(393,294);
	  	l.lineTo(394,286);
	  	l.lineTo(395,280);
	  	l.closePath();
	    ga.draw(l);
	    ga.setColor(Color.yellow);
	    ga.fill(l);
	    
	    //feet
	    GeneralPath f = new GeneralPath();
	    ga.setColor(Color.black);
	    f.moveTo(346,311);
	    f.lineTo(350,310);
	    f.lineTo(355,314);
	    f.lineTo(364,310);
	    f.lineTo(365,320);
	    f.lineTo(354,325);
	    f.closePath();
	    f.moveTo(385,298);
	    f.lineTo(393,294);
	  	f.lineTo(396,281);
	  	f.lineTo(405,303);
	  	f.lineTo(395,307);
	  	f.closePath();
	    ga.draw(f);
	    ga.setColor(Color.red);
	    ga.fill(f);
	    
	    //power engine
	    ga.setColor(Color.black);
	    ga.draw(circ(343,243,7,7));
	    ga.setColor(new Color (247,251,255));
	    ga.fill(circ(343,243,7,7));   
	}
	      
	//Methods to call when draw line
		public static Shape rec(int a, int b, int c, int d){
			Rectangle2D.Double rectangle = new Rectangle2D.Double(a,b,c,d);
			return rectangle;
		}
		public static Shape circ(int a, int b, int c, int d){
			Ellipse2D.Float circle = new Ellipse2D.Float(a, b, c, d);
			return circle;
		}
		public static Shape line(int a, int b, int c, int d){
			Line2D.Float line1 = new Line2D.Float (a, b,c, d);
			return line1;
		}
		public static Shape qCurve(int a, int b, int c, int d, int e, int f){
			QuadCurve2D.Float curve = new QuadCurve2D.Float(a,b,c,d,e,f);
			return curve;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new Java_Graphic_Harry_Guan();
	    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE); 
	    frame.setTitle("Ironman by Harry Guan");
	    frame.setSize (640,480); 
	    frame.setVisible (true);
	}

}
