import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUISeleccion extends JFrame implements ActionListener {
    private JTextField textField1;
    private JLabel labelPais;
    private JButton mostrarJugadoresButton;

    public GUISeleccion() {
        initGUISeleccion();
        setSize(600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    private void initGUISeleccion() {
        JPanel panel = new JPanel();
        JLabel labelimg = new JLabel(new ImageIcon("/home/sebastianll/Documents/intellij_IDEA/test/Datos/raw/aus.png"));

        JLabel label = new JLabel();
        label.setText("País:");
        JButton mostrarJugadoresButton = new JButton();
        mostrarJugadoresButton.setText("Ver Jugadores");

        panel.add(mostrarJugadoresButton);
        panel.add(label);
        panel.add(labelimg);

        this.add(panel);
        mostrarJugadoresButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Seleccion equipo = new Seleccion();
            }
        });

    }
    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
    }
}
