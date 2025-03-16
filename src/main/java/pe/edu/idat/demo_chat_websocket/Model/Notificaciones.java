package pe.edu.idat.demo_chat_websocket.Model;

public class Notificaciones {
    private String contenido;
    private String emisor;

    public Notificaciones() {}

    public Notificaciones(String contenido, String emisor) {
        this.contenido = contenido;
        this.emisor = emisor;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }
}