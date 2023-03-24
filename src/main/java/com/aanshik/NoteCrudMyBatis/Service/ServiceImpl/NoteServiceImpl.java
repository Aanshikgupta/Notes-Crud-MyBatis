package com.aanshik.NoteCrudMyBatis.Service.ServiceImpl;

import com.aanshik.NoteCrudMyBatis.Entity.Note;
import com.aanshik.NoteCrudMyBatis.Mapper.NoteMapper;
import com.aanshik.NoteCrudMyBatis.Payloads.NoteDto;
import com.aanshik.NoteCrudMyBatis.Service.NoteService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class NoteServiceImpl implements NoteService {

    @Autowired
    NoteMapper noteMapper;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public int createNote(NoteDto noteDto) {

        Note note = this.modelMapper.map(noteDto, Note.class);

        return noteMapper.createNote(note);
    }

    @Override
    public int updateNote(NoteDto noteDto, Integer noteId) {
        Note note = this.modelMapper.map(noteDto, Note.class);
        return noteMapper.updateNote(note, noteId);
    }

    @Override
    public int deleteNote(Integer noteId) {
        return noteMapper.deleteNote(noteId);
    }

    @Override
    public List<NoteDto> getAllNotes() {
        List<Note> noteList = noteMapper.getAllNotes();
        List<NoteDto> noteDtos = noteList.stream().map((note) -> this.modelMapper.map(note, NoteDto.class)).collect(Collectors.toList());
        return noteDtos;
    }

    @Override
    public NoteDto getNoteById(Integer noteId) {
        Note note = noteMapper.getNoteById(noteId);
        return this.modelMapper.map(note, NoteDto.class);
    }
}
