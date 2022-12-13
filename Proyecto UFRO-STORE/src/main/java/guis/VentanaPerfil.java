package guis;

import datos.BuscarDatos;
import datos.GestorDatos;
import modelo.Store;
import modelo.Usuario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPerfil extends Ventana implements ActionListener {
    Store store;
    JPanel panel = new  FondoVentana("ImagenesFondo/FondoPerfil.jpg");
    JLabel datos;
    JButton volverMenu;
    JButton salir;
    JButton editarPerfil;
    String correo;

    public VentanaPerfil(String correo, Store store){
        this.setTitle("Perfil");
        this.setSize(1200,700);
        this.setContentPane(panel);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.correo=correo;
        this.store=store;
        this.generarEtiqueta("Productos subidos",Color.black,23,700, 110, 400, 25);
        datos = this.generarEtiqueta("Datos del perfil",Color.black,23,140, 110, 400, 25);
        this.etiquetaDatos("Correo UFRO: ",Color.black,20,50,160,300,25);
        this.etiquetaDatos(datos(correo)[0],Color.black,20,50, 190, 500, 30);
        this.etiquetaDatos("Contraseña: "+datos(correo)[1],Color.black,20,50, 240, 500, 25);
        this.etiquetaDatos("Nombre de perfil: "+datos(correo)[2],Color.black,20,50, 290, 500, 25);
        this.etiquetaDatos("Numero celular: "+datos(correo)[3],Color.black,20,50, 340, 500, 25);
        editarPerfil=this.generarBoton("Editar Datos",180,370,150,25);
        volverMenu = this.generarBoton("Volver menu",180,20,150,25);
        salir = this.generarBoton("Cerrar sesion", 180,60,150,25);
        editarPerfil.addActionListener(this);
        volverMenu.addActionListener(this);
        salir.addActionListener(this);
        this.setVisible(true);
    }

    private String[] datos(String correo){
        String[] d= new String[4];
        for (Usuario u: store.getUsuarios()) {
            if(u.getCorreo().equals(correo)) {
                d[0]= u.getCorreo();
                d[1]= u.getContrasena();
                d[2]= u.getNombre();
                d[3]= u.getnCelular();
            }
        }
        return d;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== volverMenu){
            new MenuPrincipal(correo, this.store);
            this.dispose();
        }
        if(e.getSource()==salir){
            new VentanaInicial(this.store);
            this.dispose();
        }
        if(e.getSource()==editarPerfil){
            System.out.println("No se pudo");
        }
    }
}
