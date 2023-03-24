package com.aanshik.NoteCrudMyBatis.Mapper;

import com.aanshik.NoteCrudMyBatis.Entity.Note;
import com.aanshik.NoteCrudMyBatis.Payloads.NoteDto;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface NoteMapper {

    @Insert("insert into note(description) values(#{description})")
    int createNote(Note note);

    @Select("Select * from note")
    List<Note> getAllNotes();

    @Update("UPDATE note SET description=#{note.description} WHERE id=#{noteId}")
    int updateNote(Note note,Integer noteId);

    @Delete("DELETE FROM note WHERE id=#{noteId}")
    int deleteNote(Integer noteId);

    @Select("SELECT * FROM note WHERE id=#{noteId}")
    Note getNoteById(Integer noteId);

}


