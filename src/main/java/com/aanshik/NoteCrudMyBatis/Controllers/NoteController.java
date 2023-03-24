package com.aanshik.NoteCrudMyBatis.Controllers;

import com.aanshik.NoteCrudMyBatis.Entity.Note;
import com.aanshik.NoteCrudMyBatis.Payloads.NoteDto;
import com.aanshik.NoteCrudMyBatis.Service.NoteService;
import org.apache.ibatis.annotations.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notes")
public class NoteController {
    @Autowired
    NoteService noteService;

    @PostMapping("")
    public int createNote(@RequestBody NoteDto noteDto) {
        return noteService.createNote(noteDto);
    }

    @GetMapping("")
    public List<NoteDto> getAllNotes() {
        return noteService.getAllNotes();
    }

    @GetMapping("/{noteId}")
    public NoteDto getNoteById(@PathVariable Integer noteId) {
        return noteService.getNoteById(noteId);
    }

    @DeleteMapping("/{noteId}")
    public int deleteNoteById(@PathVariable Integer noteId) {
        return noteService.deleteNote(noteId);
    }

    @PutMapping("/{noteId}")
    public int updateNote(@RequestBody NoteDto noteDto, @PathVariable Integer noteId) {
        return noteService.updateNote(noteDto, noteId);

    }

}
