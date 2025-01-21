package com.API.foroHub.domain.topico;

import com.API.foroHub.domain.curso.DatosRespuestaCurso;
import com.API.foroHub.domain.respuesta.DatosRegistroRespuesta;
import com.API.foroHub.domain.usuario.DatosRespuestaUsuario;

import java.time.LocalDateTime;
import java.util.List;

public record DatosDetalleTopico(
        Long id,
        String titulo,
        DatosRespuestaCurso curso,
        Estado status,
        LocalDateTime fecha,
        DatosRespuestaUsuario autor,
        String mensaje,
        List<DatosRegistroRespuesta> respuestas

) {
}
