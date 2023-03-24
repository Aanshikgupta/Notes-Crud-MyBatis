package com.aanshik.NoteCrudMyBatis.Service;

import com.aanshik.NoteCrudMyBatis.Entity.Note;
import com.aanshik.NoteCrudMyBatis.Payloads.NoteDto;

import java.util.List;

public interface NoteService {

    public int createNote(NoteDto note);

    public int updateNote(NoteDto note, Integer noteId);

    public int deleteNote(Integer noteId);

    public List<NoteDto> getAllNotes();

    public NoteDto getNoteById(Integer noteId);
}
