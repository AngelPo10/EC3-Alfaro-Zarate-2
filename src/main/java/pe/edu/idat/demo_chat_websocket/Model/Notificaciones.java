package pe.edu.idat.demo_chat_websocket.Model;

public class Notificaciones {
    private  String mensaje;

    public Notificaciones() {

    }
    public Notificaciones(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
