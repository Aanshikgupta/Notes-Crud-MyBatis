package com.aanshik.NoteCrudMyBatis.Entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Note {

    private Integer id;

    private String description;

    public Note(String description) {
        this.description = description;
    }
}
