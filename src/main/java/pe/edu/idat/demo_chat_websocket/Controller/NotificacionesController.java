package pe.edu.idat.demo_chat_websocket.Controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import pe.edu.idat.demo_chat_websocket.Model.Notificaciones;

@Controller
public class NotificacionesController {

    @MessageMapping("/enviar")
    @SendTo("/topic/notificaciones")
    public Notificaciones enviarNotificacion(@Payload Notificaciones notificacion) {
        return notificacion;
    }
}



