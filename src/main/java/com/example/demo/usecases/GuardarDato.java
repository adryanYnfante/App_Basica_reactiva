package com.example.demo.usecases;

import com.example.demo.dto.DatoDTO;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@FunctionalInterface
@Mapper

public interface GuardarDato {
    public Mono<String> apply(DatoDTO datoDTO);
}
