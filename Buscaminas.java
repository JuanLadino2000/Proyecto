import acm.program.GraphicsProgram;
import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.*;

public class Buscaminas extends GraphicsProgram{
	private static final long serialVersionUID = 1L;
	public static int Size_W = 50;
	public static int Size_H = 50;
	GObject seleccionado;
	GPoint selected;
	GRect Tablero = new GRect(0, 0, Size_W*10, Size_H);
	public void BuildMap() {
		for (int i = 1; i <= 18; i++) {
			for (int j = 0; j < 10; j++) {
				GRect cuad = new GRect(j*Size_W, i*Size_H, Size_W, Size_H);
				cuad.setFillColor(Color.GRAY);
				cuad.setFilled(true);
				add(cuad);
			}
		}
	}
	public void init() {
		setBackground(Color.LIGHT_GRAY);
		Tablero.setFillColor(Color.LIGHT_GRAY);
		Tablero.setFilled(true);
		add(Tablero);
		setSize(Size_W*10+2, Size_H*18+2);
		BuildMap();
		addMouseListeners();
	}
	public void run() {
		while (true) {
			
		}
	}
	public void mouseClicked (MouseEvent e) {
		selected = new GPoint(e.getPoint());
		seleccionado = getElementAt(selected);
		if (e.getButton() == 1) {
			if ((seleccionado != null) && (seleccionado != Tablero) && ((GRect) seleccionado).getFillColor().equals(Color.GRAY)) {
				GRect newCuad = (GRect) seleccionado;
				newCuad.setFillColor(Color.LIGHT_GRAY);
				newCuad.setFilled(true);
				add(newCuad);
			}
		}
		else if (e.getButton() == 3) {
			if ((seleccionado != null) && (seleccionado != Tablero)) {
				if (((GRect) seleccionado).getFillColor().equals(Color.GRAY)) {
					double X = seleccionado.getLocation().getX();
					double Y = seleccionado.getLocation().getY();
					GRect indicador = new GRect(X, Y, Size_W, Size_H);
					indicador.setFilled(true);
					add(indicador);
				}
				else if (((GRect) seleccionado).getFillColor().equals(Color.BLACK)) {
					remove(seleccionado);
				}
			}
		}
	}
}