import java.awt.*;

import javax.swing.*;

import javax.swing.border.Border;



public class Main {

    private static void createAndShowGUI() {

        JFrame jFrame = new JFrame("Hola mundo");

        jFrame.setLayout(new FlowLayout());

        jFrame.setSize(500, 360);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        JLabel label = new JLabel("Hola mundo Swing");

        Border border = BorderFactory.createLineBorder(Color.BLACK);

        label.setBorder(border);

        label.setPreferredSize(new Dimension(150, 100));



        label.setText("Hola Mundo");

        label.setHorizontalAlignment(JLabel.RIGHT);

        label.setVerticalAlignment(JLabel.CENTER);

        label.setText("Ejemplo Swing");





        jFrame.add(label);

        jFrame.setVisible(true);

    }

    

  public static void main(String[] args) {

    createAndShowGUI();

  }

}

