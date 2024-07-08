package com.nailton.forumhub.domain.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoTopico(@NotNull String titulo, @NotNull
                                     String mensagem) {
}