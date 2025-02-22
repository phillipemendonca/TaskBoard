package br.com.taskboardjava.dto;

import br.com.taskboardjava.persistence.entity.BoardColumnKindEnum;

public record BoardColumnInfoDTO(Long id, int order, BoardColumnKindEnum kind) {
}