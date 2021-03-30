import javax.swing.*;
import java.awt.*;

public class Graficadora {
    //Importante, plano debe ser publico y estatico
    public static plano plano;

    public void Dibujar() {

        //Creando la ventana y el plano de dibujo
        Ventana frame = new Ventana();
        frame.setDefaultCloseOperation(Ventana.EXIT_ON_CLOSE);
        frame.setBounds(550, 100, 410, 600);
        frame.setLayout(new BorderLayout());
        plano = new plano();

        //Configuración del Boton Iniciar
        JButton start = new JButton("Iniciar");
        start.addActionListener(frame);
        start.setText("Iniciar");

        //Configuración del Boton Ordenado descendente
        JButton start1 = new JButton("Ordenado descendente");
        start1.addActionListener(frame);
        start1.setText("Ordenado descendente");
        start1.setLayout(null);
        start1.setLocation(0, 0);
        
        //Configuración del Boton Ordenado Ascendente
        JButton start2 = new JButton("Ordenado Ascendente");
        start2.addActionListener(frame);
        start2.setText("Ordenado Ascendente");

        //Configuración del Boton Aleatoriamente
        JButton start3 = new JButton("Aleatoriamente");
        start3.addActionListener(frame);
        start3.setText("Aleatoriamente");
        

        //Bordes al panel
        frame.add( plano, BorderLayout.CENTER);
        frame.add(start, BorderLayout.SOUTH);
        frame.add(start1);
       // frame.add(start2);
       // frame.add(start3);
        frame.setVisible( true );
    }
}