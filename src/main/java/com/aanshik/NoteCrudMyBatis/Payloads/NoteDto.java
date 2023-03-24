package com.aanshik.NoteCrudMyBatis.Payloads;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NoteDto {

    private Integer id;

    private String description;

    public NoteDto(String description) {
        this.description = description;
    }
}
