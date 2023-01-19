package com.example.mvc.controller;

import com.example.mvc.domain.Board;
import com.example.mvc.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class BoardController {
    @Autowired
    public BoardService service;

    @GetMapping()
    public List<Board> getList() {
        return service.getList();
    }

    @GetMapping("/{boardSeq}")
    private Board get(@PathVariable int boardSeq) {
        return service.get(boardSeq);
    }

    @GetMapping("/save")
    private void save(Board board) {
        service.save(board);
    }

    @GetMapping("/delete/{boardSeq}")
    private void delete(@PathVariable int boardSeq) {
        service.delete(boardSeq);
    }
}



