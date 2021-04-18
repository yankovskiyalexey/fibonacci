package week2;

import java.awt.Color;

import acm.graphics.GFillable;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class RobotFace extends GraphicsProgram {

	public void run() {
		double HEAD_WIDTH = 0.3 * getWidth();
		double HEAD_HEIGHT = 0.7 * getHeight();
		double EYE_RADIUS = 0.2 * HEAD_WIDTH;
		double MOUTH_WIDTH = 0.6 * HEAD_WIDTH;
		double MOUTH_HEIGHT = 0.3 * HEAD_WIDTH;

		double startY = getHeight() / 2;
		double startX = getWidth() / 2;
		double HEADX = startX - HEAD_WIDTH / 2;
		double HEADY = startY - HEAD_HEIGHT / 2;

		// ** Plot Head
		GRect head = new GRect(startX - (.15 * getWidth()), .15 * getHeight(), 0.3 * getWidth(), .7 * getHeight());
		fillObj(head, Color.gray);
		add(head);

		// ** Plot Eyes
		GOval eye1 = new GOval(HEADX + .25 * HEAD_WIDTH, startY - .25 * HEAD_WIDTH, EYE_RADIUS, EYE_RADIUS);
		fillObj(eye1, Color.YELLOW);
		add(eye1);
		GOval eye2 = new GOval((HEADX + .75 * HEAD_WIDTH) - EYE_RADIUS, startY - .25 * HEAD_WIDTH, EYE_RADIUS,
				EYE_RADIUS);
		fillObj(eye2, Color.YELLOW);
		add(eye2);

		// ** Plot Mouth
		GRect mouth = new GRect(HEADX + .2 * HEAD_WIDTH, HEADY + (.75 * HEAD_HEIGHT), MOUTH_WIDTH, MOUTH_HEIGHT);
		fillObj(mouth, Color.WHITE);
		add(mouth);

	}

	public void fillObj(GFillable a, Color argC) {
		a.setFillColor(argC);
		a.setFilled(true);
	}

}