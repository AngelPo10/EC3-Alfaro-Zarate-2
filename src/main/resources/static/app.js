let stompClient = null;

function conectar() {
    let socket = new SockJS('/notificaciones');
    stompClient = Stomp.over(socket);
    stompClient.connect({}, function (frame) {
        console.log('Conectado: ' + frame);
        stompClient.subscribe('/topic/notificaciones', function (mensaje) {
            mostrarMensaje(JSON.parse(mensaje.body));
        });
    });
}

function enviarMensaje() {
    let emisor = document.getElementById("emisor").value;
    let mensaje = document.getElementById("mensaje").value;
    if (stompClient && emisor && mensaje) {
        let msgObj = { emisor: emisor, contenido: mensaje };
        stompClient.send("/app/enviar", {}, JSON.stringify(msgObj));
        document.getElementById("mensaje").value = "";
    }
}

function mostrarMensaje(msg) {
    let notificacionesDiv = document.getElementById("notificaciones");
    let p = document.createElement("p");
    p.innerText = msg.emisor + ": " + msg.contenido;
    notificacionesDiv.appendChild(p);
}

window.
