package com.example.reactbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.reactbackend.entity.Note;

@Repository
public interface NotesRepository extends JpaRepository<Note, Long> {

}
