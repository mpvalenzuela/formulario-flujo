package cl.seccion121.myapplication;

import java.io.Serializable;

public class Usuario implements Serializable {
    private String usuario;
    private int edad;
    private String correo;

    public Usuario(String usuario, int edad, String correo) {
        this.usuario = usuario;
        this.edad = edad;
        this.correo = correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
