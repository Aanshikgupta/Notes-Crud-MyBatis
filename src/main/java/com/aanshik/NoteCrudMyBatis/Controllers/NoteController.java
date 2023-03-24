package com.aanshik.NoteCrudMyBatis.Controllers;

import com.aanshik.NoteCrudMyBatis.Entity.Note;
import com.aanshik.NoteCrudMyBatis.Payloads.NoteDto;
import com.aanshik.NoteCrudMyBatis.Service.NoteService;
import org.apache.coyote.Response;
import org.apache.ibatis.annotations.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notes")
public class NoteController {
    @Autowired
    NoteService noteService;

    @PostMapping("")
    public ResponseEntity<Integer> createNote(@RequestBody NoteDto noteDto) {
        return new ResponseEntity<>(noteService.createNote(noteDto), HttpStatus.CREATED);
    }

    @GetMapping("")
    public ResponseEntity<List<NoteDto>> getAllNotes() {
        return new ResponseEntity<>(noteService.getAllNotes(), HttpStatus.OK);
    }

    @GetMapping("/{noteId}")
    public ResponseEntity<NoteDto> getNoteById(@PathVariable Integer noteId) {
        return new ResponseEntity<>(noteService.getNoteById(noteId), HttpStatus.OK);
    }

    @DeleteMapping("/{noteId}")
    public ResponseEntity<Integer> deleteNoteById(@PathVariable Integer noteId) {
        return new ResponseEntity<>(noteService.deleteNote(noteId), HttpStatus.OK);
    }

    @PutMapping("/{noteId}")
    public ResponseEntity<Integer> updateNote(@RequestBody NoteDto noteDto, @PathVariable Integer noteId) {
        return new ResponseEntity<>(noteService.updateNote(noteDto, noteId), HttpStatus.OK);

    }

}
