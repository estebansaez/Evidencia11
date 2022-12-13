package datos;

import modelo.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BuscarDatos {
    private List<Usuario> usuarios;
    public static String rutaCuentas = "BaseDatos/cuentas.txt";
    public static String rutaUfro= "BaseDatos/CorreosUfro.txt";



    /*public static boolean buscarCorreo(String correo, String ruta) {
        ArrayList<ArrayList<String>> usuarios;
        usuarios = GestorDatos.leerArchivo(ruta);
        ArrayList<String> datos;
        boolean valido = false;
        for (int i = 0; i < usuarios.size(); i++) {
            datos = usuarios.get(i);
            if ((Objects.equals(datos.get(0), correo))) {
                valido = true;
                break;
            }
        }
        return valido;
    }*/


    /*public static ArrayList<String> arrayDatos(String correo, String ruta){
        ArrayList<ArrayList<String>> usuarios;
        usuarios = GestorDatos.leerArchivo(ruta);
        ArrayList<String> datos= new ArrayList<>();
        for (int i = 0; i < usuarios.size(); i++) {
            datos = usuarios.get(i);
            if ((Objects.equals(datos.get(0), correo))) {
                datos = usuarios.get(i);
                break;
            }
        }
        return datos;
    }

    public static String getDatos(String correo, int dato, String ruta){
        return arrayDatos(correo,ruta).get(dato);
    }*/
}
