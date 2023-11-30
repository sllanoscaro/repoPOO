import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUISeleccion extends JFrame implements ActionListener {
    private JTextField textField1;
    private JButton mostrarJugadoresButton;

    public GUISeleccion() {
        initGUISeleccion();
        setSize(600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    private void initGUISeleccion() {
        JPanel panel = new JPanel();
        JTextField textField = new JTextField(10);
        JButton mostrarJugadoresButton = new JButton();
        mostrarJugadoresButton.setText("Ver Jugadores");


        panel.add(textField);
        panel.add(mostrarJugadoresButton);

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
