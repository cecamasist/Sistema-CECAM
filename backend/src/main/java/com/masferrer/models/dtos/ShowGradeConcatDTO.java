package com.masferrer.models.dtos;

import java.util.UUID;

import com.masferrer.models.entities.Shift;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ShowGradeConcatDTO {
    private UUID id;
    private String name;
    private String idGoverment;
    private String section;
    private Shift shift;
}
