package guis;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditarPerfil extends Ventana implements ActionListener {
    JPanel panel = new FondoVentana("ImagenesFondo/Registro.jpg");
    public EditarPerfil(){
        this.setTitle("Registrar datos");
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setContentPane(panel);
        this.setLayout(null);


        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
